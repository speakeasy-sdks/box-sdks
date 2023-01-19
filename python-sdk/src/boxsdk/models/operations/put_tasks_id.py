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


@dataclasses.dataclass
class PutTasksIDPathParams:
    task_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'task_id', 'style': 'simple', 'explode': False }})
    
class PutTasksIDRequestBodyActionEnum(str, Enum):
    REVIEW = "review"
    COMPLETE = "complete"

class PutTasksIDRequestBodyCompletionRuleEnum(str, Enum):
    ALL_ASSIGNEES = "all_assignees"
    ANY_ASSIGNEE = "any_assignee"


@dataclass_json
@dataclasses.dataclass
class PutTasksIDRequestBody:
    action: Optional[PutTasksIDRequestBodyActionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('action') }})
    completion_rule: Optional[PutTasksIDRequestBodyCompletionRuleEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('completion_rule') }})
    due_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('due_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    

@dataclasses.dataclass
class PutTasksIDRequest:
    path_params: PutTasksIDPathParams = dataclasses.field()
    request: Optional[PutTasksIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutTasksIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    task: Optional[shared_task.Task] = dataclasses.field(default=None)
    
