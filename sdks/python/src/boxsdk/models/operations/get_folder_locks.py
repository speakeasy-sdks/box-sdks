import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import folderlocks as shared_folderlocks


@dataclasses.dataclass
class GetFolderLocksQueryParams:
    folder_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'folder_id', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetFolderLocksRequest:
    query_params: GetFolderLocksQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFolderLocksResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    folder_locks: Optional[shared_folderlocks.FolderLocks] = dataclasses.field(default=None)
    
