import dataclasses
from typing import Optional
from enum import Enum

class PostOAuth2TokenActorTokenTypeEnum(str, Enum):
    URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ID_TOKEN = "urn:ietf:params:oauth:token-type:id_token"

class PostOAuth2TokenBoxSubjectTypeEnum(str, Enum):
    ENTERPRISE = "enterprise"
    USER = "user"

class PostOAuth2TokenGrantTypeEnum(str, Enum):
    AUTHORIZATION_CODE = "authorization_code"
    REFRESH_TOKEN = "refresh_token"
    CLIENT_CREDENTIALS = "client_credentials"
    URN_IETF_PARAMS_OAUTH_GRANT_TYPE_JWT_BEARER = "urn:ietf:params:oauth:grant-type:jwt-bearer"
    URN_IETF_PARAMS_OAUTH_GRANT_TYPE_TOKEN_EXCHANGE = "urn:ietf:params:oauth:grant-type:token-exchange"

class PostOAuth2TokenSubjectTokenTypeEnum(str, Enum):
    URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN = "urn:ietf:params:oauth:token-type:access_token"


@dataclasses.dataclass
class PostOAuth2Token:
    r"""PostOAuth2Token
    A request for a new OAuth 2.0 token
    """
    
    grant_type: PostOAuth2TokenGrantTypeEnum = dataclasses.field(metadata={'form': { 'field_name': 'grant_type' }})
    actor_token: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'actor_token' }})
    actor_token_type: Optional[PostOAuth2TokenActorTokenTypeEnum] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'actor_token_type' }})
    assertion: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'assertion' }})
    box_shared_link: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'box_shared_link' }})
    box_subject_id: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'box_subject_id' }})
    box_subject_type: Optional[PostOAuth2TokenBoxSubjectTypeEnum] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'box_subject_type' }})
    client_id: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'client_id' }})
    client_secret: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'client_secret' }})
    code: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'code' }})
    refresh_token: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'refresh_token' }})
    resource: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'resource' }})
    scope: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'scope' }})
    subject_token: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'subject_token' }})
    subject_token_type: Optional[PostOAuth2TokenSubjectTokenTypeEnum] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'subject_token_type' }})
    
