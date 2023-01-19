import dataclasses
from typing import Any,Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import file as shared_file


@dataclasses.dataclass
class PutFilesIDNumberRemoveSharedLinkPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFilesIDNumberRemoveSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    

@dataclass_json
@dataclasses.dataclass
class PutFilesIDNumberRemoveSharedLinkRequestBody:
    shared_link: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    

@dataclasses.dataclass
class PutFilesIDNumberRemoveSharedLinkRequest:
    path_params: PutFilesIDNumberRemoveSharedLinkPathParams = dataclasses.field()
    query_params: PutFilesIDNumberRemoveSharedLinkQueryParams = dataclasses.field()
    request: Optional[PutFilesIDNumberRemoveSharedLinkRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFilesIDNumberRemoveSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file: Optional[shared_file.File] = dataclasses.field(default=None)
    
