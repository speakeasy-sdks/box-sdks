import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import retentionpolicyassignment as shared_retentionpolicyassignment

class PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum(str, Enum):
    ENTERPRISE = "enterprise"
    FOLDER = "folder"
    METADATA_TEMPLATE = "metadata_template"


@dataclass_json
@dataclasses.dataclass
class PostRetentionPolicyAssignmentsRequestBodyAssignTo:
    r"""PostRetentionPolicyAssignmentsRequestBodyAssignTo
    The item to assign the policy to
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PostRetentionPolicyAssignmentsRequestBodyFilterFields:
    field: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('field') }})
    value: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    

@dataclass_json
@dataclasses.dataclass
class PostRetentionPolicyAssignmentsRequestBody:
    assign_to: PostRetentionPolicyAssignmentsRequestBodyAssignTo = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('assign_to') }})
    policy_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('policy_id') }})
    filter_fields: Optional[list[PostRetentionPolicyAssignmentsRequestBodyFilterFields]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('filter_fields') }})
    start_date_field: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('start_date_field') }})
    

@dataclasses.dataclass
class PostRetentionPolicyAssignmentsRequest:
    request: Optional[PostRetentionPolicyAssignmentsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostRetentionPolicyAssignmentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    retention_policy_assignment: Optional[shared_retentionpolicyassignment.RetentionPolicyAssignment] = dataclasses.field(default=None)
    
