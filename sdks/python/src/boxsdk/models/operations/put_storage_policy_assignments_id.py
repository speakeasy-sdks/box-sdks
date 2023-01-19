import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import storagepolicyassignment as shared_storagepolicyassignment


@dataclasses.dataclass
class PutStoragePolicyAssignmentsIDPathParams:
    storage_policy_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'storage_policy_assignment_id', 'style': 'simple', 'explode': False }})
    
class PutStoragePolicyAssignmentsIDRequestBodyStoragePolicyTypeEnum(str, Enum):
    STORAGE_POLICY = "storage_policy"


@dataclass_json
@dataclasses.dataclass
class PutStoragePolicyAssignmentsIDRequestBodyStoragePolicy:
    r"""PutStoragePolicyAssignmentsIDRequestBodyStoragePolicy
    The storage policy to assign to the user or
    enterprise
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PutStoragePolicyAssignmentsIDRequestBodyStoragePolicyTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PutStoragePolicyAssignmentsIDRequestBody:
    storage_policy: PutStoragePolicyAssignmentsIDRequestBodyStoragePolicy = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('storage_policy') }})
    

@dataclasses.dataclass
class PutStoragePolicyAssignmentsIDRequest:
    path_params: PutStoragePolicyAssignmentsIDPathParams = dataclasses.field()
    request: Optional[PutStoragePolicyAssignmentsIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutStoragePolicyAssignmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    storage_policy_assignment: Optional[shared_storagepolicyassignment.StoragePolicyAssignment] = dataclasses.field(default=None)
    
