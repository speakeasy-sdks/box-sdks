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
class PutCollaborationsIDPathParams:
    collaboration_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'collaboration_id', 'style': 'simple', 'explode': False }})
    
class PutCollaborationsIDRequestBodyRoleEnum(str, Enum):
    EDITOR = "editor"
    VIEWER = "viewer"
    PREVIEWER = "previewer"
    UPLOADER = "uploader"
    PREVIEWER_UPLOADER = "previewer uploader"
    VIEWER_UPLOADER = "viewer uploader"
    CO_OWNER = "co-owner"
    OWNER = "owner"

class PutCollaborationsIDRequestBodyStatusEnum(str, Enum):
    PENDING = "pending"
    ACCEPTED = "accepted"
    REJECTED = "rejected"


@dataclass_json
@dataclasses.dataclass
class PutCollaborationsIDRequestBody:
    role: PutCollaborationsIDRequestBodyRoleEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('role') }})
    can_view_path: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('can_view_path') }})
    expires_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('expires_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    status: Optional[PutCollaborationsIDRequestBodyStatusEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    

@dataclasses.dataclass
class PutCollaborationsIDRequest:
    path_params: PutCollaborationsIDPathParams = dataclasses.field()
    request: Optional[PutCollaborationsIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutCollaborationsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaboration: Optional[shared_collaboration.Collaboration] = dataclasses.field(default=None)
    
