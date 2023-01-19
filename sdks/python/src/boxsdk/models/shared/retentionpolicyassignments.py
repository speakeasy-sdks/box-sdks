import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import retentionpolicyassignment_base as shared_retentionpolicyassignment_base


@dataclass_json
@dataclasses.dataclass
class RetentionPolicyAssignments:
    r"""RetentionPolicyAssignments
    The part of an API response that describes marker
    based pagination
    """
    
    entries: Optional[list[shared_retentionpolicyassignment_base.RetentionPolicyAssignmentBase]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    next_marker: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next_marker') }})
    
