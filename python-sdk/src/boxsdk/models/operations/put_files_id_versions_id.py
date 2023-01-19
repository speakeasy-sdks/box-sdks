import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import fileversion as shared_fileversion


@dataclasses.dataclass
class PutFilesIDVersionsIDPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    file_version_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_version_id', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PutFilesIDVersionsIDRequestBody:
    r"""PutFilesIDVersionsIDRequestBody
    The file version to be
    restored
    """
    
    trashed_at: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('trashed_at') }})
    

@dataclasses.dataclass
class PutFilesIDVersionsIDRequest:
    path_params: PutFilesIDVersionsIDPathParams = dataclasses.field()
    request: Optional[PutFilesIDVersionsIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFilesIDVersionsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_version: Optional[shared_fileversion.FileVersion] = dataclasses.field(default=None)
    
