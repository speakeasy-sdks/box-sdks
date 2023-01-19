import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import file_mini as shared_file_mini


@dataclass_json
@dataclasses.dataclass
class FilesUnderRetention:
    r"""FilesUnderRetention
    The part of an API response that describes marker
    based pagination
    """
    
    entries: Optional[list[shared_file_mini.FileMini]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    next_marker: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next_marker') }})
    prev_marker: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('prev_marker') }})
    
