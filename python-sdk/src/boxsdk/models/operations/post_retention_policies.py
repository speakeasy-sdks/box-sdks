import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_mini as shared_user_mini
from ..shared import clienterror as shared_clienterror
from ..shared import retentionpolicy as shared_retentionpolicy

class PostRetentionPoliciesRequestBodyDispositionActionEnum(str, Enum):
    PERMANENTLY_DELETE = "permanently_delete"
    REMOVE_RETENTION = "remove_retention"

class PostRetentionPoliciesRequestBodyPolicyTypeEnum(str, Enum):
    FINITE = "finite"
    INDEFINITE = "indefinite"

class PostRetentionPoliciesRequestBodyRetentionTypeEnum(str, Enum):
    MODIFIABLE = "modifiable"
    NON_MODIFIABLE = "non-modifiable"


@dataclass_json
@dataclasses.dataclass
class PostRetentionPoliciesRequestBody:
    disposition_action: PostRetentionPoliciesRequestBodyDispositionActionEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('disposition_action') }})
    policy_name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('policy_name') }})
    policy_type: PostRetentionPoliciesRequestBodyPolicyTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('policy_type') }})
    are_owners_notified: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('are_owners_notified') }})
    can_owner_extend_retention: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_owner_extend_retention') }})
    custom_notification_recipients: Optional[list[shared_user_mini.UserMini]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('custom_notification_recipients') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    retention_length: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('retention_length') }})
    retention_type: Optional[PostRetentionPoliciesRequestBodyRetentionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('retention_type') }})
    

@dataclasses.dataclass
class PostRetentionPoliciesRequest:
    request: Optional[PostRetentionPoliciesRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostRetentionPoliciesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    retention_policy: Optional[shared_retentionpolicy.RetentionPolicy] = dataclasses.field(default=None)
    
