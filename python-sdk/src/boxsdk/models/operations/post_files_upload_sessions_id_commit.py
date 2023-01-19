import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import uploadpart as shared_uploadpart
from ..shared import clienterror as shared_clienterror
from ..shared import files as shared_files


POST_FILES_UPLOAD_SESSIONS_ID_COMMIT_SERVERS = [
	"https://upload.box.com/api/2.0",
]


@dataclasses.dataclass
class PostFilesUploadSessionsIDCommitPathParams:
    upload_session_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'upload_session_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PostFilesUploadSessionsIDCommitHeaders:
    digest: str = dataclasses.field(metadata={'header': { 'field_name': 'digest', 'style': 'simple', 'explode': False }})
    if_match: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'if-match', 'style': 'simple', 'explode': False }})
    if_none_match: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'if-none-match', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostFilesUploadSessionsIDCommitRequestBody:
    parts: list[shared_uploadpart.UploadPart] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('parts') }})
    

@dataclasses.dataclass
class PostFilesUploadSessionsIDCommitRequest:
    headers: PostFilesUploadSessionsIDCommitHeaders = dataclasses.field()
    path_params: PostFilesUploadSessionsIDCommitPathParams = dataclasses.field()
    request: Optional[PostFilesUploadSessionsIDCommitRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFilesUploadSessionsIDCommitResponse:
    content_type: str = dataclasses.field()
    headers: dict[str, list[str]] = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    files: Optional[shared_files.Files] = dataclasses.field(default=None)
    
