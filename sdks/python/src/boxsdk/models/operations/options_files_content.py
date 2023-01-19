import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import conflicterror as shared_conflicterror
from ..shared import uploadurl as shared_uploadurl


@dataclass_json
@dataclasses.dataclass
class OptionsFilesContentRequestBodyParent:
    r"""OptionsFilesContentRequestBodyParent
    The parent for this item
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    

@dataclass_json
@dataclasses.dataclass
class OptionsFilesContentRequestBody:
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    parent: Optional[OptionsFilesContentRequestBodyParent] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    size: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('size') }})
    

@dataclasses.dataclass
class OptionsFilesContentRequest:
    request: Optional[OptionsFilesContentRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class OptionsFilesContentResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    conflict_error: Optional[shared_conflicterror.ConflictError] = dataclasses.field(default=None)
    upload_url: Optional[shared_uploadurl.UploadURL] = dataclasses.field(default=None)
    
