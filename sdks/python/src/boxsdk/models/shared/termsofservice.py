import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class TermsOfServiceEnterpriseTypeEnum(str, Enum):
    ENTERPRISE = "enterprise"


@dataclass_json
@dataclasses.dataclass
class TermsOfServiceEnterprise:
    r"""TermsOfServiceEnterprise
    A representation of a Box enterprise
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[TermsOfServiceEnterpriseTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class TermsOfServiceStatusEnum(str, Enum):
    ENABLED = "enabled"
    DISABLED = "disabled"

class TermsOfServiceTosTypeEnum(str, Enum):
    MANAGED = "managed"
    EXTERNAL = "external"

class TermsOfServiceTypeEnum(str, Enum):
    TERMS_OF_SERVICE = "terms_of_service"


@dataclass_json
@dataclasses.dataclass
class TermsOfService:
    r"""TermsOfService
    The root-level record that is supposed to represent a
    single Terms of Service.
    """
    
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    enterprise: Optional[TermsOfServiceEnterprise] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('enterprise') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    status: Optional[TermsOfServiceStatusEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    text: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('text') }})
    tos_type: Optional[TermsOfServiceTosTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('tos_type') }})
    type: Optional[TermsOfServiceTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
