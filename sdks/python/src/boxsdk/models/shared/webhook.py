import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_mini as shared_user_mini

class WebhookTargetTypeEnum(str, Enum):
    FILE = "file"
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class WebhookTarget:
    r"""WebhookTarget
    The item that will trigger the webhook
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[WebhookTargetTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class WebhookWebhookTriggerEnum(str, Enum):
    FILE_UPLOADED = "FILE.UPLOADED"
    FILE_PREVIEWED = "FILE.PREVIEWED"
    FILE_DOWNLOADED = "FILE.DOWNLOADED"
    FILE_TRASHED = "FILE.TRASHED"
    FILE_DELETED = "FILE.DELETED"
    FILE_RESTORED = "FILE.RESTORED"
    FILE_COPIED = "FILE.COPIED"
    FILE_MOVED = "FILE.MOVED"
    FILE_LOCKED = "FILE.LOCKED"
    FILE_UNLOCKED = "FILE.UNLOCKED"
    FILE_RENAMED = "FILE.RENAMED"
    COMMENT_CREATED = "COMMENT.CREATED"
    COMMENT_UPDATED = "COMMENT.UPDATED"
    COMMENT_DELETED = "COMMENT.DELETED"
    TASK_ASSIGNMENT_CREATED = "TASK_ASSIGNMENT.CREATED"
    TASK_ASSIGNMENT_UPDATED = "TASK_ASSIGNMENT.UPDATED"
    METADATA_INSTANCE_CREATED = "METADATA_INSTANCE.CREATED"
    METADATA_INSTANCE_UPDATED = "METADATA_INSTANCE.UPDATED"
    METADATA_INSTANCE_DELETED = "METADATA_INSTANCE.DELETED"
    FOLDER_CREATED = "FOLDER.CREATED"
    FOLDER_RENAMED = "FOLDER.RENAMED"
    FOLDER_DOWNLOADED = "FOLDER.DOWNLOADED"
    FOLDER_RESTORED = "FOLDER.RESTORED"
    FOLDER_DELETED = "FOLDER.DELETED"
    FOLDER_COPIED = "FOLDER.COPIED"
    FOLDER_MOVED = "FOLDER.MOVED"
    FOLDER_TRASHED = "FOLDER.TRASHED"
    WEBHOOK_DELETED = "WEBHOOK.DELETED"
    COLLABORATION_CREATED = "COLLABORATION.CREATED"
    COLLABORATION_ACCEPTED = "COLLABORATION.ACCEPTED"
    COLLABORATION_REJECTED = "COLLABORATION.REJECTED"
    COLLABORATION_REMOVED = "COLLABORATION.REMOVED"
    COLLABORATION_UPDATED = "COLLABORATION.UPDATED"
    SHARED_LINK_DELETED = "SHARED_LINK.DELETED"
    SHARED_LINK_CREATED = "SHARED_LINK.CREATED"
    SHARED_LINK_UPDATED = "SHARED_LINK.UPDATED"
    SIGN_REQUEST_COMPLETED = "SIGN_REQUEST.COMPLETED"
    SIGN_REQUEST_DECLINED = "SIGN_REQUEST.DECLINED"
    SIGN_REQUEST_EXPIRED = "SIGN_REQUEST.EXPIRED"

class WebhookTypeEnum(str, Enum):
    WEBHOOK = "webhook"


@dataclass_json
@dataclasses.dataclass
class Webhook:
    r"""Webhook
    Represents a configured webhook.
    """
    
    address: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('address') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_mini.UserMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    target: Optional[WebhookTarget] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('target') }})
    triggers: Optional[list[WebhookWebhookTriggerEnum]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('triggers') }})
    type: Optional[WebhookTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
