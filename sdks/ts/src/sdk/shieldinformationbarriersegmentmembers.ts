import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class ShieldInformationBarrierSegmentMembers {
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
   * deleteShieldInformationBarrierSegmentMembersId - Delete shield information barrier segment member by ID
   *
   * Deletes a shield information barrier
   * segment member based on provided ID.
  **/
  deleteShieldInformationBarrierSegmentMembersId(
    req: operations.DeleteShieldInformationBarrierSegmentMembersIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.DeleteShieldInformationBarrierSegmentMembersIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.DeleteShieldInformationBarrierSegmentMembersIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/shield_information_barrier_segment_members/{shield_information_barrier_segment_member_id}", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    let retryConfig = req.retries;
    if (!retryConfig) {
      retryConfig = new utils.RetryConfig("backoff", true);
      retryConfig.backoff = new utils.BackoffConfig(500, 60000, 1.5, 3600000);
    } 
    const r = utils.Retry(() => {
      return client.request({
        url: url,
        method: "delete",
        ...config,
      });
    }, new utils.Retries(retryConfig, [
      "5XX"
    ]));
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.DeleteShieldInformationBarrierSegmentMembersIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 204:
            break;
          case httpRes?.status == 404:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
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
   * getShieldInformationBarrierSegmentMembers - List shield information barrier segment members
   *
   * Lists shield information barrier segment members
   * based on provided segment IDs.
  **/
  getShieldInformationBarrierSegmentMembers(
    req: operations.GetShieldInformationBarrierSegmentMembersRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetShieldInformationBarrierSegmentMembersResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetShieldInformationBarrierSegmentMembersRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/shield_information_barrier_segment_members";
    
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
        const res: operations.GetShieldInformationBarrierSegmentMembersResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.getShieldInformationBarrierSegmentMembers200ApplicationJSONObject = httpRes?.data;
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
   * getShieldInformationBarrierSegmentMembersId - Get shield information barrier segment member by ID
   *
   * Retrieves a shield information barrier
   * segment member by its ID.
  **/
  getShieldInformationBarrierSegmentMembersId(
    req: operations.GetShieldInformationBarrierSegmentMembersIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetShieldInformationBarrierSegmentMembersIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetShieldInformationBarrierSegmentMembersIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/shield_information_barrier_segment_members/{shield_information_barrier_segment_member_id}", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    let retryConfig = req.retries;
    if (!retryConfig) {
      retryConfig = new utils.RetryConfig("backoff", true);
      retryConfig.backoff = new utils.BackoffConfig(500, 60000, 1.5, 3600000);
    } 
    const r = utils.Retry(() => {
      return client.request({
        url: url,
        method: "get",
        ...config,
      });
    }, new utils.Retries(retryConfig, [
      "5XX"
    ]));
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetShieldInformationBarrierSegmentMembersIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.shieldInformationBarrierSegmentMember = httpRes?.data;
            }
            break;
          case httpRes?.status == 404:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
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
   * postShieldInformationBarrierSegmentMembers - Create shield information barrier segment member
   *
   * Creates a new shield information barrier segment member.
  **/
  postShieldInformationBarrierSegmentMembers(
    req: operations.PostShieldInformationBarrierSegmentMembersRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostShieldInformationBarrierSegmentMembersResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostShieldInformationBarrierSegmentMembersRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/shield_information_barrier_segment_members";

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req);
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...reqBodyHeaders, ...config?.headers};
    
    let retryConfig = req.retries;
    if (!retryConfig) {
      retryConfig = new utils.RetryConfig("backoff", true);
      retryConfig.backoff = new utils.BackoffConfig(500, 60000, 1.5, 3600000);
    } 
    const r = utils.Retry(() => {
      return client.request({
        url: url,
        method: "post",
        headers: headers,
        data: reqBody, 
        ...config,
      });
    }, new utils.Retries(retryConfig, [
      "5XX"
    ]));
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.PostShieldInformationBarrierSegmentMembersResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 201:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.shieldInformationBarrierSegmentMember = httpRes?.data;
            }
            break;
          case httpRes?.status == 404:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
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
