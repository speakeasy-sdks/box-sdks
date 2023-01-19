import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import file as shared_file


@dataclasses.dataclass
class GetFilesIDNumberGetSharedLinkPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDNumberGetSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetFilesIDNumberGetSharedLinkRequest:
    path_params: GetFilesIDNumberGetSharedLinkPathParams = dataclasses.field()
    query_params: GetFilesIDNumberGetSharedLinkQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesIDNumberGetSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file: Optional[shared_file.File] = dataclasses.field(default=None)
    
