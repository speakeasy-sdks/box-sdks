import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class TermsOfServiceUserStatuses:
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

    
    def get_terms_of_service_user_statuses(self, request: operations.GetTermsOfServiceUserStatusesRequest) -> operations.GetTermsOfServiceUserStatusesResponse:
        r"""List terms of service user statuses
        Retrieves an overview of users and their status for a
        terms of service, including Whether they have accepted
        the terms and when.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/terms_of_service_user_statuses"
        
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

        res = operations.GetTermsOfServiceUserStatusesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TermsOfServiceUserStatuses])
                res.terms_of_service_user_statuses = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def post_terms_of_service_user_statuses(self, request: operations.PostTermsOfServiceUserStatusesRequest) -> operations.PostTermsOfServiceUserStatusesResponse:
        r"""Create terms of service status for new user
        Sets the status for a terms of service for a user.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/terms_of_service_user_statuses"
        
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

        res = operations.PostTermsOfServiceUserStatusesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TermsOfServiceUserStatus])
                res.terms_of_service_user_status = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def put_terms_of_service_user_statuses_id(self, request: operations.PutTermsOfServiceUserStatusesIDRequest) -> operations.PutTermsOfServiceUserStatusesIDResponse:
        r"""Update terms of service status for existing user
        Updates the status for a terms of service for a user.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/terms_of_service_user_statuses/{terms_of_service_user_status_id}", request.path_params)
        
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
            return client.request("PUT", url, data=data, json=json, files=files, headers=headers)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.PutTermsOfServiceUserStatusesIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TermsOfServiceUserStatus])
                res.terms_of_service_user_status = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    