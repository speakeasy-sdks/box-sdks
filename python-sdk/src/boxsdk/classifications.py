import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class Classifications:
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

    
    def delete_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema(self, request: operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaRequest) -> operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaResponse:
        r"""Delete all classifications
        Delete all classifications by deleting the classification
        metadata template.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema"
        
        
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

        res = operations.DeleteMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema(self, request: operations.GetMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaRequest) -> operations.GetMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaResponse:
        r"""List all classifications
        Retrieves the classification metadata template and lists all the
        classifications available to this enterprise.
        
        This API can also be called by including the enterprise ID in the
        URL explicitly, for example
        `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema"
        
        
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

        res = operations.GetMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClassificationTemplate])
                res.classification_template = out
        elif r.status_code == 400:
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

    
    def post_metadata_templates_schema_number_classifications(self, request: operations.PostMetadataTemplatesSchemaNumberClassificationsRequest) -> operations.PostMetadataTemplatesSchemaNumberClassificationsResponse:
        r"""Add initial classifications
        When an enterprise does not yet have any classifications, this API call
        initializes the classification template with an initial set of
        classifications.
        
        If an enterprise already has a classification, the template will already
        exist and instead an API call should be made to add additional
        classifications.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates/schema#classifications"
        
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

        res = operations.PostMetadataTemplatesSchemaNumberClassificationsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClassificationTemplate])
                res.classification_template = out
        elif r.status_code == 400:
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

    
    def put_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema_number_add(self, request: operations.PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequest) -> operations.PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddResponse:
        r"""Add classification
        Adds one or more new classifications to the list of classifications
        available to the enterprise.
        
        This API can also be called by including the enterprise ID in the
        URL explicitly, for example
        `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#add"
        
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

        res = operations.PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClassificationTemplate])
                res.classification_template = out
        elif r.status_code == 400:
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

    
    def put_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema_number_delete(self, request: operations.PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteRequest) -> operations.PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteResponse:
        r"""Delete classification
        Removes a classification from the list of classifications
        available to the enterprise.
        
        This API can also be called by including the enterprise ID in the
        URL explicitly, for example
        `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#delete"
        
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

        res = operations.PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClassificationTemplate])
                res.classification_template = out
        elif r.status_code == 400:
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

    
    def put_metadata_templates_enterprise_security_classification_6_vm_vochw_u_wo_schema_number_update(self, request: operations.PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequest) -> operations.PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateResponse:
        r"""Update classification
        Updates the labels and descriptions of one or more classifications
        available to the enterprise.
        
        This API can also be called by including the enterprise ID in the
        URL explicitly, for example
        `/metadata_templates/enterprise_12345/securityClassification-6VMVochwUWo/schema`.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates/enterprise/securityClassification-6VMVochwUWo/schema#update"
        
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

        res = operations.PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClassificationTemplate])
                res.classification_template = out
        elif r.status_code == 400:
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

    