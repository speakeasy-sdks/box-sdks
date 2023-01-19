import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class ShieldInformationBarrierBaseTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER = "shield_information_barrier"


@dataclass_json
@dataclasses.dataclass
class ShieldInformationBarrierBase:
    r"""ShieldInformationBarrierBase
    A base representation of a
    shield information barrier object
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[ShieldInformationBarrierBaseTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
