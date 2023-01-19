import dataclasses
from typing import Any,Optional
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
class PostFilesIDMetadataGlobalBoxSkillsCardsPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostFilesIDMetadataGlobalBoxSkillsCardsRequestBody:
    cards: list[Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('cards') }})
    

@dataclasses.dataclass
class PostFilesIDMetadataGlobalBoxSkillsCardsRequest:
    path_params: PostFilesIDMetadataGlobalBoxSkillsCardsPathParams = dataclasses.field()
    request: Optional[PostFilesIDMetadataGlobalBoxSkillsCardsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFilesIDMetadataGlobalBoxSkillsCardsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    skill_cards_metadata: Optional[shared_skillcardsmetadata.SkillCardsMetadata] = dataclasses.field(default=None)
    
