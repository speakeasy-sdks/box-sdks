import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import users as shared_users

class GetUsersUserTypeEnum(str, Enum):
    ALL = "all"
    MANAGED = "managed"
    EXTERNAL = "external"


@dataclasses.dataclass
class GetUsersQueryParams:
    external_app_user_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'external_app_user_id', 'style': 'form', 'explode': True }})
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    filter_term: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'filter_term', 'style': 'form', 'explode': True }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'offset', 'style': 'form', 'explode': True }})
    usemarker: Optional[bool] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'usemarker', 'style': 'form', 'explode': True }})
    user_type: Optional[GetUsersUserTypeEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'user_type', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetUsersRequest:
    query_params: GetUsersQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetUsersResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    users: Optional[shared_users.Users] = dataclasses.field(default=None)
    
