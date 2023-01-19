import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import termsofserviceuserstatuses as shared_termsofserviceuserstatuses


@dataclasses.dataclass
class GetTermsOfServiceUserStatusesQueryParams:
    tos_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'tos_id', 'style': 'form', 'explode': True }})
    user_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'user_id', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetTermsOfServiceUserStatusesRequest:
    query_params: GetTermsOfServiceUserStatusesQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetTermsOfServiceUserStatusesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    terms_of_service_user_statuses: Optional[shared_termsofserviceuserstatuses.TermsOfServiceUserStatuses] = dataclasses.field(default=None)
    
