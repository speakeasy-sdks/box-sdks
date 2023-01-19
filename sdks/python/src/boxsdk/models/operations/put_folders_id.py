import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import folder as shared_folder


@dataclasses.dataclass
class PutFoldersIDPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFoldersIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class PutFoldersIDHeaders:
    if_match: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'if-match', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PutFoldersIDRequestBodyReference:
    r"""PutFoldersIDRequestBodyReference
    The bare basic reference for an object
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PutFoldersIDRequestBodyFolderUploadEmailAccessEnum(str, Enum):
    OPEN = "open"
    COLLABORATORS = "collaborators"


@dataclass_json
@dataclasses.dataclass
class PutFoldersIDRequestBodyFolderUploadEmail:
    r"""PutFoldersIDRequestBodyFolderUploadEmail
    The Write Folder Upload Email object
    """
    
    access: Optional[PutFoldersIDRequestBodyFolderUploadEmailAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFoldersIDRequestBodyParent:
    r"""PutFoldersIDRequestBodyParent
    The parent folder for this folder. Use this to move
    the folder or to restore it out of the trash.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class PutFoldersIDRequestBodySharedLinkAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"


@dataclass_json
@dataclasses.dataclass
class PutFoldersIDRequestBodySharedLinkPermissions:
    can_download: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_download') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFoldersIDRequestBodySharedLink:
    r"""PutFoldersIDRequestBodySharedLink
    Defines a shared link for an item. Set this to `null` to remove
    the shared link.
    """
    
    access: Optional[PutFoldersIDRequestBodySharedLinkAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    password: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('password') }})
    permissions: Optional[PutFoldersIDRequestBodySharedLinkPermissions] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('permissions') }})
    unshared_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('unshared_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    vanity_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_name') }})
    
class PutFoldersIDRequestBodySyncStateEnum(str, Enum):
    SYNCED = "synced"
    NOT_SYNCED = "not_synced"
    PARTIALLY_SYNCED = "partially_synced"


@dataclass_json
@dataclasses.dataclass
class PutFoldersIDRequestBody:
    can_non_owners_invite: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_non_owners_invite') }})
    can_non_owners_view_collaborators: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_non_owners_view_collaborators') }})
    collections: Optional[list[PutFoldersIDRequestBodyReference]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('collections') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    folder_upload_email: Optional[PutFoldersIDRequestBodyFolderUploadEmail] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder_upload_email') }})
    is_collaboration_restricted_to_enterprise: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_collaboration_restricted_to_enterprise') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    parent: Optional[PutFoldersIDRequestBodyParent] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    shared_link: Optional[PutFoldersIDRequestBodySharedLink] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    sync_state: Optional[PutFoldersIDRequestBodySyncStateEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sync_state') }})
    tags: Optional[list[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('tags') }})
    

@dataclasses.dataclass
class PutFoldersIDRequest:
    headers: PutFoldersIDHeaders = dataclasses.field()
    path_params: PutFoldersIDPathParams = dataclasses.field()
    query_params: PutFoldersIDQueryParams = dataclasses.field()
    request: Optional[PutFoldersIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFoldersIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    folder: Optional[shared_folder.Folder] = dataclasses.field(default=None)
    
