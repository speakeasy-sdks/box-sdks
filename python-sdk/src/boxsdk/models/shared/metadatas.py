import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import metadata as shared_metadata


@dataclass_json
@dataclasses.dataclass
class Metadatas:
    r"""Metadatas
    A list of metadata instances that have been applied to a file or folder.
    """
    
    entries: Optional[list[shared_metadata.Metadata]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    
