import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from boxsdk import utils
from ..shared import filerequestupdaterequest as shared_filerequestupdaterequest
from ..shared import clienterror as shared_clienterror
from ..shared import filerequest as shared_filerequest


@dataclasses.dataclass
class PutFileRequestsIDPathParams:
    file_request_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_request_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFileRequestsIDHeaders:
    if_match: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'if-match', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFileRequestsIDRequest:
    headers: PutFileRequestsIDHeaders = dataclasses.field()
    path_params: PutFileRequestsIDPathParams = dataclasses.field()
    request: Optional[shared_filerequestupdaterequest.FileRequestUpdateRequest] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFileRequestsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_request: Optional[shared_filerequest.FileRequest] = dataclasses.field(default=None)
    
