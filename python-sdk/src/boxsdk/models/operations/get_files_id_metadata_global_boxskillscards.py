import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import skillcardsmetadata as shared_skillcardsmetadata


@dataclasses.dataclass
class GetFilesIDMetadataGlobalBoxSkillsCardsPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDMetadataGlobalBoxSkillsCardsRequest:
    path_params: GetFilesIDMetadataGlobalBoxSkillsCardsPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesIDMetadataGlobalBoxSkillsCardsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    skill_cards_metadata: Optional[shared_skillcardsmetadata.SkillCardsMetadata] = dataclasses.field(default=None)
    
