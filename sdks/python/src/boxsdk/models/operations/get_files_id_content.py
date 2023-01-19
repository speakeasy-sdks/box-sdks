import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class GetFilesIDContentPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDContentQueryParams:
    access_token: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'access_token', 'style': 'form', 'explode': True }})
    version: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'version', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetFilesIDContentHeaders:
    boxapi: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'boxapi', 'style': 'simple', 'explode': False }})
    range: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'range', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDContentRequest:
    headers: GetFilesIDContentHeaders = dataclasses.field()
    path_params: GetFilesIDContentPathParams = dataclasses.field()
    query_params: GetFilesIDContentQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesIDContentResponse:
    content_type: str = dataclasses.field()
    headers: dict[str, list[str]] = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
