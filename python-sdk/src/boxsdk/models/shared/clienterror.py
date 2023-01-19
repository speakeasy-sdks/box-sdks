import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class ClientErrorCodeEnum(str, Enum):
    CREATED = "created"
    ACCEPTED = "accepted"
    NO_CONTENT = "no_content"
    REDIRECT = "redirect"
    NOT_MODIFIED = "not_modified"
    BAD_REQUEST = "bad_request"
    UNAUTHORIZED = "unauthorized"
    FORBIDDEN = "forbidden"
    NOT_FOUND = "not_found"
    METHOD_NOT_ALLOWED = "method_not_allowed"
    CONFLICT = "conflict"
    PRECONDITION_FAILED = "precondition_failed"
    TOO_MANY_REQUESTS = "too_many_requests"
    INTERNAL_SERVER_ERROR = "internal_server_error"
    UNAVAILABLE = "unavailable"
    ITEM_NAME_INVALID = "item_name_invalid"
    INSUFFICIENT_SCOPE = "insufficient_scope"


@dataclass_json
@dataclasses.dataclass
class ClientErrorContextInfo:
    r"""ClientErrorContextInfo
    A free-form object that contains additional context
    about the error. The possible fields are defined on
    a per-endpoint basis. `message` is only one example.
    """
    
    message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    
class ClientErrorTypeEnum(str, Enum):
    ERROR = "error"


@dataclass_json
@dataclasses.dataclass
class ClientError:
    r"""ClientError
    A generic error
    """
    
    code: Optional[ClientErrorCodeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('code') }})
    context_info: Optional[ClientErrorContextInfo] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('context_info') }})
    help_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('help_url') }})
    message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    request_id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('request_id') }})
    status: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    type: Optional[ClientErrorTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
