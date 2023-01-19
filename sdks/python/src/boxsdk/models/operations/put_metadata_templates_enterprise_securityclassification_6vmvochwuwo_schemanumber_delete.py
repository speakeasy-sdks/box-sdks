import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import classificationtemplate as shared_classificationtemplate
from ..shared import clienterror as shared_clienterror


@dataclass_json
@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteRequestBody:
    r"""PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteRequestBody
    A single classification to remove.
    """
    
    enum_option_key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('enumOptionKey') }})
    field_key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('fieldKey') }})
    op: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('op') }})
    

@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteRequest:
    request: Optional[list[PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteRequestBody]] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json-patch+json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    classification_template: Optional[shared_classificationtemplate.ClassificationTemplate] = dataclasses.field(default=None)
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
