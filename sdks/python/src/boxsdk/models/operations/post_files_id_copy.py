import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import file as shared_file


@dataclasses.dataclass
class PostFilesIDCopyPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PostFilesIDCopyQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostFilesIDCopyRequestBodyParent:
    r"""PostFilesIDCopyRequestBodyParent
    The destination folder to copy the file to.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    

@dataclass_json
@dataclasses.dataclass
class PostFilesIDCopyRequestBody:
    parent: PostFilesIDCopyRequestBodyParent = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    version: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('version') }})
    

@dataclasses.dataclass
class PostFilesIDCopyRequest:
    path_params: PostFilesIDCopyPathParams = dataclasses.field()
    query_params: PostFilesIDCopyQueryParams = dataclasses.field()
    request: Optional[PostFilesIDCopyRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFilesIDCopyResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file: Optional[shared_file.File] = dataclasses.field(default=None)
    
