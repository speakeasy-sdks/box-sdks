import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import devicepinner as shared_devicepinner

class DevicePinnersOrderByEnum(str, Enum):
    ID = "id"

class DevicePinnersOrderDirectionEnum(str, Enum):
    ASC = "asc"
    DESC = "desc"


@dataclass_json
@dataclasses.dataclass
class DevicePinnersOrder:
    r"""DevicePinnersOrder
    The order in which a pagination is ordered
    """
    
    by: Optional[DevicePinnersOrderByEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('by') }})
    direction: Optional[DevicePinnersOrderDirectionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('direction') }})
    

@dataclass_json
@dataclasses.dataclass
class DevicePinners:
    r"""DevicePinners
    A list of device pins
    """
    
    entries: Optional[list[shared_devicepinner.DevicePinner]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    next_marker: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next_marker') }})
    order: Optional[list[DevicePinnersOrder]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('order') }})
    
