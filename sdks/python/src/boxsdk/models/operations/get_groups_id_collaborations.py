import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import collaborations as shared_collaborations


@dataclasses.dataclass
class GetGroupsIDCollaborationsPathParams:
    group_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'group_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetGroupsIDCollaborationsQueryParams:
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'offset', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetGroupsIDCollaborationsRequest:
    path_params: GetGroupsIDCollaborationsPathParams = dataclasses.field()
    query_params: GetGroupsIDCollaborationsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetGroupsIDCollaborationsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaborations: Optional[shared_collaborations.Collaborations] = dataclasses.field(default=None)
    
