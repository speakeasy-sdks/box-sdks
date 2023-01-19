import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import classification as shared_classification
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class GetFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest:
    path_params: GetFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    classification: Optional[shared_classification.Classification] = dataclasses.field(default=None)
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
