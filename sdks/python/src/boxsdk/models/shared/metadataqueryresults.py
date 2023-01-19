import dataclasses
from typing import Any,Optional
from dataclasses_json import dataclass_json
from boxsdk import utils


@dataclass_json
@dataclasses.dataclass
class MetadataQueryResults:
    r"""MetadataQueryResults
    A page of files and folders that matched the metadata query.
    """
    
    entries: Optional[list[Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    next_marker: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next_marker') }})
    
