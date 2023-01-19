import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import storagepolicyassignment as shared_storagepolicyassignment

class PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum(str, Enum):
    USER = "user"
    ENTERPRISE = "enterprise"


@dataclass_json
@dataclasses.dataclass
class PostStoragePolicyAssignmentsRequestBodyAssignedTo:
    r"""PostStoragePolicyAssignmentsRequestBodyAssignedTo
    The user or enterprise to assign the storage
    policy to.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnum(str, Enum):
    STORAGE_POLICY = "storage_policy"


@dataclass_json
@dataclasses.dataclass
class PostStoragePolicyAssignmentsRequestBodyStoragePolicy:
    r"""PostStoragePolicyAssignmentsRequestBodyStoragePolicy
    The storage policy to assign to the user or
    enterprise
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PostStoragePolicyAssignmentsRequestBody:
    assigned_to: PostStoragePolicyAssignmentsRequestBodyAssignedTo = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('assigned_to') }})
    storage_policy: PostStoragePolicyAssignmentsRequestBodyStoragePolicy = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('storage_policy') }})
    

@dataclasses.dataclass
class PostStoragePolicyAssignmentsRequest:
    request: Optional[PostStoragePolicyAssignmentsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostStoragePolicyAssignmentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    storage_policy_assignment: Optional[shared_storagepolicyassignment.StoragePolicyAssignment] = dataclasses.field(default=None)
    
