import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteStoragePolicyAssignmentsIDPathParams:
    storage_policy_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'storage_policy_assignment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteStoragePolicyAssignmentsIDRequest:
    path_params: DeleteStoragePolicyAssignmentsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteStoragePolicyAssignmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
