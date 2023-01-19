import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import filescope as shared_filescope

class AccessTokenIssuedTokenTypeEnum(str, Enum):
    URN_IETF_PARAMS_OAUTH_TOKEN_TYPE_ACCESS_TOKEN = "urn:ietf:params:oauth:token-type:access_token"

class AccessTokenTokenTypeEnum(str, Enum):
    BEARER = "bearer"


@dataclass_json
@dataclasses.dataclass
class AccessToken:
    r"""AccessToken
    A token that can be used to make authenticated API calls.
    """
    
    access_token: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access_token') }})
    expires_in: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('expires_in') }})
    issued_token_type: Optional[AccessTokenIssuedTokenTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('issued_token_type') }})
    refresh_token: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('refresh_token') }})
    restricted_to: Optional[list[shared_filescope.FileScope]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('restricted_to') }})
    token_type: Optional[AccessTokenTokenTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('token_type') }})
    
