import { AxiosInstance, AxiosRequestConfig, AxiosResponse } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class ZipDownloads {
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
   * getZipDownloadsIdContent - Download zip archive
   *
   * Returns the contents of a `zip` archive in binary format. This URL does not
   * require any form of authentication and could be used in a user's browser to
   * download the archive to a user's device.
   * 
   * By default, this URL is only valid for a few seconds from the creation of
   * the request for this archive. Once a download has started it can not be
   * stopped and resumed, instead a new request for a zip archive would need to
   * be created.
   * 
   * The URL of this endpoint should not be considered as fixed. Instead, use
   * the [Create zip download](e://post_zip_downloads) API to request to create a
   * `zip` archive, and then follow the `download_url` field in the response to
   * this endpoint.
  **/
  getZipDownloadsIdContent(
    req: operations.GetZipDownloadsIdContentRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetZipDownloadsIdContentResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetZipDownloadsIdContentRequest(req);
    }
    
    let baseURL: string = operations.GetZipDownloadsIdContentServerList[0];
    if (req.serverURL) {
      baseURL = req.serverURL;
    }
    const url: string = utils.generateURL(baseURL, "/zip_downloads/{zip_download_id}/content", req.pathParams);
    
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
        const res: operations.GetZipDownloadsIdContentResponse = {statusCode: httpRes.status, contentType: contentType, headers: utils.getHeadersFromResponse(httpRes.headers)};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/octet-stream`)) {
                const resBody: string = JSON.stringify(httpRes?.data, null, 0);
                let out: Uint8Array = new Uint8Array(resBody.length);
                for (let i: number = 0; i < resBody.length; i++) out[i] = resBody.charCodeAt(i);
                res.getZipDownloadsIdContent200ApplicationOctetStreamBinaryString = out;
            }
            break;
          case httpRes?.status == 404:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
          case httpRes?.status == 429:
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
   * getZipDownloadsIdStatus - Get zip download status
   *
   * Returns the download status of a `zip` archive, allowing an application to
   * inspect the progress of the download as well as the number of items that
   * might have been skipped.
   * 
   * This endpoint can only be accessed once the download has started.
   * Subsequently this endpoint is valid for 12 hours from the start of the
   * download.
   * 
   * The URL of this endpoint should not be considered as fixed. Instead, use
   * the [Create zip download](e://post_zip_downloads) API to request to create a
   * `zip` archive, and then follow the `status_url` field in the response to
   * this endpoint.
  **/
  getZipDownloadsIdStatus(
    req: operations.GetZipDownloadsIdStatusRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetZipDownloadsIdStatusResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetZipDownloadsIdStatusRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/zip_downloads/{zip_download_id}/status", req.pathParams);
    
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
        const res: operations.GetZipDownloadsIdStatusResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.zipDownloadStatus = httpRes?.data;
            }
            break;
          case httpRes?.status == 401:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
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
   * postZipDownloads - Create zip download
   *
   * Creates a request to download multiple files and folders as a single `zip`
   * archive file. This API does not return the archive but instead performs all
   * the checks to ensure that the user has access to all the items, and then
   * returns a `download_url` and a `status_url` that can be used to download the
   * archive.
   * 
   * The limit for an archive is either the Account's upload limit or
   * 10,000 files, whichever is met first
  **/
  postZipDownloads(
    req: operations.PostZipDownloadsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostZipDownloadsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostZipDownloadsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/zip_downloads";

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
        const res: operations.PostZipDownloadsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 202:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.zipDownload = httpRes?.data;
            }
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
            }
            break;
          case httpRes?.status == 401:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.clientError = httpRes?.data;
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
