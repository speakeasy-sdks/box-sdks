import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import task as shared_task

class PostTermsOfServicesRequestBodyStatusEnum(str, Enum):
    ENABLED = "enabled"
    DISABLED = "disabled"

class PostTermsOfServicesRequestBodyTosTypeEnum(str, Enum):
    EXTERNAL = "external"
    MANAGED = "managed"


@dataclass_json
@dataclasses.dataclass
class PostTermsOfServicesRequestBody:
    status: PostTermsOfServicesRequestBodyStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    text: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('text') }})
    tos_type: Optional[PostTermsOfServicesRequestBodyTosTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('tos_type') }})
    

@dataclasses.dataclass
class PostTermsOfServicesRequest:
    request: Optional[PostTermsOfServicesRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostTermsOfServicesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    task: Optional[shared_task.Task] = dataclasses.field(default=None)
    
