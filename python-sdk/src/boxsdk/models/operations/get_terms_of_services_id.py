import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import termsofservice as shared_termsofservice


@dataclasses.dataclass
class GetTermsOfServicesIDPathParams:
    terms_of_service_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'terms_of_service_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetTermsOfServicesIDRequest:
    path_params: GetTermsOfServicesIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetTermsOfServicesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    terms_of_service: Optional[shared_termsofservice.TermsOfService] = dataclasses.field(default=None)
    
