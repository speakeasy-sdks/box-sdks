import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import file_mini as shared_file_mini
from ..shared import folder_mini as shared_folder_mini
from ..shared import weblink_mini as shared_weblink_mini

class FolderUserBaseTypeEnum(str, Enum):
    USER = "user"


@dataclass_json
@dataclasses.dataclass
class FolderUserBase:
    r"""FolderUserBase
    The user who created this folder
    """
    
    login: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('login') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: FolderUserBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class FolderFolderUploadEmailAccessEnum(str, Enum):
    OPEN = "open"
    COLLABORATORS = "collaborators"


@dataclass_json
@dataclasses.dataclass
class FolderFolderUploadEmail:
    access: Optional[FolderFolderUploadEmailAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    email: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('email') }})
    
class FolderItemsOrderDirectionEnum(str, Enum):
    ASC = "ASC"
    DESC = "DESC"


@dataclass_json
@dataclasses.dataclass
class FolderItemsOrder:
    r"""FolderItemsOrder
    The order in which a pagination is ordered
    """
    
    by: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('by') }})
    direction: Optional[FolderItemsOrderDirectionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('direction') }})
    

@dataclass_json
@dataclasses.dataclass
class FolderItems:
    r"""FolderItems
    A page of the items that are in the folder.
    
    This field can only be requested when querying a folder's
    information, not when querying a folder's items.
    """
    
    entries: Optional[list[Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('offset') }})
    order: Optional[list[FolderItemsOrder]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('order') }})
    total_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
class FolderItemStatusEnum(str, Enum):
    ACTIVE = "active"
    TRASHED = "trashed"
    DELETED = "deleted"

class FolderFolderBaseTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class FolderFolderBase:
    r"""FolderFolderBase
    The optional folder that this folder is located within.
    
    This value may be `null` for some folders such as the
    root folder or the trash folder.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: FolderFolderBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    sequence_id: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    

@dataclass_json
@dataclasses.dataclass
class FolderPathCollection:
    r"""FolderPathCollection
    The tree of folders that this folder is contained in,
    starting at the root.
    """
    
    entries: list[shared_folder_mini.FolderMini] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    total_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
class FolderSharedLinkAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"

class FolderSharedLinkEffectiveAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"

class FolderSharedLinkEffectivePermissionEnum(str, Enum):
    CAN_EDIT = "can_edit"
    CAN_DOWNLOAD = "can_download"
    CAN_PREVIEW = "can_preview"
    NO_ACCESS = "no_access"


@dataclass_json
@dataclasses.dataclass
class FolderSharedLinkPermissions:
    r"""FolderSharedLinkPermissions
    Defines if this link allows a user to preview, edit, and download an item.
    These permissions refer to the shared link only and
    do not supersede permissions applied to the item itself.
    """
    
    can_download: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_download') }})
    can_edit: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_edit') }})
    can_preview: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_preview') }})
    

@dataclass_json
@dataclasses.dataclass
class FolderSharedLink:
    r"""FolderSharedLink
    The shared link for this folder. This will be
    `null` if no shared link has been created for this
    folder.
    """
    
    download_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('download_count') }})
    effective_access: FolderSharedLinkEffectiveAccessEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('effective_access') }})
    effective_permission: FolderSharedLinkEffectivePermissionEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('effective_permission') }})
    is_password_enabled: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_password_enabled') }})
    preview_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('preview_count') }})
    url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('url') }})
    access: Optional[FolderSharedLinkAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    download_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('download_url') }})
    permissions: Optional[FolderSharedLinkPermissions] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('permissions') }})
    unshared_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('unshared_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    vanity_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_name') }})
    vanity_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_url') }})
    
class FolderTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class Folder:
    r"""Folder
    The bare basic representation of a folder, the minimal
    amount of fields returned when using the `fields` query
    parameter.
    """
    
    created_by: FolderUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    item_collection: FolderItems = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item_collection') }})
    item_status: FolderItemStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item_status') }})
    modified_by: FolderUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_by') }})
    owned_by: FolderUserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('owned_by') }})
    path_collection: FolderPathCollection = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('path_collection') }})
    size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('size') }})
    type: FolderTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    content_created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    content_modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('content_modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    description: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    folder_upload_email: Optional[FolderFolderUploadEmail] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder_upload_email') }})
    modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    parent: Optional[FolderFolderBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    purged_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('purged_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    sequence_id: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    shared_link: Optional[FolderSharedLink] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    trashed_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('trashed_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    
