import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import folder_mini as shared_folder_mini
from ..shared import user_mini as shared_user_mini
from ..shared import fileversion_mini as shared_fileversion_mini

class TrashFileRestoredItemStatusEnum(str, Enum):
    ACTIVE = "active"
    TRASHED = "trashed"
    DELETED = "deleted"

class TrashFileRestoredUserBaseTypeEnum(str, Enum):
    USER = "user"


@dataclass_json
@dataclasses.dataclass
class TrashFileRestoredUserBase:
    r"""TrashFileRestoredUserBase
    The user who last modified this file
    """
    
    login: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('login') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: TrashFileRestoredUserBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class TrashFileRestoredFolderBaseTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class TrashFileRestoredFolderBase:
    r"""TrashFileRestoredFolderBase
    The folder that this file is located within.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: TrashFileRestoredFolderBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    sequence_id: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    

@dataclass_json
@dataclasses.dataclass
class TrashFileRestoredPathCollection:
    r"""TrashFileRestoredPathCollection
    The tree of folders that this file is contained in,
    starting at the root.
    """
    
    entries: list[shared_folder_mini.FolderMini] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    total_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
class TrashFileRestoredTypeEnum(str, Enum):
    FILE = "file"


@dataclass_json
@dataclasses.dataclass
class TrashFileRestored:
    r"""TrashFileRestored
    Represents a file restored from the trash.
    """
    
    created_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    description: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    item_status: TrashFileRestoredItemStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item_status') }})
    modified_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    modified_by: TrashFileRestoredUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_by') }})
    owned_by: TrashFileRestoredUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('owned_by') }})
    path_collection: TrashFileRestoredPathCollection = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('path_collection') }})
    sequence_id: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    sha1: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('sha1') }})
    size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('size') }})
    type: TrashFileRestoredTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    content_created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    content_modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    file_version: Optional[shared_fileversion_mini.FileVersionMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('file_version') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    parent: Optional[TrashFileRestoredFolderBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    purged_at: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('purged_at') }})
    shared_link: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    trashed_at: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('trashed_at') }})
    
