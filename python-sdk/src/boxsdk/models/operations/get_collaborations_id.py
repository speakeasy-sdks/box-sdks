import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import collaboration as shared_collaboration


@dataclasses.dataclass
class GetCollaborationsIDPathParams:
    collaboration_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'collaboration_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetCollaborationsIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetCollaborationsIDRequest:
    path_params: GetCollaborationsIDPathParams = dataclasses.field()
    query_params: GetCollaborationsIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetCollaborationsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    collaboration: Optional[shared_collaboration.Collaboration] = dataclasses.field(default=None)
    
