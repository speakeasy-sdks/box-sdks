import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import uploadedpart as shared_uploadedpart


PUT_FILES_UPLOAD_SESSIONS_ID_SERVERS = [
	"https://upload.box.com/api/2.0",
]


@dataclasses.dataclass
class PutFilesUploadSessionsIDPathParams:
    upload_session_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'upload_session_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFilesUploadSessionsIDHeaders:
    content_range: str = dataclasses.field(metadata={'header': { 'field_name': 'content-range', 'style': 'simple', 'explode': False }})
    digest: str = dataclasses.field(metadata={'header': { 'field_name': 'digest', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFilesUploadSessionsIDRequest:
    headers: PutFilesUploadSessionsIDHeaders = dataclasses.field()
    path_params: PutFilesUploadSessionsIDPathParams = dataclasses.field()
    request: Optional[bytes] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/octet-stream' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFilesUploadSessionsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    uploaded_part: Optional[shared_uploadedpart.UploadedPart] = dataclasses.field(default=None)
    
