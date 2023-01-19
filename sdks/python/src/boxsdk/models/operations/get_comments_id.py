import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import comment as shared_comment


@dataclasses.dataclass
class GetCommentsIDPathParams:
    comment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'comment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetCommentsIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetCommentsIDRequest:
    path_params: GetCommentsIDPathParams = dataclasses.field()
    query_params: GetCommentsIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetCommentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    comment: Optional[shared_comment.Comment] = dataclasses.field(default=None)
    
