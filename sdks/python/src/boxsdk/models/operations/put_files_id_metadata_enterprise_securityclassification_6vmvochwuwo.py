import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import classification as shared_classification
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    
class PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnum(str, Enum):
    REPLACE = "replace"

class PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnum(str, Enum):
    ROOT_BOX_SECURITY_CLASSIFICATION_KEY = "/Box__Security__Classification__Key"


@dataclass_json
@dataclasses.dataclass
class PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody:
    r"""PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody
    The operation to perform on the classification
    metadata template instance. In this case, it use
    used to replace the value stored for the
    `Box__Security__Classification__Key` field with a new
    value.
    """
    
    op: Optional[PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('op') }})
    path: Optional[PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('path') }})
    value: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    

@dataclasses.dataclass
class PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest:
    path_params: PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams = dataclasses.field()
    request: Optional[list[PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody]] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json-patch+json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    classification: Optional[shared_classification.Classification] = dataclasses.field(default=None)
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
