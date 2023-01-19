import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest:
    path_params: DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
