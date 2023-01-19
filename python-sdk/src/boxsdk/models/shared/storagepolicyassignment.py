import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import storagepolicy_mini as shared_storagepolicy_mini


@dataclass_json
@dataclasses.dataclass
class StoragePolicyAssignmentReference:
    r"""StoragePolicyAssignmentReference
    The bare basic reference for an object
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class StoragePolicyAssignment:
    r"""StoragePolicyAssignment
    The assignment of a storage policy to a user or enterprise
    """
    
    assigned_to: Optional[StoragePolicyAssignmentReference] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('assigned_to') }})
    storage_policy: Optional[shared_storagepolicy_mini.StoragePolicyMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('storage_policy') }})
    
