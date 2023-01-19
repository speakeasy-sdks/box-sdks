import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import fileversionlegalholds as shared_fileversionlegalholds


@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsIDFilesOnHoldPathParams:
    legal_hold_policy_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'legal_hold_policy_assignment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsIDFilesOnHoldQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsIDFilesOnHoldRequest:
    path_params: GetLegalHoldPolicyAssignmentsIDFilesOnHoldPathParams = dataclasses.field()
    query_params: GetLegalHoldPolicyAssignmentsIDFilesOnHoldQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetLegalHoldPolicyAssignmentsIDFilesOnHoldResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_version_legal_holds: Optional[shared_fileversionlegalholds.FileVersionLegalHolds] = dataclasses.field(default=None)
    
