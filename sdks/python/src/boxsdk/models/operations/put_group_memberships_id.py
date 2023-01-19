import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import groupmembership as shared_groupmembership


@dataclasses.dataclass
class PutGroupMembershipsIDPathParams:
    group_membership_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'group_membership_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutGroupMembershipsIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    
class PutGroupMembershipsIDRequestBodyRoleEnum(str, Enum):
    MEMBER = "member"
    ADMIN = "admin"


@dataclass_json
@dataclasses.dataclass
class PutGroupMembershipsIDRequestBody:
    configurable_permissions: Optional[dict[str, bool]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('configurable_permissions') }})
    role: Optional[PutGroupMembershipsIDRequestBodyRoleEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('role') }})
    

@dataclasses.dataclass
class PutGroupMembershipsIDRequest:
    path_params: PutGroupMembershipsIDPathParams = dataclasses.field()
    query_params: PutGroupMembershipsIDQueryParams = dataclasses.field()
    request: Optional[PutGroupMembershipsIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutGroupMembershipsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    group_membership: Optional[shared_groupmembership.GroupMembership] = dataclasses.field(default=None)
    
