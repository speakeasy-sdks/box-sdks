import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class FileVersionLegalHolds {
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
   * getFileVersionLegalHolds - List file version legal holds
   *
   * Get a list of file versions on legal hold for a legal hold
   * assignment.
   * 
   * Due to ongoing re-architecture efforts this API might not return all file
   * versions for this policy ID.
   * 
   * Instead, this API will only return file versions held in the legacy
   * architecture. Two new endpoints will available to request any file versions
   * held in the new architecture.
   * 
   * For file versions held in the new architecture, the `GET
   * /legal_hold_policy_assignments/:id/file_versions_on_hold` API can be used to
   * return all past file versions available for this policy assignment, and the
   * `GET /legal_hold_policy_assignments/:id/files_on_hold` API can be used to
   * return any current (latest) versions of a file under legal hold.
   * 
   * The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
   * find a list of policy assignments for a given policy ID.
   * 
   * Once the re-architecture is completed this API will be deprecated.
  **/
  getFileVersionLegalHolds(
    req: operations.GetFileVersionLegalHoldsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetFileVersionLegalHoldsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetFileVersionLegalHoldsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/file_version_legal_holds";
    
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
        const res: operations.GetFileVersionLegalHoldsResponse = {statusCode: httpRes.status, contentType: contentType};
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
   * getFileVersionLegalHoldsId - Get file version legal hold
   *
   * Retrieves information about the legal hold policies
   * assigned to a file version.
  **/
  getFileVersionLegalHoldsId(
    req: operations.GetFileVersionLegalHoldsIdRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetFileVersionLegalHoldsIdResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetFileVersionLegalHoldsIdRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/file_version_legal_holds/{file_version_legal_hold_id}", req.pathParams);
    
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
        const res: operations.GetFileVersionLegalHoldsIdResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.fileVersionLegalHold = httpRes?.data;
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
