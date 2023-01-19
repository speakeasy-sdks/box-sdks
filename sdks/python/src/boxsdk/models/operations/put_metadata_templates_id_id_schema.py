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

class PutMetadataTemplatesIDIDSchemaScopeEnum(str, Enum):
    GLOBAL = "global"
    ENTERPRISE = "enterprise"


@dataclasses.dataclass
class PutMetadataTemplatesIDIDSchemaPathParams:
    scope: PutMetadataTemplatesIDIDSchemaScopeEnum = dataclasses.field(metadata={'path_param': { 'field_name': 'scope', 'style': 'simple', 'explode': False }})
    template_key: str = dataclasses.field(metadata={'path_param': { 'field_name': 'template_key', 'style': 'simple', 'explode': False }})
    
class PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum(str, Enum):
    EDIT_TEMPLATE = "editTemplate"
    ADD_FIELD = "addField"
    REORDER_FIELDS = "reorderFields"
    ADD_ENUM_OPTION = "addEnumOption"
    REORDER_ENUM_OPTIONS = "reorderEnumOptions"
    REORDER_MULTI_SELECT_OPTIONS = "reorderMultiSelectOptions"
    ADD_MULTI_SELECT_OPTION = "addMultiSelectOption"
    EDIT_FIELD = "editField"
    REMOVE_FIELD = "removeField"
    EDIT_ENUM_OPTION = "editEnumOption"
    REMOVE_ENUM_OPTION = "removeEnumOption"
    EDIT_MULTI_SELECT_OPTION = "editMultiSelectOption"
    REMOVE_MULTI_SELECT_OPTION = "removeMultiSelectOption"


@dataclass_json
@dataclasses.dataclass
class PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperation:
    r"""PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperation
    A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
    change to make to the metadata instance.
    """
    
    op: PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('op') }})
    data: Optional[dict[str, str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    enum_option_key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('enumOptionKey') }})
    enum_option_keys: Optional[list[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('enumOptionKeys') }})
    field_key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('fieldKey') }})
    field_keys: Optional[list[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('fieldKeys') }})
    multi_select_option_key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('multiSelectOptionKey') }})
    multi_select_option_keys: Optional[list[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('multiSelectOptionKeys') }})
    

@dataclasses.dataclass
class PutMetadataTemplatesIDIDSchemaRequest:
    path_params: PutMetadataTemplatesIDIDSchemaPathParams = dataclasses.field()
    request: Optional[list[PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperation]] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json-patch+json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutMetadataTemplatesIDIDSchemaResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_template: Optional[shared_metadatatemplate.MetadataTemplate] = dataclasses.field(default=None)
    
