import dataclasses
from typing import Any,Optional
from dataclasses_json import dataclass_json
from boxsdk import utils


@dataclass_json
@dataclasses.dataclass
class SkillCardsMetadata:
    r"""SkillCardsMetadata
    The metadata assigned to a using for Box skills.
    """
    
    dollar_can_edit: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$canEdit') }})
    dollar_id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$id') }})
    dollar_parent: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$parent') }})
    dollar_scope: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$scope') }})
    dollar_template: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$template') }})
    dollar_type: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$type') }})
    dollar_type_version: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$typeVersion') }})
    dollar_version: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$version') }})
    cards: Optional[list[Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('cards') }})
    
