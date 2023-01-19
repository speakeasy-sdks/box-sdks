import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class Authorization {
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
   * getAuthorize - Authorize user
   *
   * Authorize a user by sending them through the [Box](https://box.com)
   * website and request their permission to act on their behalf.
   * 
   * This is the first step when authenticating a user using
   * OAuth 2.0. To request a user's authorization to use the Box APIs
   * on their behalf you will need to send a user to the URL with this
   * format.
  **/
  getAuthorize(
    req: operations.GetAuthorizeRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetAuthorizeResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetAuthorizeRequest(req);
    }
    
    let baseURL: string = operations.GetAuthorizeServerList[0];
    if (req.serverURL) {
      baseURL = req.serverURL;
    }
    const url: string = baseURL.replace(/\/$/, "") + "/authorize";
    
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
        const res: operations.GetAuthorizeResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `text/html`)) {
                res.getAuthorize200TextHTMLHTMLString = JSON.stringify(httpRes?.data);
            }
            break;
          default:
            if (utils.matchContentType(contentType, `text/html`)) {
                res.getAuthorizeDefaultTextHTMLHTMLString = JSON.stringify(httpRes?.data);
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * postOauth2Revoke - Revoke access token
   *
   * Revoke an active Access Token, effectively logging a user out
   * that has been previously authenticated.
  **/
  postOauth2Revoke(
    req: operations.PostOauth2RevokeRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostOauth2RevokeResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostOauth2RevokeRequest(req);
    }
    
    let baseURL: string = operations.PostOauth2RevokeServerList[0];
    if (req.serverURL) {
      baseURL = req.serverURL;
    }
    const url: string = baseURL.replace(/\/$/, "") + "/oauth2/revoke";

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
        const res: operations.PostOauth2RevokeResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.oAuth2Error = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.oAuth2Error = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * postOauth2Token - Request access token
   *
   * Request an Access Token using either a client-side obtained OAuth 2.0
   * authorization code or a server-side JWT assertion.
   * 
   * An Access Token is a string that enables Box to verify that a
   * request belongs to an authorized session. In the normal order of
   * operations you will begin by requesting authentication from the
   * [authorize](#get-authorize) endpoint and Box will send you an
   * authorization code.
   * 
   * You will then send this code to this endpoint to exchange it for
   * an Access Token. The returned Access Token can then be used to to make
   * Box API calls.
  **/
  postOauth2Token(
    req: operations.PostOauth2TokenRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostOauth2TokenResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostOauth2TokenRequest(req);
    }
    
    let baseURL: string = operations.PostOauth2TokenServerList[0];
    if (req.serverURL) {
      baseURL = req.serverURL;
    }
    const url: string = baseURL.replace(/\/$/, "") + "/oauth2/token";

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
        const res: operations.PostOauth2TokenResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.accessToken = httpRes?.data;
            }
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.oAuth2Error = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.oAuth2Error = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * postOauth2TokenNumberRefresh - Refresh access token
   *
   * Refresh an Access Token using its client ID, secret, and refresh token.
  **/
  postOauth2TokenNumberRefresh(
    req: operations.PostOauth2TokenNumberRefreshRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostOauth2TokenNumberRefreshResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostOauth2TokenNumberRefreshRequest(req);
    }
    
    let baseURL: string = operations.PostOauth2TokenNumberRefreshServerList[0];
    if (req.serverURL) {
      baseURL = req.serverURL;
    }
    const url: string = baseURL.replace(/\/$/, "") + "/oauth2/token#refresh";

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
        const res: operations.PostOauth2TokenNumberRefreshResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.accessToken = httpRes?.data;
            }
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.oAuth2Error = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.oAuth2Error = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

}
