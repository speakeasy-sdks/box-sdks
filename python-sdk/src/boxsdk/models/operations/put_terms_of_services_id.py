import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import termsofservice as shared_termsofservice


@dataclasses.dataclass
class PutTermsOfServicesIDPathParams:
    terms_of_service_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'terms_of_service_id', 'style': 'simple', 'explode': False }})
    
class PutTermsOfServicesIDRequestBodyStatusEnum(str, Enum):
    ENABLED = "enabled"
    DISABLED = "disabled"


@dataclass_json
@dataclasses.dataclass
class PutTermsOfServicesIDRequestBody:
    status: PutTermsOfServicesIDRequestBodyStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    text: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('text') }})
    

@dataclasses.dataclass
class PutTermsOfServicesIDRequest:
    path_params: PutTermsOfServicesIDPathParams = dataclasses.field()
    request: Optional[PutTermsOfServicesIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutTermsOfServicesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    terms_of_service: Optional[shared_termsofservice.TermsOfService] = dataclasses.field(default=None)
    
