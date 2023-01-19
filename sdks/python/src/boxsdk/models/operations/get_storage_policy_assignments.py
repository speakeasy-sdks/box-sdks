import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import storagepolicyassignments as shared_storagepolicyassignments

class GetStoragePolicyAssignmentsResolvedForTypeEnum(str, Enum):
    USER = "user"
    ENTERPRISE = "enterprise"


@dataclasses.dataclass
class GetStoragePolicyAssignmentsQueryParams:
    resolved_for_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'resolved_for_id', 'style': 'form', 'explode': True }})
    resolved_for_type: GetStoragePolicyAssignmentsResolvedForTypeEnum = dataclasses.field(metadata={'query_param': { 'field_name': 'resolved_for_type', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetStoragePolicyAssignmentsRequest:
    query_params: GetStoragePolicyAssignmentsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetStoragePolicyAssignmentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    storage_policy_assignments: Optional[shared_storagepolicyassignments.StoragePolicyAssignments] = dataclasses.field(default=None)
    
