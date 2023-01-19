import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import retentionpolicy_mini as shared_retentionpolicy_mini


@dataclass_json
@dataclasses.dataclass
class RetentionPolicies:
    r"""RetentionPolicies
    The part of an API response that describes marker
    based pagination
    """
    
    entries: Optional[list[shared_retentionpolicy_mini.RetentionPolicyMini]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    next_marker: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next_marker') }})
    
