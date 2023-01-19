import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import invite as shared_invite


@dataclasses.dataclass
class GetInvitesIDPathParams:
    invite_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'invite_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetInvitesIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetInvitesIDRequest:
    path_params: GetInvitesIDPathParams = dataclasses.field()
    query_params: GetInvitesIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetInvitesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    invite: Optional[shared_invite.Invite] = dataclasses.field(default=None)
    
