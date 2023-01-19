import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import weblink as shared_weblink


@dataclasses.dataclass
class PutWebLinksIDNumberAddSharedLinkPathParams:
    web_link_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'web_link_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutWebLinksIDNumberAddSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    
class PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum(str, Enum):
    OPEN = "open"
    COMPANY = "company"
    COLLABORATORS = "collaborators"


@dataclass_json
@dataclasses.dataclass
class PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkPermissions:
    can_download: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_download') }})
    can_edit: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_edit') }})
    can_preview: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_preview') }})
    

@dataclass_json
@dataclasses.dataclass
class PutWebLinksIDNumberAddSharedLinkRequestBodySharedLink:
    r"""PutWebLinksIDNumberAddSharedLinkRequestBodySharedLink
    The settings for the shared link to create on the web link.
    
    Use an empty object (`{}`) to use the default settings for shared
    links.
    """
    
    access: Optional[PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    password: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('password') }})
    permissions: Optional[PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkPermissions] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('permissions') }})
    unshared_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('unshared_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    vanity_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('vanity_name') }})
    

@dataclass_json
@dataclasses.dataclass
class PutWebLinksIDNumberAddSharedLinkRequestBody:
    shared_link: Optional[PutWebLinksIDNumberAddSharedLinkRequestBodySharedLink] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    

@dataclasses.dataclass
class PutWebLinksIDNumberAddSharedLinkRequest:
    path_params: PutWebLinksIDNumberAddSharedLinkPathParams = dataclasses.field()
    query_params: PutWebLinksIDNumberAddSharedLinkQueryParams = dataclasses.field()
    request: Optional[PutWebLinksIDNumberAddSharedLinkRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutWebLinksIDNumberAddSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    web_link: Optional[shared_weblink.WebLink] = dataclasses.field(default=None)
    
