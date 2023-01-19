import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import retentionpolicies as shared_retentionpolicies

class GetRetentionPoliciesPolicyTypeEnum(str, Enum):
    FINITE = "finite"
    INDEFINITE = "indefinite"


@dataclasses.dataclass
class GetRetentionPoliciesQueryParams:
    created_by_user_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'created_by_user_id', 'style': 'form', 'explode': True }})
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    policy_name: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'policy_name', 'style': 'form', 'explode': True }})
    policy_type: Optional[GetRetentionPoliciesPolicyTypeEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'policy_type', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetRetentionPoliciesRequest:
    query_params: GetRetentionPoliciesQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetRetentionPoliciesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    retention_policies: Optional[shared_retentionpolicies.RetentionPolicies] = dataclasses.field(default=None)
    
