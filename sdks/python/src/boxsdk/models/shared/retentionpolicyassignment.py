import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_mini as shared_user_mini
from ..shared import retentionpolicy_mini as shared_retentionpolicy_mini

class RetentionPolicyAssignmentAssignedToTypeEnum(str, Enum):
    FOLDER = "folder"
    ENTERPRISE = "enterprise"
    METADATA_TEMPLATE = "metadata_template"


@dataclass_json
@dataclasses.dataclass
class RetentionPolicyAssignmentAssignedTo:
    r"""RetentionPolicyAssignmentAssignedTo
    The `type` and `id` of the content that is under
    retention. The `type` can either be `folder`
    `enterprise`, or `metadata_template`.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[RetentionPolicyAssignmentAssignedToTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class RetentionPolicyAssignmentFilterFields:
    field: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('field') }})
    value: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    
class RetentionPolicyAssignmentTypeEnum(str, Enum):
    RETENTION_POLICY_ASSIGNMENT = "retention_policy_assignment"


@dataclass_json
@dataclasses.dataclass
class RetentionPolicyAssignment:
    r"""RetentionPolicyAssignment
    A retention assignment represents a rule specifying
    the files a retention policy retains.
    Assignments can retain files based on their folder or metadata,
    or hold all files in the enterprise.
    """
    
    assigned_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('assigned_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    assigned_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('assigned_by') }})
    assigned_to: Optional[RetentionPolicyAssignmentAssignedTo] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('assigned_to') }})
    filter_fields: Optional[list[RetentionPolicyAssignmentFilterFields]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('filter_fields') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    retention_policy: Optional[shared_retentionpolicy_mini.RetentionPolicyMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('retention_policy') }})
    start_date_field: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('start_date_field') }})
    type: Optional[RetentionPolicyAssignmentTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
