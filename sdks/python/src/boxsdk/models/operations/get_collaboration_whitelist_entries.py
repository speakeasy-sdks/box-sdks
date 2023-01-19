import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import collaborationallowlistentries as shared_collaborationallowlistentries


@dataclasses.dataclass
class GetCollaborationWhitelistEntriesQueryParams:
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetCollaborationWhitelistEntriesRequest:
    query_params: GetCollaborationWhitelistEntriesQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetCollaborationWhitelistEntriesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaboration_allowlist_entries: Optional[shared_collaborationallowlistentries.CollaborationAllowlistEntries] = dataclasses.field(default=None)
    
