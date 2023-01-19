import dataclasses
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class ItemsOrderDirectionEnum(str, Enum):
    ASC = "ASC"
    DESC = "DESC"


@dataclass_json
@dataclasses.dataclass
class ItemsOrder:
    r"""ItemsOrder
    The order in which a pagination is ordered
    """
    
    by: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('by') }})
    direction: Optional[ItemsOrderDirectionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('direction') }})
    

@dataclass_json
@dataclasses.dataclass
class Items:
    r"""Items
    The part of an API response that describes pagination
    """
    
    entries: Optional[list[Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('offset') }})
    order: Optional[list[ItemsOrder]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('order') }})
    total_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
