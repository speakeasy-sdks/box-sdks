import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class FileVersionMiniTypeEnum(str, Enum):
    FILE_VERSION = "file_version"


@dataclass_json
@dataclasses.dataclass
class FileVersionMini:
    r"""FileVersionMini
    The bare basic representation of a file version, the minimal
    amount of fields returned when using the `fields` query
    parameter.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: FileVersionMiniTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    sha1: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sha1') }})
    
