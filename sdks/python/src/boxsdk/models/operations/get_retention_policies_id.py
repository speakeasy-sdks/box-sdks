import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import retentionpolicy as shared_retentionpolicy


@dataclasses.dataclass
class GetRetentionPoliciesIDPathParams:
    retention_policy_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'retention_policy_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetRetentionPoliciesIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetRetentionPoliciesIDRequest:
    path_params: GetRetentionPoliciesIDPathParams = dataclasses.field()
    query_params: GetRetentionPoliciesIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetRetentionPoliciesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    retention_policy: Optional[shared_retentionpolicy.RetentionPolicy] = dataclasses.field(default=None)
    
