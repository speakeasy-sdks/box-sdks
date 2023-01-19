import requests
from typing import Optional
from boxsdk.models import shared, operations
from . import utils

class TransferFolders:
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

    
    def put_users_id_folders_0(self, request: operations.PutUsersIDFolders0Request) -> operations.PutUsersIDFolders0Response:
        r"""Transfer owned folders
        Move all of the items (files, folders and workflows) owned by a user into
        another user's account
        
        Only the root folder (`0`) can be transferred.
        
        Folders can only be moved across users by users with administrative
        permissions.
        
        All existing shared links and folder-level collaborations are transferred
        during the operation. Please note that while collaborations at the individual
        file-level are transferred during the operation, the collaborations are
        deleted when the original user is deleted.
        
        This call will be performed synchronously which might lead to a slow response
        when the source user has a large number of items in all of its folders.
        
        If the destination path has a metadata cascade policy attached to any of
        the parent folders, a metadata cascade operation will be kicked off
        asynchronously.
        
        There is currently no way to check for when this operation is finished.
        
        The destination folder's name will be in the format `{User}'s Files and
        Folders`, where `{User}` is the display name of the user.
        
        To make this API call your application will need to have the \"Read and write
        all files and folders stored in Box\" scope enabled.
        
        Please make sure the destination user has access to `Relay` or `Relay Lite`,
        and has access to the files and folders involved in the workflows being
        transferred.
        
        Admins will receive an email when the operation is completed.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/users/{user_id}/folders/0", request.path_params)
        
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
            return client.request("PUT", url, params=query_params, data=data, json=json, files=files, headers=headers)
        
        r = utils.retry(do_request, utils.Retries(retry_config, [
            "5XX"
        ]))
        content_type = r.headers.get("Content-Type")

        res = operations.PutUsersIDFolders0Response(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.Folder])
                res.folder = out
        elif r.status_code == 403:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ClientError])
                res.client_error = out

        return res

    