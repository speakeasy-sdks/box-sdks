import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class Uploads:
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

    
    def post_files_content(self, request: operations.PostFilesContentRequest) -> operations.PostFilesContentResponse:
        r"""Upload file
        Uploads a small file to Box. For file sizes over 50MB we recommend
        using the Chunk Upload APIs.
        
        # Request body order
        
        The `attributes` part of the body must come **before** the
        `file` part. Requests that do not follow this format when
        uploading the file will receive a HTTP `400` error with a
        `metadata_after_file_contents` error code.
        """
        
        base_url = operations.POST_FILES_CONTENT_SERVERS[0]
        if request.server_url is not None:
            base_url = request.server_url
        
        
        url = base_url.removesuffix("/") + "/files/content"
        
        headers = utils.get_headers(request.headers)
        req_content_type, data, json, files = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("POST", url, params=query_params, data=data, json=json, files=files, headers=headers)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.PostFilesContentResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.Files])
                res.files = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 409:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def post_files_id_content(self, request: operations.PostFilesIDContentRequest) -> operations.PostFilesIDContentResponse:
        r"""Upload file version
        Update a file's content. For file sizes over 50MB we recommend
        using the Chunk Upload APIs.
        
        # Request body order
        
        The `attributes` part of the body must come **before** the
        `file` part. Requests that do not follow this format when
        uploading the file will receive a HTTP `400` error with a
        `metadata_after_file_contents` error code.
        """
        
        base_url = operations.POST_FILES_ID_CONTENT_SERVERS[0]
        if request.server_url is not None:
            base_url = request.server_url
        
        
        url = utils.generate_url(base_url, "/files/{file_id}/content", request.path_params)
        
        headers = utils.get_headers(request.headers)
        req_content_type, data, json, files = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("POST", url, params=query_params, data=data, json=json, files=files, headers=headers)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.PostFilesIDContentResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.Files])
                res.files = out
        elif r.status_code == 412:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    