import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import filesunderretention as shared_filesunderretention


@dataclasses.dataclass
class GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionPathParams:
    retention_policy_assignment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'retention_policy_assignment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionQueryParams:
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionRequest:
    path_params: GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionPathParams = dataclasses.field()
    query_params: GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    files_under_retention: Optional[shared_filesunderretention.FilesUnderRetention] = dataclasses.field(default=None)
    
