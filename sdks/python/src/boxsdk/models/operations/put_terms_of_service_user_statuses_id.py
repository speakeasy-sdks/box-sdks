import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import termsofserviceuserstatus as shared_termsofserviceuserstatus


@dataclasses.dataclass
class PutTermsOfServiceUserStatusesIDPathParams:
    terms_of_service_user_status_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'terms_of_service_user_status_id', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PutTermsOfServiceUserStatusesIDRequestBody:
    is_accepted: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_accepted') }})
    

@dataclasses.dataclass
class PutTermsOfServiceUserStatusesIDRequest:
    path_params: PutTermsOfServiceUserStatusesIDPathParams = dataclasses.field()
    request: Optional[PutTermsOfServiceUserStatusesIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutTermsOfServiceUserStatusesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    terms_of_service_user_status: Optional[shared_termsofserviceuserstatus.TermsOfServiceUserStatus] = dataclasses.field(default=None)
    
