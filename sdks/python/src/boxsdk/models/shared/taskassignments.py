import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import taskassignment as shared_taskassignment


@dataclass_json
@dataclasses.dataclass
class TaskAssignments:
    r"""TaskAssignments
    A list of task assignments
    """
    
    entries: Optional[list[shared_taskassignment.TaskAssignment]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    total_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
