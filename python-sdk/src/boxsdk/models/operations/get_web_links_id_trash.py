import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import trashweblink as shared_trashweblink


@dataclasses.dataclass
class GetWebLinksIDTrashPathParams:
    web_link_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'web_link_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetWebLinksIDTrashQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclasses.dataclass
class GetWebLinksIDTrashRequest:
    path_params: GetWebLinksIDTrashPathParams = dataclasses.field()
    query_params: GetWebLinksIDTrashQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetWebLinksIDTrashResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    trash_web_link: Optional[shared_trashweblink.TrashWebLink] = dataclasses.field(default=None)
    
