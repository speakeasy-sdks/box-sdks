import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class StoragePolicyTypeEnum(str, Enum):
    STORAGE_POLICY = "storage_policy"


@dataclass_json
@dataclasses.dataclass
class StoragePolicy:
    r"""StoragePolicy
    A mini description of a Storage Policy object
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[StoragePolicyTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
