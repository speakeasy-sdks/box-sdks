import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import useravatar as shared_useravatar


@dataclasses.dataclass
class PostUsersIDAvatarPathParams:
    user_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'user_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PostUsersIDAvatarRequestBodyPic:
    content: bytes = dataclasses.field(metadata={'multipart_form': { 'content': True }})
    pic: str = dataclasses.field(metadata={'multipart_form': { 'field_name': 'pic' }})
    

@dataclasses.dataclass
class PostUsersIDAvatarRequestBody:
    pic: PostUsersIDAvatarRequestBodyPic = dataclasses.field(metadata={'multipart_form': { 'file': True }})
    

@dataclasses.dataclass
class PostUsersIDAvatarRequest:
    path_params: PostUsersIDAvatarPathParams = dataclasses.field()
    request: Optional[PostUsersIDAvatarRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'multipart/form-data' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostUsersIDAvatarResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    user_avatar: Optional[shared_useravatar.UserAvatar] = dataclasses.field(default=None)
    
