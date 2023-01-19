import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import weblink as shared_weblink


@dataclasses.dataclass
class GetWebLinksIDPathParams:
    web_link_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'web_link_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetWebLinksIDHeaders:
    boxapi: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'boxapi', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetWebLinksIDRequest:
    headers: GetWebLinksIDHeaders = dataclasses.field()
    path_params: GetWebLinksIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetWebLinksIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    web_link: Optional[shared_weblink.WebLink] = dataclasses.field(default=None)
    
