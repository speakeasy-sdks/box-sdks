import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class RetentionPolicyMiniDispositionActionEnum(str, Enum):
    PERMANENTLY_DELETE = "permanently_delete"
    REMOVE_RETENTION = "remove_retention"

class RetentionPolicyMiniTypeEnum(str, Enum):
    RETENTION_POLICY = "retention_policy"


@dataclass_json
@dataclasses.dataclass
class RetentionPolicyMini:
    r"""RetentionPolicyMini
    A base representation of a retention policy.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: RetentionPolicyMiniTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    disposition_action: Optional[RetentionPolicyMiniDispositionActionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('disposition_action') }})
    policy_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('policy_name') }})
    retention_length: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('retention_length') }})
    
