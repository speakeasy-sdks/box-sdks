import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class MetadataTemplates:
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

    
    def delete_metadata_templates_id_id_schema(self, request: operations.DeleteMetadataTemplatesIDIDSchemaRequest) -> operations.DeleteMetadataTemplatesIDIDSchemaResponse:
        r"""Remove metadata template
        Delete a metadata template and its instances.
        This deletion is permanent and can not be reversed.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/metadata_templates/{scope}/{template_key}/schema", request.path_params)
        
        
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

        res = operations.DeleteMetadataTemplatesIDIDSchemaResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        elif r.status_code == 400:
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

    
    def get_metadata_templates(self, request: operations.GetMetadataTemplatesRequest) -> operations.GetMetadataTemplatesResponse:
        r"""Find metadata template by instance ID
        Finds a metadata template by searching for the ID of an instance of the
        template.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates"
        
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

        res = operations.GetMetadataTemplatesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.MetadataTemplates])
                res.metadata_templates = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_metadata_templates_enterprise(self, request: operations.GetMetadataTemplatesEnterpriseRequest) -> operations.GetMetadataTemplatesEnterpriseResponse:
        r"""List all metadata templates for enterprise
        Used to retrieve all metadata templates created to be used specifically within
        the user's enterprise
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates/enterprise"
        
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

        res = operations.GetMetadataTemplatesEnterpriseResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.MetadataTemplates])
                res.metadata_templates = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_metadata_templates_global(self, request: operations.GetMetadataTemplatesGlobalRequest) -> operations.GetMetadataTemplatesGlobalResponse:
        r"""List all global metadata templates
        Used to retrieve all generic, global metadata templates available to all
        enterprises using Box.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates/global"
        
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

        res = operations.GetMetadataTemplatesGlobalResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.MetadataTemplates])
                res.metadata_templates = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_metadata_templates_id(self, request: operations.GetMetadataTemplatesIDRequest) -> operations.GetMetadataTemplatesIDResponse:
        r"""Get metadata template by ID
        Retrieves a metadata template by its ID.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/metadata_templates/{template_id}", request.path_params)
        
        
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

        res = operations.GetMetadataTemplatesIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.MetadataTemplate])
                res.metadata_template = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.MetadataTemplate])
                res.metadata_template = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    
    def get_metadata_templates_id_id_schema(self, request: operations.GetMetadataTemplatesIDIDSchemaRequest) -> operations.GetMetadataTemplatesIDIDSchemaResponse:
        r"""Get metadata template by name
        Retrieves a metadata template by its `scope` and `templateKey` values.
        
        To find the `scope` and `templateKey` for a template, list all templates for
        an enterprise or globally, or list all templates applied to a file or folder.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/metadata_templates/{scope}/{template_key}/schema", request.path_params)
        
        
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

        res = operations.GetMetadataTemplatesIDIDSchemaResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.MetadataTemplate])
                res.metadata_template = out
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

    
    def post_metadata_templates_schema(self, request: operations.PostMetadataTemplatesSchemaRequest) -> operations.PostMetadataTemplatesSchemaResponse:
        r"""Create metadata template
        Creates a new metadata template that can be applied to
        files and folders.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/metadata_templates/schema"
        
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

        res = operations.PostMetadataTemplatesSchemaResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.MetadataTemplate])
                res.metadata_template = out
        elif r.status_code == 400:
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

    
    def put_metadata_templates_id_id_schema(self, request: operations.PutMetadataTemplatesIDIDSchemaRequest) -> operations.PutMetadataTemplatesIDIDSchemaResponse:
        r"""Update metadata template
        Updates a metadata template.
        
        The metadata template can only be updated if the template
        already exists.
        
        The update is applied atomically. If any errors occur during the
        application of the operations, the metadata template will not be changed.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/metadata_templates/{scope}/{template_key}/schema", request.path_params)
        
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

        res = operations.PutMetadataTemplatesIDIDSchemaResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.MetadataTemplate])
                res.metadata_template = out
        elif r.status_code == 400:
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

    