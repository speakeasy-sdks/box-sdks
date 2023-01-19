import { AxiosInstance, AxiosRequestConfig, AxiosResponse } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class Classifications {
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
   * deleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema - Delete all classifications
   *
   * Delete all classifications by deleting the classification
   * metadata template.
  **/
  deleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema(
    req: operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema";
    
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
        const res: operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse = {statusCode: httpRes.status, contentType: contentType};
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
   * getMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema - List all classifications
   *
   * Retrieves the classification metadata template and lists all the
   * classifications available to this enterprise.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
  **/
  getMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchema(
    req: operations.GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema";
    
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
        const res: operations.GetMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.classificationTemplate = httpRes?.data;
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
   * postMetadataTemplatesSchemaNumberClassifications - Add initial classifications
   *
   * When an enterprise does not yet have any classifications, this API call
   * initializes the classification template with an initial set of
   * classifications.
   * 
   * If an enterprise already has a classification, the template will already
   * exist and instead an API call should be made to add additional
   * classifications.
  **/
  postMetadataTemplatesSchemaNumberClassifications(
    req: operations.PostMetadataTemplatesSchemaNumberClassificationsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostMetadataTemplatesSchemaNumberClassificationsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostMetadataTemplatesSchemaNumberClassificationsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/metadata_templates/schema#classifications";

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
        const res: operations.PostMetadataTemplatesSchemaNumberClassificationsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.classificationTemplate = httpRes?.data;
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
   * putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAdd - Add classification
   *
   * Adds one or more new classifications to the list of classifications
   * available to the enterprise.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
  **/
  putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAdd(
    req: operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#add";

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
        const res: operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.classificationTemplate = httpRes?.data;
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
   * putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDelete - Delete classification
   *
   * Removes a classification from the list of classifications
   * available to the enterprise.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
  **/
  putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDelete(
    req: operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#delete";

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
        const res: operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.classificationTemplate = httpRes?.data;
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
   * putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdate - Update classification
   *
   * Updates the labels and descriptions of one or more classifications
   * available to the enterprise.
   * 
   * This API can also be called by including the enterprise ID in the
   * URL explicitly, for example
   * `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
  **/
  putMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdate(
    req: operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#update";

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
        const res: operations.PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.classificationTemplate = httpRes?.data;
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
