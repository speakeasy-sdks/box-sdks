import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class SignRequestSignerInputContentTypeEnum(str, Enum):
    INITIAL = "initial"
    STAMP = "stamp"
    SIGNATURE = "signature"
    COMPANY = "company"
    TITLE = "title"
    EMAIL = "email"
    FULL_NAME = "full_name"
    FIRST_NAME = "first_name"
    LAST_NAME = "last_name"
    TEXT = "text"
    DATE = "date"
    CHECKBOX = "checkbox"

class SignRequestSignerInputTypeEnum(str, Enum):
    SIGNATURE = "signature"
    DATE = "date"
    TEXT = "text"
    CHECKBOX = "checkbox"


@dataclass_json
@dataclasses.dataclass
class SignRequestSignerInput:
    r"""SignRequestSignerInput
    Prefill tags are used to prefill placeholders with signer input data. Only
    one value field can be included.
    """
    
    page_index: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('page_index') }})
    checkbox_value: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('checkbox_value') }})
    content_type: Optional[SignRequestSignerInputContentTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_type') }})
    date_value: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('date_value'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    document_tag_id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('document_tag_id') }})
    text_value: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('text_value') }})
    type: Optional[SignRequestSignerInputTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
