import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import collaborations as shared_collaborations

class GetCollaborationsStatusEnum(str, Enum):
    PENDING = "pending"


@dataclasses.dataclass
class GetCollaborationsQueryParams:
    status: GetCollaborationsStatusEnum = dataclasses.field(metadata={'query_param': { 'field_name': 'status', 'style': 'form', 'explode': True }})
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'offset', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetCollaborationsRequest:
    query_params: GetCollaborationsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetCollaborationsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaborations: Optional[shared_collaborations.Collaborations] = dataclasses.field(default=None)
    
