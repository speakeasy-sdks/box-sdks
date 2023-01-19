import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class MetadataQueryIndexFieldsSortDirectionEnum(str, Enum):
    ASC = "asc"
    DESC = "desc"


@dataclass_json
@dataclasses.dataclass
class MetadataQueryIndexFields:
    r"""MetadataQueryIndexFields
    The field which makes up the index.
    """
    
    key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    sort_direction: Optional[MetadataQueryIndexFieldsSortDirectionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sort_direction') }})
    
class MetadataQueryIndexStatusEnum(str, Enum):
    BUILDING = "building"
    ACTIVE = "active"
    DISABLED = "disabled"


@dataclass_json
@dataclasses.dataclass
class MetadataQueryIndex:
    r"""MetadataQueryIndex
    A metadata query index
    """
    
    status: MetadataQueryIndexStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    type: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    fields: Optional[list[MetadataQueryIndexFields]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('fields') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
