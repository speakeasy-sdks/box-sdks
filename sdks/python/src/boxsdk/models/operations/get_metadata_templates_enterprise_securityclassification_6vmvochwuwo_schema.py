import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import classificationtemplate as shared_classificationtemplate
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class GetMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaRequest:
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    classification_template: Optional[shared_classificationtemplate.ClassificationTemplate] = dataclasses.field(default=None)
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
