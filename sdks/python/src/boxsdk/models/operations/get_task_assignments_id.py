import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import taskassignment as shared_taskassignment


@dataclasses.dataclass
class GetTaskAssignmentsIDPathParams:
    task_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'task_assignment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetTaskAssignmentsIDRequest:
    path_params: GetTaskAssignmentsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetTaskAssignmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    task_assignment: Optional[shared_taskassignment.TaskAssignment] = dataclasses.field(default=None)
    
