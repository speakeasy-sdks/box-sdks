import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import legalholdpolicy as shared_legalholdpolicy


@dataclasses.dataclass
class GetLegalHoldPoliciesIDPathParams:
    legal_hold_policy_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'legal_hold_policy_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetLegalHoldPoliciesIDRequest:
    path_params: GetLegalHoldPoliciesIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetLegalHoldPoliciesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    legal_hold_policy: Optional[shared_legalholdpolicy.LegalHoldPolicy] = dataclasses.field(default=None)
    
