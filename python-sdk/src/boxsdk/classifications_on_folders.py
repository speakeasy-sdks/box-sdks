import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class ClassificationsOnFolders:
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

    
    def delete_folders_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo(self, request: operations.DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest) -> operations.DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse:
        r"""Remove classification from folder
        Removes any classifications from a folder.
        
        This API can also be called by including the enterprise ID in the
        URL explicitly, for example
        `/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", request.path_params)
        
        
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

        res = operations.DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 404:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 405:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_folders_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo(self, request: operations.GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest) -> operations.GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse:
        r"""Get classification on folder
        Retrieves the classification metadata instance that
        has been applied to a folder.
        
        This API can also be called by including the enterprise ID in the
        URL explicitly, for example
        `/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", request.path_params)
        
        
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

        res = operations.GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.Classification])
                res.classification = out
        elif r.status_code == 403:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 404:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 405:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def post_folders_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo(self, request: operations.PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest) -> operations.PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse:
        r"""Add classification to folder
        Adds a classification to a folder by specifying the label of the
        classification to add.
        
        This API can also be called by including the enterprise ID in the
        URL explicitly, for example
        `/folders/:id//enterprise_12345/securityClassification-6VMVochwUWo`.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", request.path_params)
        
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

        res = operations.PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.Classification])
                res.classification = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 404:
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

    
    def put_folders_id_metadata_enterprise_security_classification_6_vm_vochw_u_wo(self, request: operations.PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest) -> operations.PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse:
        r"""Update classification on folder
        Updates a classification on a folder.
        
        The classification can only be updated if a classification has already been
        applied to the folder before. When editing classifications, only values are
        defined for the enterprise will be accepted.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/folders/{folder_id}/metadata/enterprise/securityClassification-6VMVochwUWo", request.path_params)
        
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

        res = operations.PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.Classification])
                res.classification = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        elif r.status_code == 500:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    