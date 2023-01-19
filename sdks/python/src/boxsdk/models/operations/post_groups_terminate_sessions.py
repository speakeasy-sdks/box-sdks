import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import sessionterminationmessage as shared_sessionterminationmessage


@dataclass_json
@dataclasses.dataclass
class PostGroupsTerminateSessionsRequestBody:
    group_ids: list[str] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('group_ids') }})
    

@dataclasses.dataclass
class PostGroupsTerminateSessionsRequest:
    request: Optional[PostGroupsTerminateSessionsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostGroupsTerminateSessionsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    session_termination_message: Optional[shared_sessionterminationmessage.SessionTerminationMessage] = dataclasses.field(default=None)
    
