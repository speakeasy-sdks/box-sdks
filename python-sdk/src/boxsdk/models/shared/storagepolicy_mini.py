import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class StoragePolicyMiniTypeEnum(str, Enum):
    STORAGE_POLICY = "storage_policy"


@dataclass_json
@dataclasses.dataclass
class StoragePolicyMini:
    r"""StoragePolicyMini
    A mini description of a Storage Policy object
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[StoragePolicyMiniTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
