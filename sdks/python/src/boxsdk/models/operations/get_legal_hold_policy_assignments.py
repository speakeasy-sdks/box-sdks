import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import legalholdpolicyassignments as shared_legalholdpolicyassignments

class GetLegalHoldPolicyAssignmentsAssignToTypeEnum(str, Enum):
    FILE = "file"
    FILE_VERSION = "file_version"
    FOLDER = "folder"
    USER = "user"


@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsQueryParams:
    policy_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'policy_id', 'style': 'form', 'explode': True }})
    assign_to_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'assign_to_id', 'style': 'form', 'explode': True }})
    assign_to_type: Optional[GetLegalHoldPolicyAssignmentsAssignToTypeEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'assign_to_type', 'style': 'form', 'explode': True }})
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsRequest:
    query_params: GetLegalHoldPolicyAssignmentsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    legal_hold_policy_assignments: Optional[shared_legalholdpolicyassignments.LegalHoldPolicyAssignments] = dataclasses.field(default=None)
    
