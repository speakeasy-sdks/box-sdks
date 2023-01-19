import { AxiosInstance, AxiosRequestConfig, AxiosResponse } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class ClassificationsOnFolders {
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
   * deleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Remove classification from folder
   *
   * Removes any classifications from a folder.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
  **/
  deleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo(
    req: operations.DeleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.DeleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.DeleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", req.pathParams);
    
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
        const res: operations.DeleteFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 204:
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
          case httpRes?.status == 404:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
          case httpRes?.status == 405:
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
   * getFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Get classification on folder
   *
   * Retrieves the classification metadata instance that
   * has been applied to a folder.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
  **/
  getFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo(
    req: operations.GetFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", req.pathParams);
    
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
        const res: operations.GetFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 201:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.classification = httpRes?.data;
            }
            break;
          case httpRes?.status == 403:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
          case httpRes?.status == 404:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
          case httpRes?.status == 405:
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
   * postFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Add classification to folder
   *
   * Adds a classification to a folder by specifying the label of the
   * classification to add.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
  **/
  postFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo(
    req: operations.PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", req.pathParams);

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
        const res: operations.PostFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 201:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.classification = httpRes?.data;
            }
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
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
   * putFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Update classification on folder
   *
   * Updates a classification on a folder.
   * 
   * The classification can only be updated if a classification has already been
   * applied to the folder before. When editing classifications, only values are
   * defined for the enterprise will be accepted.
  **/
  putFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWo(
    req: operations.PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", req.pathParams);

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
        const res: operations.PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.classification = httpRes?.data;
            }
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
          case httpRes?.status == 500:
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
