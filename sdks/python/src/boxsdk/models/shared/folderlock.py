import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_base as shared_user_base
from ..shared import folder_mini as shared_folder_mini


@dataclass_json
@dataclasses.dataclass
class FolderLockLockedOperations:
    r"""FolderLockLockedOperations
    The operations that have been locked. Currently the `move`
    and `delete` operations cannot be locked separately, and both need to be
    set to `true`.
    
    """
    
    delete: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('delete') }})
    move: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('move') }})
    

@dataclass_json
@dataclasses.dataclass
class FolderLock:
    r"""FolderLock
    Folder locks define access restrictions placed by folder owners
    to prevent specific folders from being moved or deleted.
    """
    
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_base.UserBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    folder: Optional[shared_folder_mini.FolderMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    lock_type: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('lock_type') }})
    locked_operations: Optional[FolderLockLockedOperations] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('locked_operations') }})
    type: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
