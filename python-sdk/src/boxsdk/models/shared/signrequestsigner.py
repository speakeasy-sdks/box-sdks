import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import signrequestsignerinput as shared_signrequestsignerinput

class SignRequestSignerRoleEnum(str, Enum):
    SIGNER = "signer"
    APPROVER = "approver"
    FINAL_COPY_READER = "final_copy_reader"

class SignRequestSignerSignerDecisionTypeEnum(str, Enum):
    SIGNED = "signed"
    DECLINED = "declined"


@dataclass_json
@dataclasses.dataclass
class SignRequestSignerSignerDecision:
    r"""SignRequestSignerSignerDecision
    Final decision made by the signer
    """
    
    finalized_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('finalized_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    type: Optional[SignRequestSignerSignerDecisionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class SignRequestSignerOutput:
    r"""SignRequestSignerOutput
    The schema for a Signer in a POST Sign Request request body
    """
    
    email: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('email') }})
    declined_redirect_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('declined_redirect_url') }})
    embed_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('embed_url') }})
    embed_url_external_user_id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('embed_url_external_user_id') }})
    has_viewed_document: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('has_viewed_document') }})
    inputs: Optional[list[shared_signrequestsignerinput.SignRequestSignerInput]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('inputs') }})
    is_in_person: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_in_person') }})
    login_required: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('login_required') }})
    order: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('order') }})
    redirect_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('redirect_url') }})
    role: Optional[SignRequestSignerRoleEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('role') }})
    signer_decision: Optional[SignRequestSignerSignerDecision] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('signer_decision') }})
    verification_phone_number: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('verification_phone_number') }})
    
