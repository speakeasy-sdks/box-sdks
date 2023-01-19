import dataclasses
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils


@dataclass_json
@dataclasses.dataclass
class EventSourceClassification:
    r"""EventSourceClassification
    The object containing classification information for the item that
    triggered the event. This field will not appear if the item does not
    have a classification set.
    """
    
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    
class EventSourceItemTypeEnum(str, Enum):
    FILE = "file"
    FOLDER = "folder"

class EventSourceUserBaseTypeEnum(str, Enum):
    USER = "user"


@dataclass_json
@dataclasses.dataclass
class EventSourceUserBase:
    r"""EventSourceUserBase
    The user who owns this item.
    """
    
    login: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('login') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: EventSourceUserBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    
class EventSourceFolderBaseTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class EventSourceFolderBase:
    r"""EventSourceFolderBase
    The optional folder that this folder is located within.
    
    This value may be `null` for some folders such as the
    root folder or the trash folder.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: EventSourceFolderBaseTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    etag: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('etag') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    sequence_id: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('sequence_id') }})
    

@dataclass_json
@dataclasses.dataclass
class EventSource:
    r"""EventSource
    The source file or folder that triggered an event in
    the event stream.
    """
    
    item_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item_id') }})
    item_name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item_name') }})
    item_type: EventSourceItemTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('item_type') }})
    classification: Optional[EventSourceClassification] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('classification') }})
    owned_by: Optional[EventSourceUserBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('owned_by') }})
    parent: Optional[EventSourceFolderBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    
