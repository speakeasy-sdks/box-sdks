import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import termsofservice_base as shared_termsofservice_base
from ..shared import user_mini as shared_user_mini


@dataclass_json
@dataclasses.dataclass
class CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement:
    enterprise_has_strong_password_required_for_external_users: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('enterprise_has_strong_password_required_for_external_users') }})
    user_has_strong_password: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('user_has_strong_password') }})
    

@dataclass_json
@dataclasses.dataclass
class CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement:
    is_accepted: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_accepted') }})
    terms_of_service: Optional[shared_termsofservice_base.TermsOfServiceBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('terms_of_service') }})
    

@dataclass_json
@dataclasses.dataclass
class CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement:
    enterprise_has_two_factor_auth_enabled: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('enterprise_has_two_factor_auth_enabled') }})
    user_has_two_factor_authentication_enabled: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('user_has_two_factor_authentication_enabled') }})
    

@dataclass_json
@dataclasses.dataclass
class CollaborationAcceptanceRequirementsStatus:
    strong_password_requirement: Optional[CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('strong_password_requirement') }})
    terms_of_service_requirement: Optional[CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('terms_of_service_requirement') }})
    two_factor_authentication_requirement: Optional[CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('two_factor_authentication_requirement') }})
    
class CollaborationUserBaseTypeEnum(str, Enum):
    USER = "user"


@dataclass_json
@dataclasses.dataclass
class CollaborationUserBase:
    r"""CollaborationUserBase
    The user who created the collaboration object
    """
    
    login: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('login') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: CollaborationUserBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class CollaborationRoleEnum(str, Enum):
    EDITOR = "editor"
    VIEWER = "viewer"
    PREVIEWER = "previewer"
    UPLOADER = "uploader"
    PREVIEWER_UPLOADER = "previewer uploader"
    VIEWER_UPLOADER = "viewer uploader"
    CO_OWNER = "co-owner"
    OWNER = "owner"

class CollaborationStatusEnum(str, Enum):
    ACCEPTED = "accepted"
    PENDING = "pending"
    REJECTED = "rejected"

class CollaborationTypeEnum(str, Enum):
    COLLABORATION = "collaboration"


@dataclass_json
@dataclasses.dataclass
class Collaboration:
    r"""Collaboration
    Collaborations define access permissions for users and groups to files and
    folders, similar to access control lists. A collaboration object grants a
    user or group access to a file or folder with permissions defined by a
    specific role.
    """
    
    acceptance_requirements_status: Optional[CollaborationAcceptanceRequirementsStatus] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('acceptance_requirements_status') }})
    accessible_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('accessible_by') }})
    acknowledged_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('acknowledged_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[CollaborationUserBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    expires_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('expires_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    invite_email: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('invite_email') }})
    item: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('item') }})
    modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    role: Optional[CollaborationRoleEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('role') }})
    status: Optional[CollaborationStatusEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    type: Optional[CollaborationTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
