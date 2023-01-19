import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import taskassignment as shared_taskassignment


@dataclass_json
@dataclasses.dataclass
class PostTaskAssignmentsRequestBodyAssignTo:
    r"""PostTaskAssignmentsRequestBodyAssignTo
    The user to assign the task to.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    login: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('login') }})
    
class PostTaskAssignmentsRequestBodyTaskTypeEnum(str, Enum):
    TASK = "task"


@dataclass_json
@dataclasses.dataclass
class PostTaskAssignmentsRequestBodyTask:
    r"""PostTaskAssignmentsRequestBodyTask
    The task to assign to a user.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostTaskAssignmentsRequestBodyTaskTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PostTaskAssignmentsRequestBody:
    assign_to: PostTaskAssignmentsRequestBodyAssignTo = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('assign_to') }})
    task: PostTaskAssignmentsRequestBodyTask = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('task') }})
    

@dataclasses.dataclass
class PostTaskAssignmentsRequest:
    request: Optional[PostTaskAssignmentsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostTaskAssignmentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    task_assignment: Optional[shared_taskassignment.TaskAssignment] = dataclasses.field(default=None)
    
