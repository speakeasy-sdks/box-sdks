import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import invite as shared_invite


@dataclasses.dataclass
class PostInvitesQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostInvitesRequestBodyActionableBy:
    r"""PostInvitesRequestBodyActionableBy
    The user to invite
    """
    
    login: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('login') }})
    

@dataclass_json
@dataclasses.dataclass
class PostInvitesRequestBodyEnterprise:
    r"""PostInvitesRequestBodyEnterprise
    The enterprise to invite the user to
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    

@dataclass_json
@dataclasses.dataclass
class PostInvitesRequestBody:
    actionable_by: PostInvitesRequestBodyActionableBy = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('actionable_by') }})
    enterprise: PostInvitesRequestBodyEnterprise = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('enterprise') }})
    

@dataclasses.dataclass
class PostInvitesRequest:
    query_params: PostInvitesQueryParams = dataclasses.field()
    request: Optional[PostInvitesRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostInvitesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    invite: Optional[shared_invite.Invite] = dataclasses.field(default=None)
    
