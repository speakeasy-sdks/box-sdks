import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class PostSignRequestsIDResendPathParams:
    sign_request_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'sign_request_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PostSignRequestsIDResendRequest:
    path_params: PostSignRequestsIDResendPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostSignRequestsIDResendResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
