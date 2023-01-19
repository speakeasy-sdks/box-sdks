import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import conflicterror as shared_conflicterror
from ..shared import metadatacascadepolicy as shared_metadatacascadepolicy

class PostMetadataCascadePoliciesRequestBodyScopeEnum(str, Enum):
    GLOBAL = "global"
    ENTERPRISE = "enterprise"


@dataclass_json
@dataclasses.dataclass
class PostMetadataCascadePoliciesRequestBody:
    folder_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder_id') }})
    scope: PostMetadataCascadePoliciesRequestBodyScopeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('scope') }})
    template_key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('templateKey') }})
    

@dataclasses.dataclass
class PostMetadataCascadePoliciesRequest:
    request: Optional[PostMetadataCascadePoliciesRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostMetadataCascadePoliciesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    conflict_error: Optional[shared_conflicterror.ConflictError] = dataclasses.field(default=None)
    metadata_cascade_policy: Optional[shared_metadatacascadepolicy.MetadataCascadePolicy] = dataclasses.field(default=None)
    
