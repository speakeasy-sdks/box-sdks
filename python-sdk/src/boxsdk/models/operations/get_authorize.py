import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils


GET_AUTHORIZE_SERVERS = [
	"https://account.box.com/api/oauth2",
]

class GetAuthorizeResponseTypeEnum(str, Enum):
    CODE = "code"


@dataclasses.dataclass
class GetAuthorizeQueryParams:
    client_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'client_id', 'style': 'form', 'explode': True }})
    response_type: GetAuthorizeResponseTypeEnum = dataclasses.field(metadata={'query_param': { 'field_name': 'response_type', 'style': 'form', 'explode': True }})
    redirect_uri: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'redirect_uri', 'style': 'form', 'explode': True }})
    scope: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'scope', 'style': 'form', 'explode': True }})
    state: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'state', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetAuthorizeRequest:
    query_params: GetAuthorizeQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetAuthorizeResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    get_authorize_200_text_html_html_string: Optional[str] = dataclasses.field(default=None)
    get_authorize_default_text_html_html_string: Optional[str] = dataclasses.field(default=None)
    
