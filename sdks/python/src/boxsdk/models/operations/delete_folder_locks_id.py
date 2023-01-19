import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteFolderLocksIDPathParams:
    folder_lock_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_lock_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteFolderLocksIDRequest:
    path_params: DeleteFolderLocksIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteFolderLocksIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
