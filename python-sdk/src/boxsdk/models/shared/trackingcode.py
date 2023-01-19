import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class TrackingCodeTypeEnum(str, Enum):
    TRACKING_CODE = "tracking_code"


@dataclass_json
@dataclasses.dataclass
class TrackingCode:
    r"""TrackingCode
    Tracking codes allow an admin to generate reports from the admin console
    and assign an attribute to a specific group of users.
    This setting must be enabled for an enterprise before it can be used.
    """
    
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[TrackingCodeTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    value: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    
