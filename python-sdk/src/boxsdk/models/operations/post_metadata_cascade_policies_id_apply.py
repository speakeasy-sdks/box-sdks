import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class PostMetadataCascadePoliciesIDApplyPathParams:
    metadata_cascade_policy_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'metadata_cascade_policy_id', 'style': 'simple', 'explode': False }})
    
class PostMetadataCascadePoliciesIDApplyRequestBodyConflictResolutionEnum(str, Enum):
    NONE = "none"
    OVERWRITE = "overwrite"


@dataclass_json
@dataclasses.dataclass
class PostMetadataCascadePoliciesIDApplyRequestBody:
    conflict_resolution: PostMetadataCascadePoliciesIDApplyRequestBodyConflictResolutionEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('conflict_resolution') }})
    

@dataclasses.dataclass
class PostMetadataCascadePoliciesIDApplyRequest:
    path_params: PostMetadataCascadePoliciesIDApplyPathParams = dataclasses.field()
    request: Optional[PostMetadataCascadePoliciesIDApplyRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostMetadataCascadePoliciesIDApplyResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
