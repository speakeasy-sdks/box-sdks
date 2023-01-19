import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import comment as shared_comment


@dataclasses.dataclass
class PostCommentsQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    
class PostCommentsRequestBodyItemTypeEnum(str, Enum):
    FILE = "file"
    COMMENT = "comment"


@dataclass_json
@dataclasses.dataclass
class PostCommentsRequestBodyItem:
    r"""PostCommentsRequestBodyItem
    The item to attach the comment to.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: PostCommentsRequestBodyItemTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PostCommentsRequestBody:
    message: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    item: Optional[PostCommentsRequestBodyItem] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('item') }})
    tagged_message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('tagged_message') }})
    

@dataclasses.dataclass
class PostCommentsRequest:
    query_params: PostCommentsQueryParams = dataclasses.field()
    request: Optional[PostCommentsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostCommentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    comment: Optional[shared_comment.Comment] = dataclasses.field(default=None)
    
