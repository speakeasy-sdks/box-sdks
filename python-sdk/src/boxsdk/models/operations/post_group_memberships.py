import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import groupmembership as shared_groupmembership


@dataclasses.dataclass
class PostGroupMembershipsQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostGroupMembershipsRequestBodyGroup:
    r"""PostGroupMembershipsRequestBodyGroup
    The group to add the user to.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class PostGroupMembershipsRequestBodyRoleEnum(str, Enum):
    MEMBER = "member"
    ADMIN = "admin"


@dataclass_json
@dataclasses.dataclass
class PostGroupMembershipsRequestBodyUser:
    r"""PostGroupMembershipsRequestBodyUser
    The user to add to the group.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    

@dataclass_json
@dataclasses.dataclass
class PostGroupMembershipsRequestBody:
    group: PostGroupMembershipsRequestBodyGroup = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('group') }})
    user: PostGroupMembershipsRequestBodyUser = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('user') }})
    configurable_permissions: Optional[dict[str, bool]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('configurable_permissions') }})
    role: Optional[PostGroupMembershipsRequestBodyRoleEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('role') }})
    

@dataclasses.dataclass
class PostGroupMembershipsRequest:
    query_params: PostGroupMembershipsQueryParams = dataclasses.field()
    request: Optional[PostGroupMembershipsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostGroupMembershipsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    group_membership: Optional[shared_groupmembership.GroupMembership] = dataclasses.field(default=None)
    
