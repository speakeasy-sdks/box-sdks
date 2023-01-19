import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class Events {
  _defaultClient: AxiosInstance;
  _securityClient: AxiosInstance;
  _serverURL: string;
  _language: string;
  _sdkVersion: string;
  _genVersion: string;

  constructor(defaultClient: AxiosInstance, securityClient: AxiosInstance, serverURL: string, language: string, sdkVersion: string, genVersion: string) {
    this._defaultClient = defaultClient;
    this._securityClient = securityClient;
    this._serverURL = serverURL;
    this._language = language;
    this._sdkVersion = sdkVersion;
    this._genVersion = genVersion;
  }
  
  /**
   * getEvents - List user and enterprise events
   *
   * Returns up to a year of past events for a given user
   * or for the entire enterprise.
   * 
   * By default this returns events for the authenticated user. To retrieve events
   * for the entire enterprise, set the `stream_type` to `admin_logs_streaming`
   * for live monitoring of new events, or `admin_logs` for querying across
   * historical events. The user making the API call will
   * need to have admin privileges, and the application will need to have the
   * scope `manage enterprise properties` checked.
  **/
  getEvents(
    req: operations.GetEventsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetEventsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetEventsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/events";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    let retryConfig = req.retries;
    if (!retryConfig) {
      retryConfig = new utils.RetryConfig("backoff", true);
      retryConfig.backoff = new utils.BackoffConfig(500, 60000, 1.5, 3600000);
    } 
    const r = utils.Retry(() => {
      return client.request({
        url: url,
        method: "get",
        ...requestConfig,
      });
    }, new utils.Retries(retryConfig, [
      "5XX"
    ]));
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetEventsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.events = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * optionsEvents - Get events long poll endpoint
   *
   * Returns a list of real-time servers that can be used for long-polling updates
   * to the [event stream](#get-events).
   * 
   * Long polling is the concept where a HTTP request is kept open until the
   * server sends a response, then repeating the process over and over to receive
   * updated responses.
   * 
   * Long polling the event stream can only be used for user events, not for
   * enterprise events.
   * 
   * To use long polling, first use this endpoint to retrieve a list of long poll
   * URLs. Next, make a long poll request to any of the provided URLs.
   * 
   * When an event occurs in monitored account a response with the value
   * `new_change` will be sent. The response contains no other details as
   * it only serves as a prompt to take further action such as sending a
   * request to the [events endpoint](#get-events) with the last known
   * `stream_position`.
   * 
   * After the server sends this response it closes the connection. You must now
   * repeat the long poll process to begin listening for events again.
   * 
   * If no events occur for a while and the connection times out you will
   * receive a response with the value `reconnect`. When you receive this response
   * you’ll make another call to this endpoint to restart the process.
   * 
   * If you receive no events in `retry_timeout` seconds then you will need to
   * make another request to the real-time server (one of the URLs in the response
   * for this endpoint). This might be necessary due to network errors.
   * 
   * Finally, if you receive a `max_retries` error when making a request to the
   * real-time server, you should start over by making a call to this endpoint
   * first.
  **/
  optionsEvents(
    req: operations.OptionsEventsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.OptionsEventsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.OptionsEventsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/events";
    
    const client: AxiosInstance = this._securityClient!;
    
    
    let retryConfig = req.retries;
    if (!retryConfig) {
      retryConfig = new utils.RetryConfig("backoff", true);
      retryConfig.backoff = new utils.BackoffConfig(500, 60000, 1.5, 3600000);
    } 
    const r = utils.Retry(() => {
      return client.request({
        url: url,
        method: "options",
        ...config,
      });
    }, new utils.Retries(retryConfig, [
      "5XX"
    ]));
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.OptionsEventsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.realtimeServers = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

}
