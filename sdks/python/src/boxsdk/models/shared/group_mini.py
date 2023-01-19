import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class GroupMiniGroupTypeEnum(str, Enum):
    MANAGED_GROUP = "managed_group"
    ALL_USERS_GROUP = "all_users_group"

class GroupMiniTypeEnum(str, Enum):
    GROUP = "group"


@dataclass_json
@dataclasses.dataclass
class GroupMini:
    r"""GroupMini
    A base representation of a group.
    """
    
    group_type: Optional[GroupMiniGroupTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('group_type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[GroupMiniTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
