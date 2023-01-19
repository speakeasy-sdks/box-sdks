import dataclasses
from typing import Any,Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import folder as shared_folder


@dataclasses.dataclass
class PutFoldersIDNumberRemoveSharedLinkPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFoldersIDNumberRemoveSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    

@dataclass_json
@dataclasses.dataclass
class PutFoldersIDNumberRemoveSharedLinkRequestBody:
    shared_link: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    

@dataclasses.dataclass
class PutFoldersIDNumberRemoveSharedLinkRequest:
    path_params: PutFoldersIDNumberRemoveSharedLinkPathParams = dataclasses.field()
    query_params: PutFoldersIDNumberRemoveSharedLinkQueryParams = dataclasses.field()
    request: Optional[PutFoldersIDNumberRemoveSharedLinkRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFoldersIDNumberRemoveSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    folder: Optional[shared_folder.Folder] = dataclasses.field(default=None)
    
