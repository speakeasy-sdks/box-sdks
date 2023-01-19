import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import termsofservice_base as shared_termsofservice_base
from ..shared import user_mini as shared_user_mini

class TermsOfServiceUserStatusTypeEnum(str, Enum):
    TERMS_OF_SERVICE_USER_STATUS = "terms_of_service_user_status"


@dataclass_json
@dataclasses.dataclass
class TermsOfServiceUserStatus:
    r"""TermsOfServiceUserStatus
    The association between a Terms of Service and a user
    """
    
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    is_accepted: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_accepted') }})
    modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    tos: Optional[shared_termsofservice_base.TermsOfServiceBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('tos') }})
    type: Optional[TermsOfServiceUserStatusTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    user: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('user') }})
    
