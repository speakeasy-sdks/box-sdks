import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import groups as shared_groups


@dataclasses.dataclass
class GetGroupsQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    filter_term: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'filter_term', 'style': 'form', 'explode': True }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'offset', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetGroupsRequest:
    query_params: GetGroupsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetGroupsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    groups: Optional[shared_groups.Groups] = dataclasses.field(default=None)
    
