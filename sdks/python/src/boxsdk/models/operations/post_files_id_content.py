import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import files as shared_files


POST_FILES_ID_CONTENT_SERVERS = [
	"https://upload.box.com/api/2.0",
]


@dataclasses.dataclass
class PostFilesIDContentPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PostFilesIDContentQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class PostFilesIDContentHeaders:
    content_md5: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'content-md5', 'style': 'simple', 'explode': False }})
    if_match: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'if-match', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostFilesIDContentRequestBodyAttributes:
    r"""PostFilesIDContentRequestBodyAttributes
    The additional attributes of the file being uploaded. Mainly the
    name and the parent folder. These attributes are part of the multi
    part request body and are in JSON format.
    
    <Message warning>
    
      The `attributes` part of the body must come **before** the
      `file` part. Requests that do not follow this format when
      uploading the file will receive a HTTP `400` error with a
      `metadata_after_file_contents` error code.
    
    </Message>
    """
    
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    content_modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    

@dataclasses.dataclass
class PostFilesIDContentRequestBodyFile:
    content: bytes = dataclasses.field(metadata={'multipart_form': { 'content': True }})
    file: str = dataclasses.field(metadata={'multipart_form': { 'field_name': 'file' }})
    

@dataclasses.dataclass
class PostFilesIDContentRequestBody:
    attributes: PostFilesIDContentRequestBodyAttributes = dataclasses.field(metadata={'multipart_form': { 'field_name': 'attributes', 'json': True }})
    file: PostFilesIDContentRequestBodyFile = dataclasses.field(metadata={'multipart_form': { 'file': True }})
    

@dataclasses.dataclass
class PostFilesIDContentRequest:
    headers: PostFilesIDContentHeaders = dataclasses.field()
    path_params: PostFilesIDContentPathParams = dataclasses.field()
    query_params: PostFilesIDContentQueryParams = dataclasses.field()
    request: Optional[PostFilesIDContentRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'multipart/form-data' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFilesIDContentResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    files: Optional[shared_files.Files] = dataclasses.field(default=None)
    
