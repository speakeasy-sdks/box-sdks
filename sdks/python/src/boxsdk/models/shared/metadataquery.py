import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class MetadataQueryOrderByDirectionEnum(str, Enum):
    ASC_UPPER = "ASC"
    DESC_UPPER = "DESC"
    ASC_LOWER = "asc"
    DESC_LOWER = "desc"


@dataclass_json
@dataclasses.dataclass
class MetadataQueryOrderBy:
    r"""MetadataQueryOrderBy
    An object representing one of the metadata template fields to sort the
    metadata query results by.
    """
    
    direction: Optional[MetadataQueryOrderByDirectionEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('direction') }})
    field_key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('field_key') }})
    

@dataclass_json
@dataclasses.dataclass
class MetadataQuery:
    r"""MetadataQuery
    Create a search using SQL-like syntax to return items that match specific
    metadata.
    """
    
    ancestor_folder_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('ancestor_folder_id') }})
    from_: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('from') }})
    fields: Optional[list[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('fields') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('marker') }})
    order_by: Optional[list[MetadataQueryOrderBy]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('order_by') }})
    query: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('query') }})
    query_params: Optional[dict[str, str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('query_params') }})
    
