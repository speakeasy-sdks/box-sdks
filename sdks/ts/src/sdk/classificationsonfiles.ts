import { AxiosInstance, AxiosRequestConfig, AxiosResponse } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class ClassificationsOnFiles {
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
   * deleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Remove classification from file
   *
   * Removes any classifications from a file.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/files/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
  **/
  deleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo(
    req: operations.DeleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.DeleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.DeleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo", req.pathParams);
    
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
        const res: operations.DeleteFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse = {statusCode: httpRes.status, contentType: contentType};
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
   * getFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Get classification on file
   *
   * Retrieves the classification metadata instance that
   * has been applied to a file.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/files/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
  **/
  getFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo(
    req: operations.GetFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo", req.pathParams);
    
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
        const res: operations.GetFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse = {statusCode: httpRes.status, contentType: contentType};
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
   * postFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Add classification to file
   *
   * Adds a classification to a file by specifying the label of the
   * classification to add.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/files/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
  **/
  postFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo(
    req: operations.PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo", req.pathParams);

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
        const res: operations.PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse = {statusCode: httpRes.status, contentType: contentType};
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
   * putFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo - Update classification on file
   *
   * Updates a classification on a file.
   * 
   * The classification can only be updated if a classification has already been
   * applied to the file before. When editing classifications, only values are
   * defined for the enterprise will be accepted.
  **/
  putFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWo(
    req: operations.PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/files/{file_id}/metadata/enterprise/securityClassification-6VMVochwUWo", req.pathParams);

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
        const res: operations.PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoResponse = {statusCode: httpRes.status, contentType: contentType};
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
