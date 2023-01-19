import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import groupmembership as shared_groupmembership


@dataclasses.dataclass
class GetGroupMembershipsIDPathParams:
    group_membership_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'group_membership_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetGroupMembershipsIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetGroupMembershipsIDRequest:
    path_params: GetGroupMembershipsIDPathParams = dataclasses.field()
    query_params: GetGroupMembershipsIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetGroupMembershipsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    group_membership: Optional[shared_groupmembership.GroupMembership] = dataclasses.field(default=None)
    
