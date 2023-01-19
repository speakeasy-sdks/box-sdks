import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import weblink as shared_weblink


@dataclasses.dataclass
class GetWebLinksIDNumberGetSharedLinkPathParams:
    web_link_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'web_link_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetWebLinksIDNumberGetSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetWebLinksIDNumberGetSharedLinkRequest:
    path_params: GetWebLinksIDNumberGetSharedLinkPathParams = dataclasses.field()
    query_params: GetWebLinksIDNumberGetSharedLinkQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetWebLinksIDNumberGetSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    web_link: Optional[shared_weblink.WebLink] = dataclasses.field(default=None)
    
