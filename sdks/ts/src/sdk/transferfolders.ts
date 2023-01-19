import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class TransferFolders {
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
   * putUsersIdFolders0 - Transfer owned folders
   *
   * Move all of the items (files, folders and workflows) owned by a user into
   * another user's account
   * 
   * Only the root folder (`0`) can be transferred.
   * 
   * Folders can only be moved across users by users with administrative
   * permissions.
   * 
   * All existing shared links and folder-level collaborations are transferred
   * during the operation. Please note that while collaborations at the individual
   * file-level are transferred during the operation, the collaborations are
   * deleted when the original user is deleted.
   * 
   * This call will be performed synchronously which might lead to a slow response
   * when the source user has a large number of items in all of its folders.
   * 
   * If the destination path has a metadata cascade policy attached to any of
   * the parent folders, a metadata cascade operation will be kicked off
   * asynchronously.
   * 
   * There is currently no way to check for when this operation is finished.
   * 
   * The destination folder's name will be in the format `{User}'s Files and
   * Folders`, where `{User}` is the display name of the user.
   * 
   * To make this API call your application will need to have the "Read and write
   * all files and folders stored in Box" scope enabled.
   * 
   * Please make sure the destination user has access to `Relay` or `Relay Lite`,
   * and has access to the files and folders involved in the workflows being
   * transferred.
   * 
   * Admins will receive an email when the operation is completed.
  **/
  putUsersIdFolders0(
    req: operations.PutUsersIdFolders0Request,
    config?: AxiosRequestConfig
  ): Promise<operations.PutUsersIdFolders0Response> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PutUsersIdFolders0Request(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/users/{user_id}/folders/0", req.pathParams);

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
        method: "put",
        headers: headers,
        data: reqBody, 
        ...requestConfig,
      });
    }, new utils.Retries(retryConfig, [
      "5XX"
    ]));
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.PutUsersIdFolders0Response = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.folder = httpRes?.data;
            }
            break;
          case httpRes?.status == 403:
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
