import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import trashfolderrestored as shared_trashfolderrestored


@dataclasses.dataclass
class PostFoldersIDPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PostFoldersIDQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PostFoldersIDRequestBodyParent:
    r"""PostFoldersIDRequestBodyParent
    The parent for this item
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    

@dataclass_json
@dataclasses.dataclass
class PostFoldersIDRequestBody:
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    parent: Optional[PostFoldersIDRequestBodyParent] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    

@dataclasses.dataclass
class PostFoldersIDRequest:
    path_params: PostFoldersIDPathParams = dataclasses.field()
    query_params: PostFoldersIDQueryParams = dataclasses.field()
    request: Optional[PostFoldersIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFoldersIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    trash_folder_restored: Optional[shared_trashfolderrestored.TrashFolderRestored] = dataclasses.field(default=None)
    
