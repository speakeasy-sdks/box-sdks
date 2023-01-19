import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class LegalHoldPolicyAssignments:
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

    
    def delete_legal_hold_policy_assignments_id(self, request: operations.DeleteLegalHoldPolicyAssignmentsIDRequest) -> operations.DeleteLegalHoldPolicyAssignmentsIDResponse:
        r"""Unassign legal hold policy
        Remove a legal hold from an item.
        
        This is an asynchronous process. The policy will not be
        fully removed yet when the response returns.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}", request.path_params)
        
        
        client = self._security_client
        
        retry_config = request.retries
        if retry_config is None:
            retry_config = utils.RetryConfig("backoff", True)
            retry_config.backoff = utils.BackoffStrategy(500, 60000, 1.5, 3600000)
            

        def do_request():
            return client.request("DELETE", url)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.DeleteLegalHoldPolicyAssignmentsIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 202:
            pass
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_legal_hold_policy_assignments(self, request: operations.GetLegalHoldPolicyAssignmentsRequest) -> operations.GetLegalHoldPolicyAssignmentsResponse:
        r"""List legal hold policy assignments
        Retrieves a list of items a legal hold policy has been assigned to.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/legal_hold_policy_assignments"
        
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

        res = operations.GetLegalHoldPolicyAssignmentsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.LegalHoldPolicyAssignments])
                res.legal_hold_policy_assignments = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_legal_hold_policy_assignments_id(self, request: operations.GetLegalHoldPolicyAssignmentsIDRequest) -> operations.GetLegalHoldPolicyAssignmentsIDResponse:
        r"""Get legal hold policy assignment
        Retrieve a legal hold policy assignment.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}", request.path_params)
        
        
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

        res = operations.GetLegalHoldPolicyAssignmentsIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.LegalHoldPolicyAssignment])
                res.legal_hold_policy_assignment = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_legal_hold_policy_assignments_id_file_versions_on_hold(self, request: operations.GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldRequest) -> operations.GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldResponse:
        r"""List previous file versions for legal hold policy assignment
        Get a list of previous file versions for a legal hold
        assignment.
        
        In some cases you may only need the latest file versions instead. In these
        cases, use the `GET  /legal_hold_policy_assignments/:id/files_on_hold` API
        instead to return any current (latest) versions of a file for this legal hold
        policy assignment.
        
        Due to ongoing re-architecture efforts this API might not return all files
        held for this policy ID. Instead, this API will only return past file versions
        held in the newly developed architecture. The `GET /file_version_legal_holds`
        API can be used to fetch current and past versions of files held within the
        legacy architecture.
        
        The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
        find a list of policy assignments for a given policy ID.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/file_versions_on_hold", request.path_params)
        
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

        res = operations.GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.FileVersionLegalHolds])
                res.file_version_legal_holds = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_legal_hold_policy_assignments_id_files_on_hold(self, request: operations.GetLegalHoldPolicyAssignmentsIDFilesOnHoldRequest) -> operations.GetLegalHoldPolicyAssignmentsIDFilesOnHoldResponse:
        r"""List current file versions for legal hold policy assignment
        Get a list of current file versions for a legal hold
        assignment.
        
        In some cases you may want to get previous file versions instead. In these
        cases, use the `GET  /legal_hold_policy_assignments/:id/file_versions_on_hold`
        API instead to return any previous versions of a file for this legal hold
        policy assignment.
        
        Due to ongoing re-architecture efforts this API might not return all file
        versions held for this policy ID. Instead, this API will only return the
        latest file version held in the newly developed architecture. The `GET
        /file_version_legal_holds` API can be used to fetch current and past versions
        of files held within the legacy architecture.
        
        The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
        find a list of policy assignments for a given policy ID.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/files_on_hold", request.path_params)
        
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

        res = operations.GetLegalHoldPolicyAssignmentsIDFilesOnHoldResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.FileVersionLegalHolds])
                res.file_version_legal_holds = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def post_legal_hold_policy_assignments(self, request: operations.PostLegalHoldPolicyAssignmentsRequest) -> operations.PostLegalHoldPolicyAssignmentsResponse:
        r"""Assign legal hold policy
        Assign a legal hold to a file, file version, folder, or user.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/legal_hold_policy_assignments"
        
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

        res = operations.PostLegalHoldPolicyAssignmentsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.LegalHoldPolicyAssignment])
                res.legal_hold_policy_assignment = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    