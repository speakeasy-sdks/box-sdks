import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import storagepolicyassignment as shared_storagepolicyassignment


@dataclass_json
@dataclasses.dataclass
class StoragePolicyAssignments:
    r"""StoragePolicyAssignments
    The part of an API response that describes marker
    based pagination
    """
    
    entries: Optional[list[shared_storagepolicyassignment.StoragePolicyAssignment]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    next_marker: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next_marker') }})
    prev_marker: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('prev_marker') }})
    