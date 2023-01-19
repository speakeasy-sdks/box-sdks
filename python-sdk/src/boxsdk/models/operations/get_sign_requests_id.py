import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import signrequest as shared_signrequest


@dataclasses.dataclass
class GetSignRequestsIDPathParams:
    sign_request_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'sign_request_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetSignRequestsIDRequest:
    path_params: GetSignRequestsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetSignRequestsIDResponseOutput:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    sign_request: Optional[shared_signrequest.SignRequestOutput] = dataclasses.field(default=None)
    
