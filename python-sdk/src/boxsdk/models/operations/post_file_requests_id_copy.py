import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import filerequestcopyrequest as shared_filerequestcopyrequest
from ..shared import clienterror as shared_clienterror
from ..shared import filerequest as shared_filerequest


@dataclasses.dataclass
class PostFileRequestsIDCopyPathParams:
    file_request_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_request_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PostFileRequestsIDCopyRequest:
    path_params: PostFileRequestsIDCopyPathParams = dataclasses.field()
    request: Optional[shared_filerequestcopyrequest.FileRequestCopyRequest] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFileRequestsIDCopyResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_request: Optional[shared_filerequest.FileRequest] = dataclasses.field(default=None)
    
