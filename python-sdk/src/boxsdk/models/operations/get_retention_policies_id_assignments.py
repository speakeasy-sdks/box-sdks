import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import retentionpolicyassignments as shared_retentionpolicyassignments


@dataclasses.dataclass
class GetRetentionPoliciesIDAssignmentsPathParams:
    retention_policy_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'retention_policy_id', 'style': 'simple', 'explode': False }})
    
class GetRetentionPoliciesIDAssignmentsTypeEnum(str, Enum):
    FOLDER = "folder"
    ENTERPRISE = "enterprise"
    METADATA_TEMPLATE = "metadata_template"


@dataclasses.dataclass
class GetRetentionPoliciesIDAssignmentsQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    type: Optional[GetRetentionPoliciesIDAssignmentsTypeEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'type', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetRetentionPoliciesIDAssignmentsRequest:
    path_params: GetRetentionPoliciesIDAssignmentsPathParams = dataclasses.field()
    query_params: GetRetentionPoliciesIDAssignmentsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetRetentionPoliciesIDAssignmentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    retention_policy_assignments: Optional[shared_retentionpolicyassignments.RetentionPolicyAssignments] = dataclasses.field(default=None)
    
