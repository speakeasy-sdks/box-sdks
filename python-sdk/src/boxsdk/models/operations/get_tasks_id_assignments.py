import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import taskassignments as shared_taskassignments


@dataclasses.dataclass
class GetTasksIDAssignmentsPathParams:
    task_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'task_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetTasksIDAssignmentsRequest:
    path_params: GetTasksIDAssignmentsPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetTasksIDAssignmentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    task_assignments: Optional[shared_taskassignments.TaskAssignments] = dataclasses.field(default=None)
    
