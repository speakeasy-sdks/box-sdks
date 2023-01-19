import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import signrequestcreaterequest as shared_signrequestcreaterequest
from ..shared import clienterror as shared_clienterror
from ..shared import signrequest as shared_signrequest


@dataclasses.dataclass
class PostSignRequestsRequest:
    request: Optional[shared_signrequestcreaterequest.SignRequestCreateRequest] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostSignRequestsResponseOutput:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    sign_request: Optional[shared_signrequest.SignRequestOutput] = dataclasses.field(default=None)
    
