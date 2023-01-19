import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils


@dataclass_json
@dataclasses.dataclass
class MetadataTemplateMetadataFieldWriteMetadataOptionWrite:
    r"""MetadataTemplateMetadataFieldWriteMetadataOptionWrite
    An option for a Metadata Template Field.
    
    Options only need to be provided for fields of type `enum` and `multiSelect`.
    Options represent the value(s) a user can select for the field either through
    the UI or through the API.
    """
    
    key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class MetadataTemplateMetadataFieldWriteTypeEnum(str, Enum):
    STRING = "string"
    FLOAT = "float"
    DATE = "date"
    ENUM = "enum"
    MULTI_SELECT = "multiSelect"


@dataclass_json
@dataclasses.dataclass
class MetadataTemplateMetadataFieldWrite:
    r"""MetadataTemplateMetadataFieldWrite
    A field within a metadata template. Fields can be a basic text, date, or
    number field, or a list of options.
    """
    
    display_name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('displayName') }})
    key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    type: MetadataTemplateMetadataFieldWriteTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    hidden: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hidden') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    options: Optional[list[MetadataTemplateMetadataFieldWriteMetadataOptionWrite]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('options') }})
    
class MetadataTemplateTypeEnum(str, Enum):
    METADATA_TEMPLATE = "metadata_template"


@dataclass_json
@dataclasses.dataclass
class MetadataTemplate:
    r"""MetadataTemplate
    A template for metadata that can be applied to files and folders
    """
    
    type: MetadataTemplateTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    copy_instance_on_item_copy: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('copyInstanceOnItemCopy') }})
    display_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('displayName') }})
    fields: Optional[list[MetadataTemplateMetadataFieldWrite]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('fields') }})
    hidden: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hidden') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    scope: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('scope') }})
    template_key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('templateKey') }})
    
