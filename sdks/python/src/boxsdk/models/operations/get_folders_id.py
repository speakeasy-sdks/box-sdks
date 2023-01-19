import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import folder as shared_folder


@dataclasses.dataclass
class GetFoldersIDPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFoldersIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetFoldersIDHeaders:
    boxapi: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'boxapi', 'style': 'simple', 'explode': False }})
    if_none_match: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'if-none-match', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFoldersIDRequest:
    headers: GetFoldersIDHeaders = dataclasses.field()
    path_params: GetFoldersIDPathParams = dataclasses.field()
    query_params: GetFoldersIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFoldersIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    folder: Optional[shared_folder.Folder] = dataclasses.field(default=None)
    
