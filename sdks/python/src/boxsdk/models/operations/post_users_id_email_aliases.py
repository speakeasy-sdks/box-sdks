import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import emailalias as shared_emailalias


@dataclasses.dataclass
class PostUsersIDEmailAliasesPathParams:
    user_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'user_id', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostUsersIDEmailAliasesRequestBody:
    email: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('email') }})
    

@dataclasses.dataclass
class PostUsersIDEmailAliasesRequest:
    path_params: PostUsersIDEmailAliasesPathParams = dataclasses.field()
    request: Optional[PostUsersIDEmailAliasesRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostUsersIDEmailAliasesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    email_alias: Optional[shared_emailalias.EmailAlias] = dataclasses.field(default=None)
    
