import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import emailaliases as shared_emailaliases


@dataclasses.dataclass
class GetUsersIDEmailAliasesPathParams:
    user_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'user_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetUsersIDEmailAliasesRequest:
    path_params: GetUsersIDEmailAliasesPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetUsersIDEmailAliasesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    email_aliases: Optional[shared_emailaliases.EmailAliases] = dataclasses.field(default=None)
    
