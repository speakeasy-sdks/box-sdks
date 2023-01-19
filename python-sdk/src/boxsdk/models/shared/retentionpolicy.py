import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_mini as shared_user_mini


@dataclass_json
@dataclasses.dataclass
class RetentionPolicyAssignmentCounts:
    r"""RetentionPolicyAssignmentCounts
    Counts the retention policy assignments for each item type.
    """
    
    enterprise: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('enterprise') }})
    folder: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder') }})
    metadata_template: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('metadata_template') }})
    
class RetentionPolicyDispositionActionEnum(str, Enum):
    PERMANENTLY_DELETE = "permanently_delete"
    REMOVE_RETENTION = "remove_retention"

class RetentionPolicyPolicyTypeEnum(str, Enum):
    FINITE = "finite"
    INDEFINITE = "indefinite"

class RetentionPolicyRetentionTypeEnum(str, Enum):
    MODIFIABLE = "modifiable"
    NON_MODIFIABLE = "non-modifiable"

class RetentionPolicyStatusEnum(str, Enum):
    ACTIVE = "active"
    RETIRED = "retired"

class RetentionPolicyTypeEnum(str, Enum):
    RETENTION_POLICY = "retention_policy"


@dataclass_json
@dataclasses.dataclass
class RetentionPolicy:
    r"""RetentionPolicy
    A base representation of a retention policy.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: RetentionPolicyTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    are_owners_notified: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('are_owners_notified') }})
    assignment_counts: Optional[RetentionPolicyAssignmentCounts] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('assignment_counts') }})
    can_owner_extend_retention: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_owner_extend_retention') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    custom_notification_recipients: Optional[list[shared_user_mini.UserMini]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('custom_notification_recipients') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    disposition_action: Optional[RetentionPolicyDispositionActionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('disposition_action') }})
    modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    policy_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('policy_name') }})
    policy_type: Optional[RetentionPolicyPolicyTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('policy_type') }})
    retention_length: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('retention_length') }})
    retention_type: Optional[RetentionPolicyRetentionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('retention_type') }})
    status: Optional[RetentionPolicyStatusEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    
