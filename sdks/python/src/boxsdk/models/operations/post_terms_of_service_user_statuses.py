import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import termsofserviceuserstatus as shared_termsofserviceuserstatus

class PostTermsOfServiceUserStatusesRequestBodyTosTypeEnum(str, Enum):
    TERMS_OF_SERVICE = "terms_of_service"


@dataclass_json
@dataclasses.dataclass
class PostTermsOfServiceUserStatusesRequestBodyTos:
    r"""PostTermsOfServiceUserStatusesRequestBodyTos
    The terms of service to set the status for.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostTermsOfServiceUserStatusesRequestBodyTosTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostTermsOfServiceUserStatusesRequestBodyUserTypeEnum(str, Enum):
    USER = "user"


@dataclass_json
@dataclasses.dataclass
class PostTermsOfServiceUserStatusesRequestBodyUser:
    r"""PostTermsOfServiceUserStatusesRequestBodyUser
    The user to set the status for.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostTermsOfServiceUserStatusesRequestBodyUserTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PostTermsOfServiceUserStatusesRequestBody:
    is_accepted: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_accepted') }})
    tos: PostTermsOfServiceUserStatusesRequestBodyTos = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('tos') }})
    user: PostTermsOfServiceUserStatusesRequestBodyUser = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('user') }})
    

@dataclasses.dataclass
class PostTermsOfServiceUserStatusesRequest:
    request: Optional[PostTermsOfServiceUserStatusesRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostTermsOfServiceUserStatusesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    terms_of_service_user_status: Optional[shared_termsofserviceuserstatus.TermsOfServiceUserStatus] = dataclasses.field(default=None)
    
