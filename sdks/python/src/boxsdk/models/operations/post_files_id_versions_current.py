import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import fileversion as shared_fileversion


@dataclasses.dataclass
class PostFilesIDVersionsCurrentPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PostFilesIDVersionsCurrentQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    
class PostFilesIDVersionsCurrentRequestBodyTypeEnum(str, Enum):
    FILE_VERSION = "file_version"


@dataclass_json
@dataclasses.dataclass
class PostFilesIDVersionsCurrentRequestBody:
    r"""PostFilesIDVersionsCurrentRequestBody
    The file version to promote
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[PostFilesIDVersionsCurrentRequestBodyTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclasses.dataclass
class PostFilesIDVersionsCurrentRequest:
    path_params: PostFilesIDVersionsCurrentPathParams = dataclasses.field()
    query_params: PostFilesIDVersionsCurrentQueryParams = dataclasses.field()
    request: Optional[PostFilesIDVersionsCurrentRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFilesIDVersionsCurrentResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_version: Optional[shared_fileversion.FileVersion] = dataclasses.field(default=None)
    
