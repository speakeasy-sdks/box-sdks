import dataclasses
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class RetentionPolicyAssignmentBaseTypeEnum(str, Enum):
    RETENTION_POLICY_ASSIGNMENT = "retention_policy_assignment"


@dataclass_json
@dataclasses.dataclass
class RetentionPolicyAssignmentBase:
    r"""RetentionPolicyAssignmentBase
    A base representation of a retention policy assignment.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: RetentionPolicyAssignmentBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
