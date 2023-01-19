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

class WebLinkItemStatusEnum(str, Enum):
    ACTIVE = "active"
    TRASHED = "trashed"
    DELETED = "deleted"


@dataclass_json
@dataclasses.dataclass
class WebLinkPathCollection:
    r"""WebLinkPathCollection
    The tree of folders that this web link is contained in,
    starting at the root.
    """
    
    entries: list[shared_folder_mini.FolderMini] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    total_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
class WebLinkSharedLinkAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"

class WebLinkSharedLinkEffectiveAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"

class WebLinkSharedLinkEffectivePermissionEnum(str, Enum):
    CAN_EDIT = "can_edit"
    CAN_DOWNLOAD = "can_download"
    CAN_PREVIEW = "can_preview"
    NO_ACCESS = "no_access"


@dataclass_json
@dataclasses.dataclass
class WebLinkSharedLinkPermissions:
    r"""WebLinkSharedLinkPermissions
    Defines if this link allows a user to preview, edit, and download an item.
    These permissions refer to the shared link only and
    do not supersede permissions applied to the item itself.
    """
    
    can_download: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_download') }})
    can_edit: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_edit') }})
    can_preview: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_preview') }})
    

@dataclass_json
@dataclasses.dataclass
class WebLinkSharedLink:
    r"""WebLinkSharedLink
    The shared link object for this item. Will be
    `null` if no shared link has been created.
    """
    
    download_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('download_count') }})
    effective_access: WebLinkSharedLinkEffectiveAccessEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('effective_access') }})
    effective_permission: WebLinkSharedLinkEffectivePermissionEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('effective_permission') }})
    is_password_enabled: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_password_enabled') }})
    preview_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('preview_count') }})
    url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('url') }})
    access: Optional[WebLinkSharedLinkAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    download_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('download_url') }})
    permissions: Optional[WebLinkSharedLinkPermissions] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('permissions') }})
    unshared_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('unshared_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    vanity_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_name') }})
    vanity_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_url') }})
    
class WebLinkTypeEnum(str, Enum):
    WEB_LINK = "web_link"


@dataclass_json
@dataclasses.dataclass
class WebLink:
    r"""WebLink
    Web links are objects that point to URLs. These objects
    are also known as bookmarks within the Box web application.
    
    Web link objects are treated similarly to file objects,
    they will also support most actions that apply to regular files.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: WebLinkTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    item_status: Optional[WebLinkItemStatusEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('item_status') }})
    modified_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    modified_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('modified_by') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    owned_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('owned_by') }})
    parent: Optional[shared_folder_mini.FolderMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    path_collection: Optional[WebLinkPathCollection] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('path_collection') }})
    purged_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('purged_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    sequence_id: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    shared_link: Optional[WebLinkSharedLink] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    trashed_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('trashed_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('url') }})
    
