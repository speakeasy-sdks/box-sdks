import requests
from typing import Any,Optional
from boxsdk.models import shared, operations
from . import utils

class TrashedItems:
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

    
    def get_folders_trash_items(self, request: operations.GetFoldersTrashItemsRequest) -> operations.GetFoldersTrashItemsResponse:
        r"""List trashed items
        Retrieves the files and folders that have been moved
        to the trash.
        
        Any attribute in the full files or folders objects can be passed
        in with the `fields` parameter to retrieve those specific
        attributes that are not returned by default.
        
        This endpoint defaults to use offset-based pagination, yet also supports
        marker-based pagination using the `marker` parameter.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/folders/trash/items"
        
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

        res = operations.GetFoldersTrashItemsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.Items])
                res.items = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    