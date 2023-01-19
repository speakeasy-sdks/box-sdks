import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class LegalHoldPolicyAssignmentBaseTypeEnum(str, Enum):
    LEGAL_HOLD_POLICY_ASSIGNMENT = "legal_hold_policy_assignment"


@dataclass_json
@dataclasses.dataclass
class LegalHoldPolicyAssignmentBase:
    r"""LegalHoldPolicyAssignmentBase
    Legal Hold Assignments are used to assign Legal Hold
    Policies to Users, Folders, Files, or File Versions.
    
    Creating a Legal Hold Assignment puts a hold
    on the File-Versions that belong to the Assignment's
    'apply-to' entity.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[LegalHoldPolicyAssignmentBaseTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
