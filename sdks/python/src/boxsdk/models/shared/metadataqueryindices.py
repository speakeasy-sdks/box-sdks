import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import metadataqueryindex as shared_metadataqueryindex


@dataclass_json
@dataclasses.dataclass
class MetadataQueryIndices:
    r"""MetadataQueryIndices
    A collection of metadata query indices.
    """
    
    entries: Optional[list[shared_metadataqueryindex.MetadataQueryIndex]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    next_marker: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next_marker') }})
    
