import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class ClassificationTemplateDisplayNameEnum(str, Enum):
    CLASSIFICATION = "Classification"

class ClassificationTemplateFieldsDisplayNameEnum(str, Enum):
    CLASSIFICATION = "Classification"

class ClassificationTemplateFieldsKeyEnum(str, Enum):
    BOX_SECURITY_CLASSIFICATION_KEY = "Box__Security__Classification__Key"


@dataclass_json
@dataclasses.dataclass
class ClassificationTemplateFieldsOptionsStaticConfigClassification:
    r"""ClassificationTemplateFieldsOptionsStaticConfigClassification
    Additional information about the classification.
    
    This is not an exclusive list of properties, and
    more object fields might be returned. These fields
    are used for internal Box Shield and Box Governance
    purposes and no additional value must be derived from
    these fields.
    """
    
    classification_definition: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('classificationDefinition') }})
    color_id: Optional[float] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('colorID') }})
    

@dataclass_json
@dataclasses.dataclass
class ClassificationTemplateFieldsOptionsStaticConfig:
    r"""ClassificationTemplateFieldsOptionsStaticConfig
    Additional information about the classification.
    """
    
    classification: Optional[ClassificationTemplateFieldsOptionsStaticConfigClassification] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('classification') }})
    

@dataclass_json
@dataclasses.dataclass
class ClassificationTemplateFieldsOptions:
    r"""ClassificationTemplateFieldsOptions
    A single classification available in this enterprise.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    static_config: Optional[ClassificationTemplateFieldsOptionsStaticConfig] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('staticConfig') }})
    
class ClassificationTemplateFieldsTypeEnum(str, Enum):
    ENUM = "enum"


@dataclass_json
@dataclasses.dataclass
class ClassificationTemplateFields:
    r"""ClassificationTemplateFields
    The metadata template field that represents the available
    classifications.
    """
    
    display_name: Optional[ClassificationTemplateFieldsDisplayNameEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('displayName') }})
    hidden: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hidden') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    key: Optional[ClassificationTemplateFieldsKeyEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    options: Optional[list[ClassificationTemplateFieldsOptions]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('options') }})
    type: Optional[ClassificationTemplateFieldsTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class ClassificationTemplateTemplateKeyEnum(str, Enum):
    SECURITY_CLASSIFICATION_6_VM_VOCHW_U_WO = "securityClassification-6VMVochwUWo"

class ClassificationTemplateTypeEnum(str, Enum):
    METADATA_TEMPLATE = "metadata_template"


@dataclass_json
@dataclasses.dataclass
class ClassificationTemplate:
    r"""ClassificationTemplate
    A metadata template that holds the security classifications
    defined by an enterprise.
    """
    
    type: ClassificationTemplateTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    copy_instance_on_item_copy: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('copyInstanceOnItemCopy') }})
    display_name: Optional[ClassificationTemplateDisplayNameEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('displayName') }})
    fields: Optional[list[ClassificationTemplateFields]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('fields') }})
    hidden: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hidden') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    scope: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('scope') }})
    template_key: Optional[ClassificationTemplateTemplateKeyEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('templateKey') }})
    
