import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import classificationtemplate as shared_classificationtemplate
from ..shared import clienterror as shared_clienterror


@dataclass_json
@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyDataClassification:
    r"""PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyDataClassification
    Additional details for the classification.
    """
    
    classification_definition: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('classificationDefinition') }})
    color_id: Optional[float] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('colorID') }})
    

@dataclass_json
@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyData:
    r"""PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyData
    The details of the updated classification.
    """
    
    key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    classification: Optional[PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyDataClassification] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('classification') }})
    

@dataclass_json
@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBody:
    r"""PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBody
    A single classification to update.
    """
    
    data: PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyData = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    enum_option_key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('enumOptionKey') }})
    field_key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('fieldKey') }})
    op: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('op') }})
    

@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequest:
    request: Optional[list[PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBody]] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json-patch+json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    classification_template: Optional[shared_classificationtemplate.ClassificationTemplate] = dataclasses.field(default=None)
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
