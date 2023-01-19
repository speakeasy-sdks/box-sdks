import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import folder as shared_folder


@dataclasses.dataclass
class PostFoldersQueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    
class PostFoldersRequestBodyFolderUploadEmailAccessEnum(str, Enum):
    OPEN = "open"
    COLLABORATORS = "collaborators"


@dataclass_json
@dataclasses.dataclass
class PostFoldersRequestBodyFolderUploadEmail:
    r"""PostFoldersRequestBodyFolderUploadEmail
    The Write Folder Upload Email object
    """
    
    access: Optional[PostFoldersRequestBodyFolderUploadEmailAccessEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('access') }})
    

@dataclass_json
@dataclasses.dataclass
class PostFoldersRequestBodyParent:
    r"""PostFoldersRequestBodyParent
    The parent folder to create the new folder within.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class PostFoldersRequestBodySyncStateEnum(str, Enum):
    SYNCED = "synced"
    NOT_SYNCED = "not_synced"
    PARTIALLY_SYNCED = "partially_synced"


@dataclass_json
@dataclasses.dataclass
class PostFoldersRequestBody:
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    parent: PostFoldersRequestBodyParent = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    folder_upload_email: Optional[PostFoldersRequestBodyFolderUploadEmail] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder_upload_email') }})
    sync_state: Optional[PostFoldersRequestBodySyncStateEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sync_state') }})
    

@dataclasses.dataclass
class PostFoldersRequest:
    query_params: PostFoldersQueryParams = dataclasses.field()
    request: Optional[PostFoldersRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFoldersResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    folder: Optional[shared_folder.Folder] = dataclasses.field(default=None)
    
