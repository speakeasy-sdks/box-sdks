import dataclasses
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import fileversion_mini as shared_fileversion_mini

class FileConflictTypeEnum(str, Enum):
    FILE = "file"


@dataclass_json
@dataclasses.dataclass
class FileConflict:
    r"""FileConflict
    The bare basic representation of a file, the minimal
    amount of fields returned when using the `fields` query
    parameter.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    sequence_id: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    sha1: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('sha1') }})
    type: FileConflictTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    file_version: Optional[shared_fileversion_mini.FileVersionMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('file_version') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    
