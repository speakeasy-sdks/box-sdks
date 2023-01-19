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
class PutFoldersIDNumberAddSharedLinkPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFoldersIDNumberAddSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    
class PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"


@dataclass_json
@dataclasses.dataclass
class PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkPermissions:
    can_download: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_download') }})
    can_edit: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_edit') }})
    can_preview: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_preview') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFoldersIDNumberAddSharedLinkRequestBodySharedLink:
    r"""PutFoldersIDNumberAddSharedLinkRequestBodySharedLink
    The settings for the shared link to create on the folder.
    
    Use an empty object (`{}`) to use the default settings for shared
    links.
    """
    
    access: Optional[PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    password: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('password') }})
    permissions: Optional[PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkPermissions] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('permissions') }})
    unshared_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('unshared_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    vanity_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_name') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFoldersIDNumberAddSharedLinkRequestBody:
    shared_link: Optional[PutFoldersIDNumberAddSharedLinkRequestBodySharedLink] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    

@dataclasses.dataclass
class PutFoldersIDNumberAddSharedLinkRequest:
    path_params: PutFoldersIDNumberAddSharedLinkPathParams = dataclasses.field()
    query_params: PutFoldersIDNumberAddSharedLinkQueryParams = dataclasses.field()
    request: Optional[PutFoldersIDNumberAddSharedLinkRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFoldersIDNumberAddSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    folder: Optional[shared_folder.Folder] = dataclasses.field(default=None)
    
