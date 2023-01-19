import dataclasses
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class FolderMiniTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class FolderMini:
    r"""FolderMini
    The bare basic representation of a folder, the minimal
    amount of fields returned when using the `fields` query
    parameter.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: FolderMiniTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    sequence_id: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    
