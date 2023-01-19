import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import group as shared_group


@dataclasses.dataclass
class PutGroupsIDPathParams:
    group_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'group_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutGroupsIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    
class PutGroupsIDRequestBodyInvitabilityLevelEnum(str, Enum):
    ADMINS_ONLY = "admins_only"
    ADMINS_AND_MEMBERS = "admins_and_members"
    ALL_MANAGED_USERS = "all_managed_users"

class PutGroupsIDRequestBodyMemberViewabilityLevelEnum(str, Enum):
    ADMINS_ONLY = "admins_only"
    ADMINS_AND_MEMBERS = "admins_and_members"
    ALL_MANAGED_USERS = "all_managed_users"


@dataclass_json
@dataclasses.dataclass
class PutGroupsIDRequestBody:
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    external_sync_identifier: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('external_sync_identifier') }})
    invitability_level: Optional[PutGroupsIDRequestBodyInvitabilityLevelEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('invitability_level') }})
    member_viewability_level: Optional[PutGroupsIDRequestBodyMemberViewabilityLevelEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('member_viewability_level') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    provenance: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('provenance') }})
    

@dataclasses.dataclass
class PutGroupsIDRequest:
    path_params: PutGroupsIDPathParams = dataclasses.field()
    query_params: PutGroupsIDQueryParams = dataclasses.field()
    request: Optional[PutGroupsIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutGroupsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    group: Optional[shared_group.Group] = dataclasses.field(default=None)
    
