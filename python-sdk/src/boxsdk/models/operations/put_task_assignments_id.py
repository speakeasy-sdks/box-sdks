import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import taskassignment as shared_taskassignment


@dataclasses.dataclass
class PutTaskAssignmentsIDPathParams:
    task_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'task_assignment_id', 'style': 'simple', 'explode': False }})
    
class PutTaskAssignmentsIDRequestBodyResolutionStateEnum(str, Enum):
    COMPLETED = "completed"
    INCOMPLETE = "incomplete"
    APPROVED = "approved"
    REJECTED = "rejected"


@dataclass_json
@dataclasses.dataclass
class PutTaskAssignmentsIDRequestBody:
    message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    resolution_state: Optional[PutTaskAssignmentsIDRequestBodyResolutionStateEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('resolution_state') }})
    

@dataclasses.dataclass
class PutTaskAssignmentsIDRequest:
    path_params: PutTaskAssignmentsIDPathParams = dataclasses.field()
    request: Optional[PutTaskAssignmentsIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutTaskAssignmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    task_assignment: Optional[shared_taskassignment.TaskAssignment] = dataclasses.field(default=None)
    
