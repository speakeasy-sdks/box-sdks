import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import groupmembership as shared_groupmembership

class GroupMembershipsOrderDirectionEnum(str, Enum):
    ASC = "ASC"
    DESC = "DESC"


@dataclass_json
@dataclasses.dataclass
class GroupMembershipsOrder:
    r"""GroupMembershipsOrder
    The order in which a pagination is ordered
    """
    
    by: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('by') }})
    direction: Optional[GroupMembershipsOrderDirectionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('direction') }})
    

@dataclass_json
@dataclasses.dataclass
class GroupMemberships:
    r"""GroupMemberships
    The part of an API response that describes pagination
    """
    
    entries: Optional[list[shared_groupmembership.GroupMembership]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('offset') }})
    order: Optional[list[GroupMembershipsOrder]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('order') }})
    total_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
