import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import file as shared_file
from ..shared import folder as shared_folder
from ..shared import weblink as shared_weblink

class RecentItemInteractionTypeEnum(str, Enum):
    ITEM_PREVIEW = "item_preview"
    ITEM_UPLOAD = "item_upload"
    ITEM_COMMENT = "item_comment"
    ITEM_OPEN = "item_open"
    ITEM_MODIFY = "item_modify"


@dataclass_json
@dataclasses.dataclass
class RecentItem:
    r"""RecentItem
    A recent item accessed by a user.
    """
    
    interacted_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('interacted_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    interaction_shared_link: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('interaction_shared_link') }})
    interaction_type: Optional[RecentItemInteractionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('interaction_type') }})
    item: Optional[Any] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('item') }})
    type: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
