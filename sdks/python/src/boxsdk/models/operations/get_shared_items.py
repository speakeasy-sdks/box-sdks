import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import file as shared_file


@dataclasses.dataclass
class GetSharedItemsQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetSharedItemsHeaders:
    boxapi: str = dataclasses.field(metadata={'header': { 'field_name': 'boxapi', 'style': 'simple', 'explode': False }})
    if_none_match: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'if-none-match', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetSharedItemsRequest:
    headers: GetSharedItemsHeaders = dataclasses.field()
    query_params: GetSharedItemsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetSharedItemsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file: Optional[shared_file.File] = dataclasses.field(default=None)
    
