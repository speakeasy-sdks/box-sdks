import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class LegalHoldPolicyAssignments {
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
   * deleteLegalHoldPolicyAssignmentsId - Unassign legal hold policy
   *
   * Remove a legal hold from an item.
   * 
   * This is an asynchronous process. The policy will not be
   * fully removed yet when the response returns.
  **/
  deleteLegalHoldPolicyAssignmentsId(
    req: operations.DeleteLegalHoldPolicyAssignmentsIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.DeleteLegalHoldPolicyAssignmentsIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.DeleteLegalHoldPolicyAssignmentsIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}", req.pathParams);
    
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
        const res: operations.DeleteLegalHoldPolicyAssignmentsIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 202:
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
   * getLegalHoldPolicyAssignments - List legal hold policy assignments
   *
   * Retrieves a list of items a legal hold policy has been assigned to.
  **/
  getLegalHoldPolicyAssignments(
    req: operations.GetLegalHoldPolicyAssignmentsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetLegalHoldPolicyAssignmentsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetLegalHoldPolicyAssignmentsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/legal_hold_policy_assignments";
    
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
        const res: operations.GetLegalHoldPolicyAssignmentsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.legalHoldPolicyAssignments = httpRes?.data;
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
   * getLegalHoldPolicyAssignmentsId - Get legal hold policy assignment
   *
   * Retrieve a legal hold policy assignment.
  **/
  getLegalHoldPolicyAssignmentsId(
    req: operations.GetLegalHoldPolicyAssignmentsIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetLegalHoldPolicyAssignmentsIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetLegalHoldPolicyAssignmentsIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}", req.pathParams);
    
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
        const res: operations.GetLegalHoldPolicyAssignmentsIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.legalHoldPolicyAssignment = httpRes?.data;
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
   * getLegalHoldPolicyAssignmentsIdFileVersionsOnHold - List previous file versions for legal hold policy assignment
   *
   * Get a list of previous file versions for a legal hold
   * assignment.
   * 
   * In some cases you may only need the latest file versions instead. In these
   * cases, use the `GET  /legal_hold_policy_assignments/:id/files_on_hold` API
   * instead to return any current (latest) versions of a file for this legal hold
   * policy assignment.
   * 
   * Due to ongoing re-architecture efforts this API might not return all files
   * held for this policy ID. Instead, this API will only return past file versions
   * held in the newly developed architecture. The `GET /file_version_legal_holds`
   * API can be used to fetch current and past versions of files held within the
   * legacy architecture.
   * 
   * The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
   * find a list of policy assignments for a given policy ID.
  **/
  getLegalHoldPolicyAssignmentsIdFileVersionsOnHold(
    req: operations.GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/file_versions_on_hold", req.pathParams);
    
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
        const res: operations.GetLegalHoldPolicyAssignmentsIdFileVersionsOnHoldResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.fileVersionLegalHolds = httpRes?.data;
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
   * getLegalHoldPolicyAssignmentsIdFilesOnHold - List current file versions for legal hold policy assignment
   *
   * Get a list of current file versions for a legal hold
   * assignment.
   * 
   * In some cases you may want to get previous file versions instead. In these
   * cases, use the `GET  /legal_hold_policy_assignments/:id/file_versions_on_hold`
   * API instead to return any previous versions of a file for this legal hold
   * policy assignment.
   * 
   * Due to ongoing re-architecture efforts this API might not return all file
   * versions held for this policy ID. Instead, this API will only return the
   * latest file version held in the newly developed architecture. The `GET
   * /file_version_legal_holds` API can be used to fetch current and past versions
   * of files held within the legacy architecture.
   * 
   * The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
   * find a list of policy assignments for a given policy ID.
  **/
  getLegalHoldPolicyAssignmentsIdFilesOnHold(
    req: operations.GetLegalHoldPolicyAssignmentsIdFilesOnHoldRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetLegalHoldPolicyAssignmentsIdFilesOnHoldRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/files_on_hold", req.pathParams);
    
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
        const res: operations.GetLegalHoldPolicyAssignmentsIdFilesOnHoldResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.fileVersionLegalHolds = httpRes?.data;
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
   * postLegalHoldPolicyAssignments - Assign legal hold policy
   *
   * Assign a legal hold to a file, file version, folder, or user.
  **/
  postLegalHoldPolicyAssignments(
    req: operations.PostLegalHoldPolicyAssignmentsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostLegalHoldPolicyAssignmentsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostLegalHoldPolicyAssignmentsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/legal_hold_policy_assignments";

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
        const res: operations.PostLegalHoldPolicyAssignmentsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 201:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.legalHoldPolicyAssignment = httpRes?.data;
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
