import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteFilesIDVersionsIDPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    file_version_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_version_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteFilesIDVersionsIDHeaders:
    if_match: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'if-match', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteFilesIDVersionsIDRequest:
    headers: DeleteFilesIDVersionsIDHeaders = dataclasses.field()
    path_params: DeleteFilesIDVersionsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteFilesIDVersionsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
