import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class FileVersions:
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

    
    def delete_files_id_versions_id(self, request: operations.DeleteFilesIDVersionsIDRequest) -> operations.DeleteFilesIDVersionsIDResponse:
        r"""Remove file version
        Move a file version to the trash.
        
        Versions are only tracked for Box users with premium accounts.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/files/{file_id}/versions/{file_version_id}", request.path_params)
        
        headers = utils.get_headers(request.headers)
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("DELETE", url, headers=headers)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.DeleteFilesIDVersionsIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_files_id_versions(self, request: operations.GetFilesIDVersionsRequest) -> operations.GetFilesIDVersionsResponse:
        r"""List all file versions
        Retrieve a list of the past versions for a file.
        
        Versions are only tracked by Box users with premium accounts. To fetch the ID
        of the current version of a file, use the `GET /file/:id` API.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/files/{file_id}/versions", request.path_params)
        
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

        res = operations.GetFilesIDVersionsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.FileVersions])
                res.file_versions = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_files_id_versions_id(self, request: operations.GetFilesIDVersionsIDRequest) -> operations.GetFilesIDVersionsIDResponse:
        r"""Get file version
        Retrieve a specific version of a file.
        
        Versions are only tracked for Box users with premium accounts.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/files/{file_id}/versions/{file_version_id}", request.path_params)
        
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

        res = operations.GetFilesIDVersionsIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.FileVersion])
                res.file_version = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def post_files_id_versions_current(self, request: operations.PostFilesIDVersionsCurrentRequest) -> operations.PostFilesIDVersionsCurrentResponse:
        r"""Promote file version
        Promote a specific version of a file.
        
        If previous versions exist, this method can be used to
        promote one of the older versions to the top of the version history.
        
        This creates a new copy of the old version and puts it at the
        top of the versions history. The file will have the exact same contents
        as the older version, with the the same hash digest, `etag`, and
        name as the original.
        
        Other properties such as comments do not get updated to their
        former values.
        
        Don't use this endpoint to restore Box Notes,
        as it works with file formats such as PDF, DOC,
        PPTX or similar.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/files/{file_id}/versions/current", request.path_params)
        
        headers = {}
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

        res = operations.PostFilesIDVersionsCurrentResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.FileVersion])
                res.file_version = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def put_files_id_versions_id(self, request: operations.PutFilesIDVersionsIDRequest) -> operations.PutFilesIDVersionsIDResponse:
        r"""Restore file version
        Restores a specific version of a file after it was deleted.
        Don't use this endpoint to restore Box Notes,
        as it works with file formats such as PDF, DOC,
        PPTX or similar.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/files/{file_id}/versions/{file_version_id}", request.path_params)
        
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

        res = operations.PutFilesIDVersionsIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.FileVersion])
                res.file_version = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    