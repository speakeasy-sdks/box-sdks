import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_mini as shared_user_mini
from ..shared import file_mini as shared_file_mini
from ..shared import taskassignments as shared_taskassignments

class TaskActionEnum(str, Enum):
    REVIEW = "review"
    COMPLETE = "complete"

class TaskCompletionRuleEnum(str, Enum):
    ALL_ASSIGNEES = "all_assignees"
    ANY_ASSIGNEE = "any_assignee"

class TaskTypeEnum(str, Enum):
    TASK = "task"


@dataclass_json
@dataclasses.dataclass
class Task:
    r"""Task
    A task allows for file-centric workflows within Box. Users can
    create tasks on files and assign them to other users for them to complete the
    tasks.
    """
    
    action: Optional[TaskActionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('action') }})
    completion_rule: Optional[TaskCompletionRuleEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('completion_rule') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    due_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('due_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    is_completed: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_completed') }})
    item: Optional[shared_file_mini.FileMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('item') }})
    message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    task_assignment_collection: Optional[shared_taskassignments.TaskAssignments] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('task_assignment_collection') }})
    type: Optional[TaskTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
