import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import items as shared_items


@dataclasses.dataclass
class GetFoldersIDItemsPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    
class GetFoldersIDItemsDirectionEnum(str, Enum):
    ASC = "ASC"
    DESC = "DESC"

class GetFoldersIDItemsSortEnum(str, Enum):
    ID = "id"
    NAME = "name"
    DATE = "date"
    SIZE = "size"


@dataclasses.dataclass
class GetFoldersIDItemsQueryParams:
    direction: Optional[GetFoldersIDItemsDirectionEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'direction', 'style': 'form', 'explode': True }})
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'offset', 'style': 'form', 'explode': True }})
    sort: Optional[GetFoldersIDItemsSortEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'sort', 'style': 'form', 'explode': True }})
    usemarker: Optional[bool] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'usemarker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetFoldersIDItemsHeaders:
    boxapi: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'boxapi', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFoldersIDItemsRequest:
    headers: GetFoldersIDItemsHeaders = dataclasses.field()
    path_params: GetFoldersIDItemsPathParams = dataclasses.field()
    query_params: GetFoldersIDItemsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFoldersIDItemsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    items: Optional[shared_items.Items] = dataclasses.field(default=None)
    
