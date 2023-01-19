import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class CollaborationAllowlistEntryDirectionEnum(str, Enum):
    INBOUND = "inbound"
    OUTBOUND = "outbound"
    BOTH = "both"

class CollaborationAllowlistEntryEnterpriseTypeEnum(str, Enum):
    ENTERPRISE = "enterprise"


@dataclass_json
@dataclasses.dataclass
class CollaborationAllowlistEntryEnterprise:
    r"""CollaborationAllowlistEntryEnterprise
    A representation of a Box enterprise
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[CollaborationAllowlistEntryEnterpriseTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class CollaborationAllowlistEntryTypeEnum(str, Enum):
    COLLABORATION_WHITELIST_ENTRY = "collaboration_whitelist_entry"


@dataclass_json
@dataclasses.dataclass
class CollaborationAllowlistEntry:
    r"""CollaborationAllowlistEntry
    An entry that describes an approved domain for which users can collaborate
    with files and folders in your enterprise or vice versa.
    """
    
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    direction: Optional[CollaborationAllowlistEntryDirectionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('direction') }})
    domain: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('domain') }})
    enterprise: Optional[CollaborationAllowlistEntryEnterprise] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('enterprise') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[CollaborationAllowlistEntryTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
