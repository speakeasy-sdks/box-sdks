import dataclasses
from enum import Enum

class PostOAuth2TokenRefreshAccessTokenGrantTypeEnum(str, Enum):
    REFRESH_TOKEN = "refresh_token"


@dataclasses.dataclass
class PostOAuth2TokenRefreshAccessToken:
    r"""PostOAuth2TokenRefreshAccessToken
    A request to refresh an Access Token. Use this API to refresh an expired
    Access Token using a valid Refresh Token.
    """
    
    client_id: str = dataclasses.field(metadata={'form': { 'field_name': 'client_id' }})
    client_secret: str = dataclasses.field(metadata={'form': { 'field_name': 'client_secret' }})
    grant_type: PostOAuth2TokenRefreshAccessTokenGrantTypeEnum = dataclasses.field(metadata={'form': { 'field_name': 'grant_type' }})
    refresh_token: str = dataclasses.field(metadata={'form': { 'field_name': 'refresh_token' }})
    
