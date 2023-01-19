import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import trashweblinkrestored as shared_trashweblinkrestored


@dataclasses.dataclass
class PostWebLinksIDPathParams:
    web_link_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'web_link_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PostWebLinksIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostWebLinksIDRequestBodyParent:
    r"""PostWebLinksIDRequestBodyParent
    The parent for this item
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    

@dataclass_json
@dataclasses.dataclass
class PostWebLinksIDRequestBody:
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    parent: Optional[PostWebLinksIDRequestBodyParent] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    

@dataclasses.dataclass
class PostWebLinksIDRequest:
    path_params: PostWebLinksIDPathParams = dataclasses.field()
    query_params: PostWebLinksIDQueryParams = dataclasses.field()
    request: Optional[PostWebLinksIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostWebLinksIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    trash_web_link_restored: Optional[shared_trashweblinkrestored.TrashWebLinkRestored] = dataclasses.field(default=None)
    
