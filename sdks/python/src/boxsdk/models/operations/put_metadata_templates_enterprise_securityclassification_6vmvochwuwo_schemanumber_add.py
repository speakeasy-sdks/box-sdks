import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import classificationtemplate as shared_classificationtemplate
from ..shared import clienterror as shared_clienterror


@dataclass_json
@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyDataClassification:
    r"""PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyDataClassification
    Additional details for the classification.
    """
    
    classification_definition: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('classificationDefinition') }})
    color_id: Optional[float] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('colorID') }})
    

@dataclass_json
@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyData:
    r"""PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyData
    The details of the classification to add.
    """
    
    key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    classification: Optional[PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyDataClassification] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('classification') }})
    

@dataclass_json
@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBody:
    r"""PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBody
    A single classification to add to the enterprise.
    """
    
    data: PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyData = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    field_key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('fieldKey') }})
    op: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('op') }})
    

@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequest:
    request: Optional[list[PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBody]] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json-patch+json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    classification_template: Optional[shared_classificationtemplate.ClassificationTemplate] = dataclasses.field(default=None)
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
