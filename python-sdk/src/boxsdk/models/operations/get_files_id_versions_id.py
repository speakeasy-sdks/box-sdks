import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import fileversion as shared_fileversion


@dataclasses.dataclass
class GetFilesIDVersionsIDPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    file_version_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_version_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDVersionsIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDVersionsIDRequest:
    path_params: GetFilesIDVersionsIDPathParams = dataclasses.field()
    query_params: GetFilesIDVersionsIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesIDVersionsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_version: Optional[shared_fileversion.FileVersion] = dataclasses.field(default=None)
    
