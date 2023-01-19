import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import retentionpolicyassignment as shared_retentionpolicyassignment


@dataclasses.dataclass
class GetRetentionPolicyAssignmentsIDPathParams:
    retention_policy_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'retention_policy_assignment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetRetentionPolicyAssignmentsIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetRetentionPolicyAssignmentsIDRequest:
    path_params: GetRetentionPolicyAssignmentsIDPathParams = dataclasses.field()
    query_params: GetRetentionPolicyAssignmentsIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetRetentionPolicyAssignmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    retention_policy_assignment: Optional[shared_retentionpolicyassignment.RetentionPolicyAssignment] = dataclasses.field(default=None)
    
