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

class FileItemStatusEnum(str, Enum):
    ACTIVE = "active"
    TRASHED = "trashed"
    DELETED = "deleted"

class FileUserBaseTypeEnum(str, Enum):
    USER = "user"


@dataclass_json
@dataclasses.dataclass
class FileUserBase:
    r"""FileUserBase
    The user who last modified this file
    """
    
    login: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('login') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: FileUserBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class FileFolderBaseTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class FileFolderBase:
    r"""FileFolderBase
    The folder that this file is located within.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: FileFolderBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    sequence_id: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    

@dataclass_json
@dataclasses.dataclass
class FilePathCollection:
    r"""FilePathCollection
    The tree of folders that this file is contained in,
    starting at the root.
    """
    
    entries: list[shared_folder_mini.FolderMini] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    total_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
class FileSharedLinkAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"

class FileSharedLinkEffectiveAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"

class FileSharedLinkEffectivePermissionEnum(str, Enum):
    CAN_EDIT = "can_edit"
    CAN_DOWNLOAD = "can_download"
    CAN_PREVIEW = "can_preview"
    NO_ACCESS = "no_access"


@dataclass_json
@dataclasses.dataclass
class FileSharedLinkPermissions:
    r"""FileSharedLinkPermissions
    Defines if this link allows a user to preview, edit, and download an item.
    These permissions refer to the shared link only and
    do not supersede permissions applied to the item itself.
    """
    
    can_download: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_download') }})
    can_edit: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_edit') }})
    can_preview: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_preview') }})
    

@dataclass_json
@dataclasses.dataclass
class FileSharedLink:
    r"""FileSharedLink
    The shared link for this file. This will be
    `null` if no shared link has been created for this
    file.
    """
    
    download_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('download_count') }})
    effective_access: FileSharedLinkEffectiveAccessEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('effective_access') }})
    effective_permission: FileSharedLinkEffectivePermissionEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('effective_permission') }})
    is_password_enabled: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_password_enabled') }})
    preview_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('preview_count') }})
    url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('url') }})
    access: Optional[FileSharedLinkAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    download_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('download_url') }})
    permissions: Optional[FileSharedLinkPermissions] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('permissions') }})
    unshared_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('unshared_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    vanity_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_name') }})
    vanity_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_url') }})
    
class FileTypeEnum(str, Enum):
    FILE = "file"


@dataclass_json
@dataclasses.dataclass
class File:
    r"""File
    The bare basic representation of a file, the minimal
    amount of fields returned when using the `fields` query
    parameter.
    """
    
    created_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    description: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    item_status: FileItemStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item_status') }})
    modified_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    modified_by: FileUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_by') }})
    owned_by: FileUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('owned_by') }})
    path_collection: FilePathCollection = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('path_collection') }})
    sequence_id: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    sha1: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('sha1') }})
    size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('size') }})
    type: FileTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    content_created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    content_modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    file_version: Optional[shared_fileversion_mini.FileVersionMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('file_version') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    parent: Optional[FileFolderBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    purged_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('purged_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    shared_link: Optional[FileSharedLink] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    trashed_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('trashed_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    
