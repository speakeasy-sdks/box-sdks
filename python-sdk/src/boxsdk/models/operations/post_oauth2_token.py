import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import postoauth2token as shared_postoauth2token
from ..shared import accesstoken as shared_accesstoken
from ..shared import oauth2error as shared_oauth2error


POST_OAUTH2_TOKEN_SERVERS = [
	"https://api.box.com",
]


@dataclasses.dataclass
class PostOauth2TokenRequest:
    request: Optional[shared_postoauth2token.PostOAuth2Token] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/x-www-form-urlencoded' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostOauth2TokenResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    access_token: Optional[shared_accesstoken.AccessToken] = dataclasses.field(default=None)
    o_auth2_error: Optional[shared_oauth2error.OAuth2Error] = dataclasses.field(default=None)
    
