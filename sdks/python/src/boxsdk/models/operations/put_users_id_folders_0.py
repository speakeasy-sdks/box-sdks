import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import folder as shared_folder


@dataclasses.dataclass
class PutUsersIDFolders0PathParams:
    user_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'user_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutUsersIDFolders0QueryParams:
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'fields', 'style': 'form', 'explode': False }})
    notify: Optional[bool] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'notify', 'style': 'form', 'explode': True }})
    

@dataclass_json
@dataclasses.dataclass
class PutUsersIDFolders0RequestBodyOwnedBy:
    r"""PutUsersIDFolders0RequestBodyOwnedBy
    The user who the folder will be transferred to
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    

@dataclass_json
@dataclasses.dataclass
class PutUsersIDFolders0RequestBody:
    owned_by: PutUsersIDFolders0RequestBodyOwnedBy = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('owned_by') }})
    

@dataclasses.dataclass
class PutUsersIDFolders0Request:
    path_params: PutUsersIDFolders0PathParams = dataclasses.field()
    query_params: PutUsersIDFolders0QueryParams = dataclasses.field()
    request: Optional[PutUsersIDFolders0RequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutUsersIDFolders0Response:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    folder: Optional[shared_folder.Folder] = dataclasses.field(default=None)
    
