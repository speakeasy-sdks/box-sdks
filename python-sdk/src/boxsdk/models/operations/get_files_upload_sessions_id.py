import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import uploadsession as shared_uploadsession


GET_FILES_UPLOAD_SESSIONS_ID_SERVERS = [
	"https://upload.box.com/api/2.0",
]


@dataclasses.dataclass
class GetFilesUploadSessionsIDPathParams:
    upload_session_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'upload_session_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesUploadSessionsIDRequest:
    path_params: GetFilesUploadSessionsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesUploadSessionsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    upload_session: Optional[shared_uploadsession.UploadSession] = dataclasses.field(default=None)
    
