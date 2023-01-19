import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import fileversionlegalhold as shared_fileversionlegalhold


@dataclasses.dataclass
class GetFileVersionLegalHoldsIDPathParams:
    file_version_legal_hold_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_version_legal_hold_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFileVersionLegalHoldsIDRequest:
    path_params: GetFileVersionLegalHoldsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFileVersionLegalHoldsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_version_legal_hold: Optional[shared_fileversionlegalhold.FileVersionLegalHold] = dataclasses.field(default=None)
    
