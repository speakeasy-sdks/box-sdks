import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import folder_mini as shared_folder_mini
from ..shared import signrequestprefilltag as shared_signrequestprefilltag
from ..shared import signrequestcreatesigner as shared_signrequestcreatesigner
from ..shared import file_base as shared_file_base

class SignRequestCreateRequestSignatureColorEnum(str, Enum):
    BLUE = "blue"
    BLACK = "black"
    RED = "red"


@dataclass_json
@dataclasses.dataclass
class SignRequestCreateRequest:
    r"""SignRequestCreateRequest
    A request to create a sign request object
    """
    
    parent_folder: shared_folder_mini.FolderMini = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent_folder') }})
    signers: list[shared_signrequestcreatesigner.SignRequestCreateSigner] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('signers') }})
    source_files: list[shared_file_base.FileBase] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('source_files') }})
    are_reminders_enabled: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('are_reminders_enabled') }})
    are_text_signatures_enabled: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('are_text_signatures_enabled') }})
    days_valid: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('days_valid') }})
    declined_redirect_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('declined_redirect_url') }})
    email_message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('email_message') }})
    email_subject: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('email_subject') }})
    external_id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('external_id') }})
    is_document_preparation_needed: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_document_preparation_needed') }})
    is_phone_verification_required_to_view: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_phone_verification_required_to_view') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    prefill_tags: Optional[list[shared_signrequestprefilltag.SignRequestPrefillTag]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('prefill_tags') }})
    redirect_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('redirect_url') }})
    signature_color: Optional[SignRequestCreateRequestSignatureColorEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('signature_color') }})
    
