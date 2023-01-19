import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import file as shared_file


@dataclasses.dataclass
class PutFilesIDNumberAddSharedLinkPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFilesIDNumberAddSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    
class PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"


@dataclass_json
@dataclasses.dataclass
class PutFilesIDNumberAddSharedLinkRequestBodySharedLinkPermissions:
    can_download: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_download') }})
    can_edit: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_edit') }})
    can_preview: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_preview') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFilesIDNumberAddSharedLinkRequestBodySharedLink:
    r"""PutFilesIDNumberAddSharedLinkRequestBodySharedLink
    The settings for the shared link to create on the file.
    Use an empty object (`{}`) to use the default settings for shared
    links.
    """
    
    access: Optional[PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    password: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('password') }})
    permissions: Optional[PutFilesIDNumberAddSharedLinkRequestBodySharedLinkPermissions] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('permissions') }})
    unshared_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('unshared_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    vanity_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_name') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFilesIDNumberAddSharedLinkRequestBody:
    shared_link: Optional[PutFilesIDNumberAddSharedLinkRequestBodySharedLink] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    

@dataclasses.dataclass
class PutFilesIDNumberAddSharedLinkRequest:
    path_params: PutFilesIDNumberAddSharedLinkPathParams = dataclasses.field()
    query_params: PutFilesIDNumberAddSharedLinkQueryParams = dataclasses.field()
    request: Optional[PutFilesIDNumberAddSharedLinkRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFilesIDNumberAddSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file: Optional[shared_file.File] = dataclasses.field(default=None)
    
