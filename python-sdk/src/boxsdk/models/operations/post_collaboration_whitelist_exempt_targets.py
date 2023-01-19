import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import collaborationallowlistexempttarget as shared_collaborationallowlistexempttarget


@dataclass_json
@dataclasses.dataclass
class PostCollaborationWhitelistExemptTargetsRequestBodyUser:
    r"""PostCollaborationWhitelistExemptTargetsRequestBodyUser
    The user to exempt.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    

@dataclass_json
@dataclasses.dataclass
class PostCollaborationWhitelistExemptTargetsRequestBody:
    user: PostCollaborationWhitelistExemptTargetsRequestBodyUser = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('user') }})
    

@dataclasses.dataclass
class PostCollaborationWhitelistExemptTargetsRequest:
    request: Optional[PostCollaborationWhitelistExemptTargetsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostCollaborationWhitelistExemptTargetsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaboration_allowlist_exempt_target: Optional[shared_collaborationallowlistexempttarget.CollaborationAllowlistExemptTarget] = dataclasses.field(default=None)
    
