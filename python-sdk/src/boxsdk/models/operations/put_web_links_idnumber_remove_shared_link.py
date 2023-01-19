import dataclasses
from typing import Any,Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import weblink as shared_weblink


@dataclasses.dataclass
class PutWebLinksIDNumberRemoveSharedLinkPathParams:
    web_link_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'web_link_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutWebLinksIDNumberRemoveSharedLinkQueryParams:
    fields: str = dataclasses.field(metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': True }})
    

@dataclass_json
@dataclasses.dataclass
class PutWebLinksIDNumberRemoveSharedLinkRequestBody:
    shared_link: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shared_link') }})
    

@dataclasses.dataclass
class PutWebLinksIDNumberRemoveSharedLinkRequest:
    path_params: PutWebLinksIDNumberRemoveSharedLinkPathParams = dataclasses.field()
    query_params: PutWebLinksIDNumberRemoveSharedLinkQueryParams = dataclasses.field()
    request: Optional[PutWebLinksIDNumberRemoveSharedLinkRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutWebLinksIDNumberRemoveSharedLinkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    web_link: Optional[shared_weblink.WebLink] = dataclasses.field(default=None)
    
