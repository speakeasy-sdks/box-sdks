import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import collaboration as shared_collaboration

class CollaborationsOrderDirectionEnum(str, Enum):
    ASC = "ASC"
    DESC = "DESC"


@dataclass_json
@dataclasses.dataclass
class CollaborationsOrder:
    r"""CollaborationsOrder
    The order in which a pagination is ordered
    """
    
    by: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('by') }})
    direction: Optional[CollaborationsOrderDirectionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('direction') }})
    

@dataclass_json
@dataclasses.dataclass
class Collaborations:
    r"""Collaborations
    The part of an API response that describes pagination
    """
    
    entries: Optional[list[shared_collaboration.Collaboration]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('offset') }})
    order: Optional[list[CollaborationsOrder]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('order') }})
    total_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
