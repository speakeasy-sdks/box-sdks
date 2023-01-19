import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import fileversionretention as shared_fileversionretention


@dataclasses.dataclass
class GetFileVersionRetentionsIDPathParams:
    file_version_retention_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_version_retention_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFileVersionRetentionsIDRequest:
    path_params: GetFileVersionRetentionsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFileVersionRetentionsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_version_retention: Optional[shared_fileversionretention.FileVersionRetention] = dataclasses.field(default=None)
    
