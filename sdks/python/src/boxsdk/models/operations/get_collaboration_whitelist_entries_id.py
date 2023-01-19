import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import collaborationallowlistentry as shared_collaborationallowlistentry


@dataclasses.dataclass
class GetCollaborationWhitelistEntriesIDPathParams:
    collaboration_whitelist_entry_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'collaboration_whitelist_entry_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetCollaborationWhitelistEntriesIDRequest:
    path_params: GetCollaborationWhitelistEntriesIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetCollaborationWhitelistEntriesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaboration_allowlist_entry: Optional[shared_collaborationallowlistentry.CollaborationAllowlistEntry] = dataclasses.field(default=None)
    
