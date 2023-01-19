import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class FileBaseTypeEnum(str, Enum):
    FILE = "file"


@dataclass_json
@dataclasses.dataclass
class FileBase:
    r"""FileBase
    The bare basic representation of a file, the minimal
    amount of fields returned when using the `fields` query
    parameter.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: FileBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    
