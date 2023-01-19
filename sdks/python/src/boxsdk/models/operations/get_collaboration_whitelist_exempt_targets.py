import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import collaborationallowlistexempttargets as shared_collaborationallowlistexempttargets


@dataclasses.dataclass
class GetCollaborationWhitelistExemptTargetsQueryParams:
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetCollaborationWhitelistExemptTargetsRequest:
    query_params: GetCollaborationWhitelistExemptTargetsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetCollaborationWhitelistExemptTargetsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaboration_allowlist_exempt_targets: Optional[shared_collaborationallowlistexempttargets.CollaborationAllowlistExemptTargets] = dataclasses.field(default=None)
    
