import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class LegalHoldPolicyMiniTypeEnum(str, Enum):
    LEGAL_HOLD_POLICY = "legal_hold_policy"


@dataclass_json
@dataclasses.dataclass
class LegalHoldPolicyMini:
    r"""LegalHoldPolicyMini
    A mini legal hold policy
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[LegalHoldPolicyMiniTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
