import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import storagepolicyassignment as shared_storagepolicyassignment


@dataclasses.dataclass
class GetStoragePolicyAssignmentsIDPathParams:
    storage_policy_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'storage_policy_assignment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetStoragePolicyAssignmentsIDRequest:
    path_params: GetStoragePolicyAssignmentsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetStoragePolicyAssignmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    storage_policy_assignment: Optional[shared_storagepolicyassignment.StoragePolicyAssignment] = dataclasses.field(default=None)
    
