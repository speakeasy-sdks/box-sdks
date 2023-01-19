import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import folder as shared_folder


@dataclasses.dataclass
class GetFoldersIDNumberGetSharedLinkPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFoldersIDNumberGetSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetFoldersIDNumberGetSharedLinkRequest:
    path_params: GetFoldersIDNumberGetSharedLinkPathParams = dataclasses.field()
    query_params: GetFoldersIDNumberGetSharedLinkQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFoldersIDNumberGetSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    folder: Optional[shared_folder.Folder] = dataclasses.field(default=None)
    
