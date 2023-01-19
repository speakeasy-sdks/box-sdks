import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class DomainRestrictionsUserExemptions {
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
   * deleteCollaborationWhitelistExemptTargetsId - Remove user from list of users exempt from domain restrictions
   *
   * Removes a user's exemption from the restrictions set out by the allowed list
   * of domains for collaborations.
  **/
  deleteCollaborationWhitelistExemptTargetsId(
    req: operations.DeleteCollaborationWhitelistExemptTargetsIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.DeleteCollaborationWhitelistExemptTargetsIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.DeleteCollaborationWhitelistExemptTargetsIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/collaboration_whitelist_exempt_targets/{collaboration_whitelist_exempt_target_id}", req.pathParams);
    
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
        const res: operations.DeleteCollaborationWhitelistExemptTargetsIdResponse = {statusCode: httpRes.status, contentType: contentType};
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
   * getCollaborationWhitelistExemptTargets - List users exempt from collaboration domain restrictions
   *
   * Returns a list of users who have been exempt from the collaboration
   * domain restrictions.
  **/
  getCollaborationWhitelistExemptTargets(
    req: operations.GetCollaborationWhitelistExemptTargetsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetCollaborationWhitelistExemptTargetsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetCollaborationWhitelistExemptTargetsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/collaboration_whitelist_exempt_targets";
    
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
        const res: operations.GetCollaborationWhitelistExemptTargetsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.collaborationAllowlistExemptTargets = httpRes?.data;
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
   * getCollaborationWhitelistExemptTargetsId - Get user exempt from collaboration domain restrictions
   *
   * Returns a users who has been exempt from the collaboration
   * domain restrictions.
  **/
  getCollaborationWhitelistExemptTargetsId(
    req: operations.GetCollaborationWhitelistExemptTargetsIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetCollaborationWhitelistExemptTargetsIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetCollaborationWhitelistExemptTargetsIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/collaboration_whitelist_exempt_targets/{collaboration_whitelist_exempt_target_id}", req.pathParams);
    
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
        const res: operations.GetCollaborationWhitelistExemptTargetsIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.collaborationAllowlistExemptTarget = httpRes?.data;
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
   * postCollaborationWhitelistExemptTargets - Create user exemption from collaboration domain restrictions
   *
   * Exempts a user from the restrictions set out by the allowed list of domains
   * for collaborations.
  **/
  postCollaborationWhitelistExemptTargets(
    req: operations.PostCollaborationWhitelistExemptTargetsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostCollaborationWhitelistExemptTargetsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostCollaborationWhitelistExemptTargetsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/collaboration_whitelist_exempt_targets";

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
        const res: operations.PostCollaborationWhitelistExemptTargetsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.collaborationAllowlistExemptTarget = httpRes?.data;
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
