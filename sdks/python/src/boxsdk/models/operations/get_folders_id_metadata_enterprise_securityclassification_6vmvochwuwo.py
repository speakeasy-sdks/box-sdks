import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import classification as shared_classification
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest:
    path_params: GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    classification: Optional[shared_classification.Classification] = dataclasses.field(default=None)
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
