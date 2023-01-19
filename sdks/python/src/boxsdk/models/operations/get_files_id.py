import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import file as shared_file


@dataclasses.dataclass
class GetFilesIDPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDHeaders:
    x_rep_hints: str = dataclasses.field(metadata={'header': { 'field_name': 'x-rep-hints', 'style': 'simple', 'explode': False }})
    boxapi: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'boxapi', 'style': 'simple', 'explode': False }})
    if_none_match: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'if-none-match', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDRequest:
    headers: GetFilesIDHeaders = dataclasses.field()
    path_params: GetFilesIDPathParams = dataclasses.field()
    query_params: GetFilesIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file: Optional[shared_file.File] = dataclasses.field(default=None)
    
