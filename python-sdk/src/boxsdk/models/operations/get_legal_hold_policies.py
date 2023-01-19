import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import legalholdpolicies as shared_legalholdpolicies


@dataclasses.dataclass
class GetLegalHoldPoliciesQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    policy_name: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'policy_name', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetLegalHoldPoliciesRequest:
    query_params: GetLegalHoldPoliciesQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetLegalHoldPoliciesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    legal_hold_policies: Optional[shared_legalholdpolicies.LegalHoldPolicies] = dataclasses.field(default=None)
    
