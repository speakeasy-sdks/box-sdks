import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import termsofservices as shared_termsofservices

class GetTermsOfServicesTosTypeEnum(str, Enum):
    EXTERNAL = "external"
    MANAGED = "managed"


@dataclasses.dataclass
class GetTermsOfServicesQueryParams:
    tos_type: Optional[GetTermsOfServicesTosTypeEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'tos_type', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetTermsOfServicesRequest:
    query_params: GetTermsOfServicesQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetTermsOfServicesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    terms_of_services: Optional[shared_termsofservices.TermsOfServices] = dataclasses.field(default=None)
    
