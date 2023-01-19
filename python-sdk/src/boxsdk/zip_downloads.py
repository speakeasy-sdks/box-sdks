import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class ZipDownloads:
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

    
    def get_zip_downloads_id_content(self, request: operations.GetZipDownloadsIDContentRequest) -> operations.GetZipDownloadsIDContentResponse:
        r"""Download zip archive
        Returns the contents of a `zip` archive in binary format. This URL does not
        require any form of authentication and could be used in a user's browser to
        download the archive to a user's device.
        
        By default, this URL is only valid for a few seconds from the creation of
        the request for this archive. Once a download has started it can not be
        stopped and resumed, instead a new request for a zip archive would need to
        be created.
        
        The URL of this endpoint should not be considered as fixed. Instead, use
        the [Create zip download](e://post_zip_downloads) API to request to create a
        `zip` archive, and then follow the `download_url` field in the response to
        this endpoint.
        """
        
        base_url = operations.GET_ZIP_DOWNLOADS_ID_CONTENT_SERVERS[0]
        if request.server_url is not None:
            base_url = request.server_url
        
        
        url = utils.generate_url(base_url, "/zip_downloads/{zip_download_id}/content", request.path_params)
        
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("GET", url)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.GetZipDownloadsIDContentResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            res.headers = r.headers
            
            if utils.match_content_type(content_type, "application/octet-stream"):
                res.get_zip_downloads_id_content_200_application_octet_stream_binary_string = r.content
        elif r.status_code == 404:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 429:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_zip_downloads_id_status(self, request: operations.GetZipDownloadsIDStatusRequest) -> operations.GetZipDownloadsIDStatusResponse:
        r"""Get zip download status
        Returns the download status of a `zip` archive, allowing an application to
        inspect the progress of the download as well as the number of items that
        might have been skipped.
        
        This endpoint can only be accessed once the download has started.
        Subsequently this endpoint is valid for 12 hours from the start of the
        download.
        
        The URL of this endpoint should not be considered as fixed. Instead, use
        the [Create zip download](e://post_zip_downloads) API to request to create a
        `zip` archive, and then follow the `status_url` field in the response to
        this endpoint.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/zip_downloads/{zip_download_id}/status", request.path_params)
        
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("GET", url)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.GetZipDownloadsIDStatusResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ZipDownloadStatus])
                res.zip_download_status = out
        elif r.status_code == 401:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 403:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 404:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def post_zip_downloads(self, request: operations.PostZipDownloadsRequest) -> operations.PostZipDownloadsResponse:
        r"""Create zip download
        Creates a request to download multiple files and folders as a single `zip`
        archive file. This API does not return the archive but instead performs all
        the checks to ensure that the user has access to all the items, and then
        returns a `download_url` and a `status_url` that can be used to download the
        archive.
        
        The limit for an archive is either the Account's upload limit or
        10,000 files, whichever is met first
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/zip_downloads"
        
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

        res = operations.PostZipDownloadsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 202:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ZipDownload])
                res.zip_download = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 401:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 403:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    