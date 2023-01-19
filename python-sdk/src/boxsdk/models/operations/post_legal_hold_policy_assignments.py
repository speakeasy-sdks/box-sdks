import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import legalholdpolicyassignment as shared_legalholdpolicyassignment

class PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum(str, Enum):
    FILE = "file"
    FILE_VERSION = "file_version"
    FOLDER = "folder"
    USER = "user"


@dataclass_json
@dataclasses.dataclass
class PostLegalHoldPolicyAssignmentsRequestBodyAssignTo:
    r"""PostLegalHoldPolicyAssignmentsRequestBodyAssignTo
    The item to assign the policy to
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PostLegalHoldPolicyAssignmentsRequestBody:
    assign_to: PostLegalHoldPolicyAssignmentsRequestBodyAssignTo = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('assign_to') }})
    policy_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('policy_id') }})
    

@dataclasses.dataclass
class PostLegalHoldPolicyAssignmentsRequest:
    request: Optional[PostLegalHoldPolicyAssignmentsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostLegalHoldPolicyAssignmentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    legal_hold_policy_assignment: Optional[shared_legalholdpolicyassignment.LegalHoldPolicyAssignment] = dataclasses.field(default=None)
    
