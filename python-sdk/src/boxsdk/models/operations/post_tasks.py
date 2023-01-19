import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import task as shared_task

class PostTasksRequestBodyActionEnum(str, Enum):
    REVIEW = "review"
    COMPLETE = "complete"

class PostTasksRequestBodyCompletionRuleEnum(str, Enum):
    ALL_ASSIGNEES = "all_assignees"
    ANY_ASSIGNEE = "any_assignee"

class PostTasksRequestBodyItemTypeEnum(str, Enum):
    FILE = "file"


@dataclass_json
@dataclasses.dataclass
class PostTasksRequestBodyItem:
    r"""PostTasksRequestBodyItem
    The file to attach the task to.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostTasksRequestBodyItemTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PostTasksRequestBody:
    item: PostTasksRequestBodyItem = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item') }})
    action: Optional[PostTasksRequestBodyActionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('action') }})
    completion_rule: Optional[PostTasksRequestBodyCompletionRuleEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('completion_rule') }})
    due_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('due_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    

@dataclasses.dataclass
class PostTasksRequest:
    request: Optional[PostTasksRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostTasksResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    task: Optional[shared_task.Task] = dataclasses.field(default=None)
    
