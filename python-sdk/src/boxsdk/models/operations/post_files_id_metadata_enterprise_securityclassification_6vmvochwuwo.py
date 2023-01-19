import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import classification as shared_classification
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody:
    box_security_classification_key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('Box__Security__Classification__Key') }})
    

@dataclasses.dataclass
class PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest:
    path_params: PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams = dataclasses.field()
    request: Optional[PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    classification: Optional[shared_classification.Classification] = dataclasses.field(default=None)
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
