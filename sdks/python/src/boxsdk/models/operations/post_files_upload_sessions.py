import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import uploadsession as shared_uploadsession


POST_FILES_UPLOAD_SESSIONS_SERVERS = [
	"https://upload.box.com/api/2.0",
]


@dataclass_json
@dataclasses.dataclass
class PostFilesUploadSessionsRequestBody:
    file_name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('file_name') }})
    file_size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('file_size') }})
    folder_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder_id') }})
    

@dataclasses.dataclass
class PostFilesUploadSessionsRequest:
    request: Optional[PostFilesUploadSessionsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFilesUploadSessionsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    upload_session: Optional[shared_uploadsession.UploadSession] = dataclasses.field(default=None)
    
