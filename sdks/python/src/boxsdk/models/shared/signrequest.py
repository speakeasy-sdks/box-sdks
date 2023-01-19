import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import file_mini as shared_file_mini
from ..shared import folder_mini as shared_folder_mini
from ..shared import signrequestprefilltag as shared_signrequestprefilltag
from ..shared import signrequestsigner as shared_signrequestsigner
from ..shared import file_base as shared_file_base


@dataclass_json
@dataclasses.dataclass
class SignRequestSignFiles:
    r"""SignRequestSignFiles
    List of files that will be signed, which are copies of the original
    source files. A new version of these files are created as signers sign
    and can be downloaded at any point in the signing process.
    """
    
    files: Optional[list[shared_file_mini.FileMini]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('files') }})
    is_ready_for_download: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_ready_for_download') }})
    
class SignRequestSignatureColorEnum(str, Enum):
    BLUE = "blue"
    BLACK = "black"
    RED = "red"

class SignRequestStatusEnum(str, Enum):
    CONVERTING = "converting"
    CREATED = "created"
    SENT = "sent"
    VIEWED = "viewed"
    SIGNED = "signed"
    CANCELLED = "cancelled"
    DECLINED = "declined"
    ERROR_CONVERTING = "error_converting"
    ERROR_SENDING = "error_sending"
    EXPIRED = "expired"
    DOWNLOADED = "downloaded"
    SIGNED_AND_DOWNLOADED = "signed and downloaded"

class SignRequestTypeEnum(str, Enum):
    SIGN_REQUEST = "sign-request"


@dataclass_json
@dataclasses.dataclass
class SignRequestOutput:
    r"""SignRequestOutput
    A request to create a sign request object
    """
    
    parent_folder: shared_folder_mini.FolderMini = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent_folder') }})
    signers: list[shared_signrequestsigner.SignRequestSignerOutput] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('signers') }})
    source_files: list[shared_file_base.FileBase] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('source_files') }})
    are_reminders_enabled: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('are_reminders_enabled') }})
    are_text_signatures_enabled: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('are_text_signatures_enabled') }})
    auto_expire_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('auto_expire_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    days_valid: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('days_valid') }})
    declined_redirect_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('declined_redirect_url') }})
    email_message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('email_message') }})
    email_subject: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('email_subject') }})
    external_id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('external_id') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    is_document_preparation_needed: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_document_preparation_needed') }})
    is_phone_verification_required_to_view: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_phone_verification_required_to_view') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    prefill_tags: Optional[list[shared_signrequestprefilltag.SignRequestPrefillTag]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('prefill_tags') }})
    prepare_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('prepare_url') }})
    redirect_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('redirect_url') }})
    sign_files: Optional[SignRequestSignFiles] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sign_files') }})
    signature_color: Optional[SignRequestSignatureColorEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('signature_color') }})
    signing_log: Optional[shared_file_mini.FileMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('signing_log') }})
    status: Optional[SignRequestStatusEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    type: Optional[SignRequestTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
