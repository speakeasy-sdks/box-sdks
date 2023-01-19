import dataclasses
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import skillcard as shared_skillcard
from ..shared import keywordskillcard as shared_keywordskillcard
from ..shared import timelineskillcard as shared_timelineskillcard
from ..shared import transcriptskillcard as shared_transcriptskillcard
from ..shared import statusskillcard as shared_statusskillcard
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class PutSkillInvocationsIDPathParams:
    skill_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'skill_id', 'style': 'simple', 'explode': False }})
    
class PutSkillInvocationsIDRequestBodyFileTypeEnum(str, Enum):
    FILE = "file"


@dataclass_json
@dataclasses.dataclass
class PutSkillInvocationsIDRequestBodyFile:
    r"""PutSkillInvocationsIDRequestBodyFile
    The file to assign the cards to.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[PutSkillInvocationsIDRequestBodyFileTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PutSkillInvocationsIDRequestBodyFileVersionTypeEnum(str, Enum):
    FILE_VERSION = "file_version"


@dataclass_json
@dataclasses.dataclass
class PutSkillInvocationsIDRequestBodyFileVersion:
    r"""PutSkillInvocationsIDRequestBodyFileVersion
    The optional file version to assign the cards to.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[PutSkillInvocationsIDRequestBodyFileVersionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PutSkillInvocationsIDRequestBodyMetadata:
    r"""PutSkillInvocationsIDRequestBodyMetadata
    The metadata to set for this skill. This is a list of
    Box Skills cards. These cards will overwrite any existing Box
    skill cards on the file.
    """
    
    cards: Optional[list[Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('cards') }})
    
class PutSkillInvocationsIDRequestBodyStatusEnum(str, Enum):
    INVOKED = "invoked"
    PROCESSING = "processing"
    SUCCESS = "success"
    TRANSIENT_FAILURE = "transient_failure"
    PERMANENT_FAILURE = "permanent_failure"


@dataclass_json
@dataclasses.dataclass
class PutSkillInvocationsIDRequestBodyUsage:
    r"""PutSkillInvocationsIDRequestBodyUsage
    A descriptor that defines what items are affected by this call.
    
    Set this to the default values when setting a card to a `success`
    state, and leave it out in most other situations.
    """
    
    unit: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('unit') }})
    value: Optional[float] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    

@dataclass_json
@dataclasses.dataclass
class PutSkillInvocationsIDRequestBody:
    file: PutSkillInvocationsIDRequestBodyFile = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('file') }})
    metadata: PutSkillInvocationsIDRequestBodyMetadata = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('metadata') }})
    status: PutSkillInvocationsIDRequestBodyStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    file_version: Optional[PutSkillInvocationsIDRequestBodyFileVersion] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('file_version') }})
    usage: Optional[PutSkillInvocationsIDRequestBodyUsage] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('usage') }})
    

@dataclasses.dataclass
class PutSkillInvocationsIDRequest:
    path_params: PutSkillInvocationsIDPathParams = dataclasses.field()
    request: Optional[PutSkillInvocationsIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutSkillInvocationsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
