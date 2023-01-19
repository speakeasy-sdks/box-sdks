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
class PutFilesIDNumberUpdateSharedLinkPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutFilesIDNumberUpdateSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    
class PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"


@dataclass_json
@dataclasses.dataclass
class PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkPermissions:
    can_download: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_download') }})
    can_edit: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_edit') }})
    can_preview: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_preview') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFilesIDNumberUpdateSharedLinkRequestBodySharedLink:
    r"""PutFilesIDNumberUpdateSharedLinkRequestBodySharedLink
    The settings for the shared link to update.
    """
    
    access: Optional[PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    password: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('password') }})
    permissions: Optional[PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkPermissions] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('permissions') }})
    unshared_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('unshared_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    vanity_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_name') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFilesIDNumberUpdateSharedLinkRequestBody:
    shared_link: Optional[PutFilesIDNumberUpdateSharedLinkRequestBodySharedLink] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    

@dataclasses.dataclass
class PutFilesIDNumberUpdateSharedLinkRequest:
    path_params: PutFilesIDNumberUpdateSharedLinkPathParams = dataclasses.field()
    query_params: PutFilesIDNumberUpdateSharedLinkQueryParams = dataclasses.field()
    request: Optional[PutFilesIDNumberUpdateSharedLinkRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFilesIDNumberUpdateSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file: Optional[shared_file.File] = dataclasses.field(default=None)
    
