import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import collaborationallowlistentry as shared_collaborationallowlistentry

class PostCollaborationWhitelistEntriesRequestBodyDirectionEnum(str, Enum):
    INBOUND = "inbound"
    OUTBOUND = "outbound"
    BOTH = "both"


@dataclass_json
@dataclasses.dataclass
class PostCollaborationWhitelistEntriesRequestBody:
    direction: PostCollaborationWhitelistEntriesRequestBodyDirectionEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('direction') }})
    domain: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('domain') }})
    

@dataclasses.dataclass
class PostCollaborationWhitelistEntriesRequest:
    request: Optional[PostCollaborationWhitelistEntriesRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostCollaborationWhitelistEntriesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaboration_allowlist_entry: Optional[shared_collaborationallowlistentry.CollaborationAllowlistEntry] = dataclasses.field(default=None)
    
