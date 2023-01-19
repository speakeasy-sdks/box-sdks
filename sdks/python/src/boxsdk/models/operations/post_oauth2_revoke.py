import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import postoauth2revoke as shared_postoauth2revoke
from ..shared import oauth2error as shared_oauth2error


POST_OAUTH2_REVOKE_SERVERS = [
	"https://api.box.com",
]


@dataclasses.dataclass
class PostOauth2RevokeRequest:
    request: Optional[shared_postoauth2revoke.PostOAuth2Revoke] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/x-www-form-urlencoded' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostOauth2RevokeResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    o_auth2_error: Optional[shared_oauth2error.OAuth2Error] = dataclasses.field(default=None)
    
