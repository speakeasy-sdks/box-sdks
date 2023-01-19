import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadatatemplate as shared_metadatatemplate


@dataclass_json
@dataclasses.dataclass
class PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite:
    r"""PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite
    An option for a Metadata Template Field.
    
    Options only need to be provided for fields of type `enum` and `multiSelect`.
    Options represent the value(s) a user can select for the field either through
    the UI or through the API.
    """
    
    key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    
class PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum(str, Enum):
    STRING = "string"
    FLOAT = "float"
    DATE = "date"
    ENUM = "enum"
    MULTI_SELECT = "multiSelect"


@dataclass_json
@dataclasses.dataclass
class PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite:
    r"""PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite
    A field within a metadata template. Fields can be a basic text, date, or
    number field, or a list of options.
    """
    
    display_name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('displayName') }})
    key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    type: PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    hidden: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hidden') }})
    options: Optional[list[PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('options') }})
    

@dataclass_json
@dataclasses.dataclass
class PostMetadataTemplatesSchemaRequestBody:
    display_name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('displayName') }})
    scope: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('scope') }})
    copy_instance_on_item_copy: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('copyInstanceOnItemCopy') }})
    fields: Optional[list[PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('fields') }})
    hidden: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hidden') }})
    template_key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('templateKey') }})
    

@dataclasses.dataclass
class PostMetadataTemplatesSchemaRequest:
    request: Optional[PostMetadataTemplatesSchemaRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostMetadataTemplatesSchemaResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_template: Optional[shared_metadatatemplate.MetadataTemplate] = dataclasses.field(default=None)
    
