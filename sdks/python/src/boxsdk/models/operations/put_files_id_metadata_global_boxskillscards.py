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
from ..shared import skillcardsmetadata as shared_skillcardsmetadata


@dataclasses.dataclass
class PutFilesIDMetadataGlobalBoxSkillsCardsPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    
class PutFilesIDMetadataGlobalBoxSkillsCardsRequestBodyOpEnum(str, Enum):
    REPLACE = "replace"


@dataclass_json
@dataclasses.dataclass
class PutFilesIDMetadataGlobalBoxSkillsCardsRequestBody:
    r"""PutFilesIDMetadataGlobalBoxSkillsCardsRequestBody
    An operation that replaces an existing card.
    """
    
    op: Optional[PutFilesIDMetadataGlobalBoxSkillsCardsRequestBodyOpEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('op') }})
    path: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('path') }})
    value: Optional[Any] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    

@dataclasses.dataclass
class PutFilesIDMetadataGlobalBoxSkillsCardsRequest:
    path_params: PutFilesIDMetadataGlobalBoxSkillsCardsPathParams = dataclasses.field()
    request: Optional[list[PutFilesIDMetadataGlobalBoxSkillsCardsRequestBody]] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json-patch+json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFilesIDMetadataGlobalBoxSkillsCardsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    skill_cards_metadata: Optional[shared_skillcardsmetadata.SkillCardsMetadata] = dataclasses.field(default=None)
    
