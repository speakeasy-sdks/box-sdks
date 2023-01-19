import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class ShieldInformationBarrierSegments {
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
   * deleteShieldInformationBarrierSegmentsId - Delete shield information barrier segment
   *
   * Deletes the shield information barrier segment
   * based on provided ID.
  **/
  deleteShieldInformationBarrierSegmentsId(
    req: operations.DeleteShieldInformationBarrierSegmentsIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.DeleteShieldInformationBarrierSegmentsIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.DeleteShieldInformationBarrierSegmentsIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/shield_information_barrier_segments/{shield_information_barrier_segment_id}", req.pathParams);
    
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
        const res: operations.DeleteShieldInformationBarrierSegmentsIdResponse = {statusCode: httpRes.status, contentType: contentType};
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
   * getShieldInformationBarrierSegments - List shield information barrier segments
   *
   * Retrieves a list of shield information barrier segment objects
   * for the specified Information Barrier ID.
  **/
  getShieldInformationBarrierSegments(
    req: operations.GetShieldInformationBarrierSegmentsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetShieldInformationBarrierSegmentsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetShieldInformationBarrierSegmentsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/shield_information_barrier_segments";
    
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
        const res: operations.GetShieldInformationBarrierSegmentsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.getShieldInformationBarrierSegments200ApplicationJSONObject = httpRes?.data;
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
   * getShieldInformationBarrierSegmentsId - Get shield information barrier segment with specified ID
   *
   * Retrieves shield information barrier segment based on provided ID..
  **/
  getShieldInformationBarrierSegmentsId(
    req: operations.GetShieldInformationBarrierSegmentsIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetShieldInformationBarrierSegmentsIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetShieldInformationBarrierSegmentsIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/shield_information_barrier_segments/{shield_information_barrier_segment_id}", req.pathParams);
    
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
        const res: operations.GetShieldInformationBarrierSegmentsIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.shieldInformationBarrierSegment = httpRes?.data;
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
   * postShieldInformationBarrierSegments - Create shield information barrier segment
   *
   * Creates a shield information barrier segment.
  **/
  postShieldInformationBarrierSegments(
    req: operations.PostShieldInformationBarrierSegmentsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostShieldInformationBarrierSegmentsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostShieldInformationBarrierSegmentsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/shield_information_barrier_segments";

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
        const res: operations.PostShieldInformationBarrierSegmentsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 201:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.shieldInformationBarrierSegment = httpRes?.data;
            }
            break;
          case httpRes?.status == 404:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
          case httpRes?.status == 409:
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
   * putShieldInformationBarrierSegmentsId - Update shield information barrier segment with specified ID
   *
   * Updates the shield information barrier segment based on provided ID..
  **/
  putShieldInformationBarrierSegmentsId(
    req: operations.PutShieldInformationBarrierSegmentsIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PutShieldInformationBarrierSegmentsIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PutShieldInformationBarrierSegmentsIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/shield_information_barrier_segments/{shield_information_barrier_segment_id}", req.pathParams);

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
        method: "put",
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
        const res: operations.PutShieldInformationBarrierSegmentsIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.shieldInformationBarrierSegment = httpRes?.data;
            }
            break;
          case httpRes?.status == 404:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
          case httpRes?.status == 409:
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
