import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import folderlock as shared_folderlock


@dataclass_json
@dataclasses.dataclass
class PostFolderLocksRequestBodyFolder:
    r"""PostFolderLocksRequestBodyFolder
    The folder to apply the lock to.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PostFolderLocksRequestBodyLockedOperations:
    r"""PostFolderLocksRequestBodyLockedOperations
    The operations to lock for the folder. If `locked_operations` is
    included in the request, both `move` and `delete` must also be
    included and both set to `true`.
    """
    
    delete: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('delete') }})
    move: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('move') }})
    

@dataclass_json
@dataclasses.dataclass
class PostFolderLocksRequestBody:
    folder: PostFolderLocksRequestBodyFolder = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder') }})
    locked_operations: Optional[PostFolderLocksRequestBodyLockedOperations] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('locked_operations') }})
    

@dataclasses.dataclass
class PostFolderLocksRequest:
    request: Optional[PostFolderLocksRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostFolderLocksResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    folder_lock: Optional[shared_folderlock.FolderLock] = dataclasses.field(default=None)
    
