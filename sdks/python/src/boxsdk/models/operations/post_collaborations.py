import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import collaboration as shared_collaboration


@dataclasses.dataclass
class PostCollaborationsQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    notify: Optional[bool] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'notify', 'style': 'form', 'explode': True }})
    
class PostCollaborationsRequestBodyAccessibleByTypeEnum(str, Enum):
    USER = "user"
    GROUP = "group"


@dataclass_json
@dataclasses.dataclass
class PostCollaborationsRequestBodyAccessibleBy:
    r"""PostCollaborationsRequestBodyAccessibleBy
    The user or group to give access to the item.
    """
    
    type: PostCollaborationsRequestBodyAccessibleByTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    login: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('login') }})
    
class PostCollaborationsRequestBodyItemTypeEnum(str, Enum):
    FILE = "file"
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class PostCollaborationsRequestBodyItem:
    r"""PostCollaborationsRequestBodyItem
    The item to attach the comment to.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostCollaborationsRequestBodyItemTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostCollaborationsRequestBodyRoleEnum(str, Enum):
    EDITOR = "editor"
    VIEWER = "viewer"
    PREVIEWER = "previewer"
    UPLOADER = "uploader"
    PREVIEWER_UPLOADER = "previewer uploader"
    VIEWER_UPLOADER = "viewer uploader"
    CO_OWNER = "co-owner"


@dataclass_json
@dataclasses.dataclass
class PostCollaborationsRequestBody:
    accessible_by: PostCollaborationsRequestBodyAccessibleBy = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('accessible_by') }})
    item: PostCollaborationsRequestBodyItem = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item') }})
    role: PostCollaborationsRequestBodyRoleEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('role') }})
    can_view_path: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_view_path') }})
    expires_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('expires_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    

@dataclasses.dataclass
class PostCollaborationsRequest:
    query_params: PostCollaborationsQueryParams = dataclasses.field()
    request: Optional[PostCollaborationsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostCollaborationsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaboration: Optional[shared_collaboration.Collaboration] = dataclasses.field(default=None)
    
