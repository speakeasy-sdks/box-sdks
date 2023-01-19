import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_mini as shared_user_mini
from ..shared import file as shared_file
from ..shared import folder as shared_folder
from ..shared import weblink as shared_weblink
from ..shared import legalholdpolicy_mini as shared_legalholdpolicy_mini

class LegalHoldPolicyAssignmentTypeEnum(str, Enum):
    LEGAL_HOLD_POLICY_ASSIGNMENT = "legal_hold_policy_assignment"


@dataclass_json
@dataclasses.dataclass
class LegalHoldPolicyAssignment:
    r"""LegalHoldPolicyAssignment
    Legal Hold Assignments are used to assign Legal Hold
    Policies to Users, Folders, Files, or File Versions.
    
    Creating a Legal Hold Assignment puts a hold
    on the File-Versions that belong to the Assignment's
    'apply-to' entity.
    """
    
    assigned_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('assigned_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    assigned_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('assigned_by') }})
    assigned_to: Optional[Any] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('assigned_to') }})
    deleted_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('deleted_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    legal_hold_policy: Optional[shared_legalholdpolicy_mini.LegalHoldPolicyMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('legal_hold_policy') }})
    type: Optional[LegalHoldPolicyAssignmentTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
