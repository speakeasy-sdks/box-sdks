import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteRetentionPolicyAssignmentsIDPathParams:
    retention_policy_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'retention_policy_assignment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteRetentionPolicyAssignmentsIDRequest:
    path_params: DeleteRetentionPolicyAssignmentsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteRetentionPolicyAssignmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
