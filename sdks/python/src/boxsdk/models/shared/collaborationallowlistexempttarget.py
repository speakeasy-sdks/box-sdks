import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class CollaborationAllowlistExemptTargetEnterpriseTypeEnum(str, Enum):
    ENTERPRISE = "enterprise"


@dataclass_json
@dataclasses.dataclass
class CollaborationAllowlistExemptTargetEnterprise:
    r"""CollaborationAllowlistExemptTargetEnterprise
    A representation of a Box enterprise
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[CollaborationAllowlistExemptTargetEnterpriseTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class CollaborationAllowlistExemptTargetTypeEnum(str, Enum):
    COLLABORATION_WHITELIST = "collaboration_whitelist"


@dataclass_json
@dataclasses.dataclass
class CollaborationAllowlistExemptTarget:
    r"""CollaborationAllowlistExemptTarget
    The user that is exempt from any of the restrictions
    imposed by the list of allowed collaboration domains for this enterprise.
    """
    
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    enterprise: Optional[CollaborationAllowlistExemptTargetEnterprise] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('enterprise') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    type: Optional[CollaborationAllowlistExemptTargetTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    user: Optional[CollaborationAllowlistExemptTargetEnterprise] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('user') }})
    
