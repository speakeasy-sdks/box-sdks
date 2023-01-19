import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class Authorization:
    _client: requests.Session
    _security_client: requests.Session
    _server_url: str
    _language: str
    _sdk_version: str
    _gen_version: str

    def __init__(self, client: requests.Session, security_client: requests.Session, server_url: str, language: str, sdk_version: str, gen_version: str) -> None:
        self._client = client
        self._security_client = security_client
        self._server_url = server_url
        self._language = language
        self._sdk_version = sdk_version
        self._gen_version = gen_version

    
    def get_authorize(self, request: operations.GetAuthorizeRequest) -> operations.GetAuthorizeResponse:
        r"""Authorize user
        Authorize a user by sending them through the [Box](https://box.com)
        website and request their permission to act on their behalf.
        
        This is the first step when authenticating a user using
        OAuth 2.0. To request a user's authorization to use the Box APIs
        on their behalf you will need to send a user to the URL with this
        format.
        """
        
        base_url = operations.GET_AUTHORIZE_SERVERS[0]
        if request.server_url is not None:
            base_url = request.server_url
        
        
        url = base_url.removesuffix("/") + "/authorize"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("GET", url, params=query_params)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.GetAuthorizeResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "text/html"):
                res.get_authorize_200_text_html_html_string = r.content
        else:
            if utils.match_content_type(content_type, "text/html"):
                res.get_authorize_default_text_html_html_string = r.content

        return res

    
    def post_oauth2_revoke(self, request: operations.PostOauth2RevokeRequest) -> operations.PostOauth2RevokeResponse:
        r"""Revoke access token
        Revoke an active Access Token, effectively logging a user out
        that has been previously authenticated.
        """
        
        base_url = operations.POST_OAUTH2_REVOKE_SERVERS[0]
        if request.server_url is not None:
            base_url = request.server_url
        
        
        url = base_url.removesuffix("/") + "/oauth2/revoke"
        
        headers = {}
        req_content_type, data, json, files = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("POST", url, data=data, json=json, files=files, headers=headers)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.PostOauth2RevokeResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            pass
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.OAuth2Error])
                res.o_auth2_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.OAuth2Error])
                res.o_auth2_error = out

        return res

    
    def post_oauth2_token(self, request: operations.PostOauth2TokenRequest) -> operations.PostOauth2TokenResponse:
        r"""Request access token
        Request an Access Token using either a client-side obtained OAuth 2.0
        authorization code or a server-side JWT assertion.
        
        An Access Token is a string that enables Box to verify that a
        request belongs to an authorized session. In the normal order of
        operations you will begin by requesting authentication from the
        [authorize](#get-authorize) endpoint and Box will send you an
        authorization code.
        
        You will then send this code to this endpoint to exchange it for
        an Access Token. The returned Access Token can then be used to to make
        Box API calls.
        """
        
        base_url = operations.POST_OAUTH2_TOKEN_SERVERS[0]
        if request.server_url is not None:
            base_url = request.server_url
        
        
        url = base_url.removesuffix("/") + "/oauth2/token"
        
        headers = {}
        req_content_type, data, json, files = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("POST", url, data=data, json=json, files=files, headers=headers)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.PostOauth2TokenResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.AccessToken])
                res.access_token = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.OAuth2Error])
                res.o_auth2_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.OAuth2Error])
                res.o_auth2_error = out

        return res

    
    def post_oauth2_token_number_refresh(self, request: operations.PostOauth2TokenNumberRefreshRequest) -> operations.PostOauth2TokenNumberRefreshResponse:
        r"""Refresh access token
        Refresh an Access Token using its client ID, secret, and refresh token.
        """
        
        base_url = operations.POST_OAUTH2_TOKEN_NUMBER_REFRESH_SERVERS[0]
        if request.server_url is not None:
            base_url = request.server_url
        
        
        url = base_url.removesuffix("/") + "/oauth2/token#refresh"
        
        headers = {}
        req_content_type, data, json, files = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("POST", url, data=data, json=json, files=files, headers=headers)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.PostOauth2TokenNumberRefreshResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.AccessToken])
                res.access_token = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.OAuth2Error])
                res.o_auth2_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.OAuth2Error])
                res.o_auth2_error = out

        return res

    