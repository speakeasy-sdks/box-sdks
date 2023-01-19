import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import uploadparts as shared_uploadparts


GET_FILES_UPLOAD_SESSIONS_ID_PARTS_SERVERS = [
	"https://upload.box.com/api/2.0",
]


@dataclasses.dataclass
class GetFilesUploadSessionsIDPartsPathParams:
    upload_session_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'upload_session_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesUploadSessionsIDPartsQueryParams:
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'offset', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetFilesUploadSessionsIDPartsRequest:
    path_params: GetFilesUploadSessionsIDPartsPathParams = dataclasses.field()
    query_params: GetFilesUploadSessionsIDPartsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesUploadSessionsIDPartsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    upload_parts: Optional[shared_uploadparts.UploadParts] = dataclasses.field(default=None)
    
