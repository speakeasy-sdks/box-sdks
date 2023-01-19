import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import trashfolder as shared_trashfolder


@dataclasses.dataclass
class GetFoldersIDTrashPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFoldersIDTrashQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetFoldersIDTrashRequest:
    path_params: GetFoldersIDTrashPathParams = dataclasses.field()
    query_params: GetFoldersIDTrashQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFoldersIDTrashResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    trash_folder: Optional[shared_trashfolder.TrashFolder] = dataclasses.field(default=None)
    
