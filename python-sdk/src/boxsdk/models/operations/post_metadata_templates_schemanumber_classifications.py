import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import classificationtemplate as shared_classificationtemplate
from ..shared import clienterror as shared_clienterror

class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnum(str, Enum):
    CLASSIFICATION = "Classification"

class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnum(str, Enum):
    CLASSIFICATION = "Classification"

class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnum(str, Enum):
    BOX_SECURITY_CLASSIFICATION_KEY = "Box__Security__Classification__Key"


@dataclass_json
@dataclasses.dataclass
class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification:
    r"""PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification
    Additional information about the classification.
    """
    
    classification_definition: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('classificationDefinition') }})
    color_id: Optional[float] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('colorID') }})
    

@dataclass_json
@dataclasses.dataclass
class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig:
    r"""PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig
    Additional information about the classification.
    """
    
    classification: Optional[PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('classification') }})
    

@dataclass_json
@dataclasses.dataclass
class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions:
    r"""PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions
    An individual classification.
    """
    
    key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    static_config: Optional[PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('staticConfig') }})
    
class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnum(str, Enum):
    ENUM = "enum"


@dataclass_json
@dataclasses.dataclass
class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields:
    r"""PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields
    The `enum` field which holds all the valid classification
    values.
    """
    
    display_name: Optional[PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('displayName') }})
    hidden: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hidden') }})
    key: Optional[PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    options: Optional[list[PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('options') }})
    type: Optional[PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnum(str, Enum):
    ENTERPRISE = "enterprise"

class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnum(str, Enum):
    SECURITY_CLASSIFICATION_6_VM_VOCHW_U_WO = "securityClassification-6VMVochwUWo"


@dataclass_json
@dataclasses.dataclass
class PostMetadataTemplatesSchemaNumberClassificationsRequestBody:
    display_name: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('displayName') }})
    scope: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('scope') }})
    copy_instance_on_item_copy: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('copyInstanceOnItemCopy') }})
    fields: Optional[list[PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('fields') }})
    hidden: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hidden') }})
    template_key: Optional[PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('templateKey') }})
    

@dataclasses.dataclass
class PostMetadataTemplatesSchemaNumberClassificationsRequest:
    request: Optional[PostMetadataTemplatesSchemaNumberClassificationsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostMetadataTemplatesSchemaNumberClassificationsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    classification_template: Optional[shared_classificationtemplate.ClassificationTemplate] = dataclasses.field(default=None)
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
