import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import legalholdpolicyassignment as shared_legalholdpolicyassignment


@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsIDPathParams:
    legal_hold_policy_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'legal_hold_policy_assignment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsIDRequest:
    path_params: GetLegalHoldPolicyAssignmentsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    legal_hold_policy_assignment: Optional[shared_legalholdpolicyassignment.LegalHoldPolicyAssignment] = dataclasses.field(default=None)
    
