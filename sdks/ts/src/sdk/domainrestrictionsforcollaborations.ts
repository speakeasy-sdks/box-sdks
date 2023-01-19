import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class DomainRestrictionsForCollaborations {
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
   * deleteCollaborationWhitelistEntriesId - Remove domain from list of allowed collaboration domains
   *
   * Removes a domain from the list of domains that have been deemed safe to create
   * collaborations for within the current enterprise.
  **/
  deleteCollaborationWhitelistEntriesId(
    req: operations.DeleteCollaborationWhitelistEntriesIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.DeleteCollaborationWhitelistEntriesIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.DeleteCollaborationWhitelistEntriesIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/collaboration_whitelist_entries/{collaboration_whitelist_entry_id}", req.pathParams);
    
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
        const res: operations.DeleteCollaborationWhitelistEntriesIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 204:
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
   * getCollaborationWhitelistEntries - List allowed collaboration domains
   *
   * Returns the list domains that have been deemed safe to create collaborations
   * for within the current enterprise.
  **/
  getCollaborationWhitelistEntries(
    req: operations.GetCollaborationWhitelistEntriesRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetCollaborationWhitelistEntriesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetCollaborationWhitelistEntriesRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/collaboration_whitelist_entries";
    
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
        const res: operations.GetCollaborationWhitelistEntriesResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.collaborationAllowlistEntries = httpRes?.data;
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
   * getCollaborationWhitelistEntriesId - Get allowed collaboration domain
   *
   * Returns a domain that has been deemed safe to create collaborations
   * for within the current enterprise.
  **/
  getCollaborationWhitelistEntriesId(
    req: operations.GetCollaborationWhitelistEntriesIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetCollaborationWhitelistEntriesIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetCollaborationWhitelistEntriesIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/collaboration_whitelist_entries/{collaboration_whitelist_entry_id}", req.pathParams);
    
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
        const res: operations.GetCollaborationWhitelistEntriesIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.collaborationAllowlistEntry = httpRes?.data;
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
   * postCollaborationWhitelistEntries - Add domain to list of allowed collaboration domains
   *
   * Creates a new entry in the list of allowed domains to allow
   * collaboration for.
  **/
  postCollaborationWhitelistEntries(
    req: operations.PostCollaborationWhitelistEntriesRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostCollaborationWhitelistEntriesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostCollaborationWhitelistEntriesRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/collaboration_whitelist_entries";

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
        const res: operations.PostCollaborationWhitelistEntriesResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.collaborationAllowlistEntry = httpRes?.data;
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
