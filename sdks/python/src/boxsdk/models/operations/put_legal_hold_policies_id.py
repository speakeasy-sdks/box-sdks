import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import legalholdpolicy as shared_legalholdpolicy


@dataclasses.dataclass
class PutLegalHoldPoliciesIDPathParams:
    legal_hold_policy_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'legal_hold_policy_id', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PutLegalHoldPoliciesIDRequestBody:
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    policy_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('policy_name') }})
    release_notes: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('release_notes') }})
    

@dataclasses.dataclass
class PutLegalHoldPoliciesIDRequest:
    path_params: PutLegalHoldPoliciesIDPathParams = dataclasses.field()
    request: Optional[PutLegalHoldPoliciesIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutLegalHoldPoliciesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    legal_hold_policy: Optional[shared_legalholdpolicy.LegalHoldPolicy] = dataclasses.field(default=None)
    
