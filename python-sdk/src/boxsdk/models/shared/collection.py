import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class CollectionCollectionTypeEnum(str, Enum):
    FAVORITES = "favorites"

class CollectionNameEnum(str, Enum):
    FAVORITES = "Favorites"

class CollectionTypeEnum(str, Enum):
    COLLECTION = "collection"


@dataclass_json
@dataclasses.dataclass
class Collection:
    r"""Collection
    A collection of items, including files and folders.
    
    Currently, the only collection available
    is the `favorites` collection.
    
    The contents of a collection can be explored in a
    similar way to which the contents of a folder is
    explored.
    """
    
    collection_type: Optional[CollectionCollectionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('collection_type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: Optional[CollectionNameEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[CollectionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
