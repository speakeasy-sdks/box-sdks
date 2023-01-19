import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class TrashFolderUserBaseTypeEnum(str, Enum):
    USER = "user"


@dataclass_json
@dataclasses.dataclass
class TrashFolderUserBase:
    r"""TrashFolderUserBase
    The user who created this folder
    """
    
    login: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('login') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: TrashFolderUserBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class TrashFolderItemStatusEnum(str, Enum):
    ACTIVE = "active"
    TRASHED = "trashed"
    DELETED = "deleted"

class TrashFolderFolderBaseTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class TrashFolderFolderBase:
    r"""TrashFolderFolderBase
    The optional folder that this folder is located within.
    
    This value may be `null` for some folders such as the
    root folder or the trash folder.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: TrashFolderFolderBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    sequence_id: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    
class TrashFolderPathCollectionTrashEntriesTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class TrashFolderPathCollectionTrashEntries:
    r"""TrashFolderPathCollectionTrashEntries
    The parent folder for this item
    """
    
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    sequence_id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    type: Optional[TrashFolderPathCollectionTrashEntriesTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class TrashFolderPathCollectionTrash:
    r"""TrashFolderPathCollectionTrash
    The tree of folders that this file is contained in,
    starting at the root.
    """
    
    entries: list[TrashFolderPathCollectionTrashEntries] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    total_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
class TrashFolderTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class TrashFolder:
    r"""TrashFolder
    Represents a trashed folder.
    """
    
    created_by: TrashFolderUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    description: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    item_status: TrashFolderItemStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item_status') }})
    modified_by: TrashFolderUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_by') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    owned_by: TrashFolderUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('owned_by') }})
    path_collection: TrashFolderPathCollectionTrash = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('path_collection') }})
    size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('size') }})
    type: TrashFolderTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    content_created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    content_modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    folder_upload_email: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder_upload_email') }})
    modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    parent: Optional[TrashFolderFolderBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    purged_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('purged_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    sequence_id: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    shared_link: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    trashed_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('trashed_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    
