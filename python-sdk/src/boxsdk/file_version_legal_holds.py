import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class FileVersionLegalHolds:
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

    
    def get_file_version_legal_holds(self, request: operations.GetFileVersionLegalHoldsRequest) -> operations.GetFileVersionLegalHoldsResponse:
        r"""List file version legal holds
        Get a list of file versions on legal hold for a legal hold
        assignment.
        
        Due to ongoing re-architecture efforts this API might not return all file
        versions for this policy ID.
        
        Instead, this API will only return file versions held in the legacy
        architecture. Two new endpoints will available to request any file versions
        held in the new architecture.
        
        For file versions held in the new architecture, the `GET
        /legal_hold_policy_assignments/:id/file_versions_on_hold` API can be used to
        return all past file versions available for this policy assignment, and the
        `GET /legal_hold_policy_assignments/:id/files_on_hold` API can be used to
        return any current (latest) versions of a file under legal hold.
        
        The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
        find a list of policy assignments for a given policy ID.
        
        Once the re-architecture is completed this API will be deprecated.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/file_version_legal_holds"
        
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

        res = operations.GetFileVersionLegalHoldsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.FileVersionLegalHolds])
                res.file_version_legal_holds = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_file_version_legal_holds_id(self, request: operations.GetFileVersionLegalHoldsIDRequest) -> operations.GetFileVersionLegalHoldsIDResponse:
        r"""Get file version legal hold
        Retrieves information about the legal hold policies
        assigned to a file version.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/file_version_legal_holds/{file_version_legal_hold_id}", request.path_params)
        
        
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

        res = operations.GetFileVersionLegalHoldsIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.FileVersionLegalHold])
                res.file_version_legal_hold = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    