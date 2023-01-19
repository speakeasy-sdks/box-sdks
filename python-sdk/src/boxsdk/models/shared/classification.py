import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class ClassificationDollarTemplateEnum(str, Enum):
    SECURITY_CLASSIFICATION_6_VM_VOCHW_U_WO = "securityClassification-6VMVochwUWo"


@dataclass_json
@dataclasses.dataclass
class Classification:
    r"""Classification
    An instance of the classification metadata template, containing
    the classification applied to the file or folder.
    
    To get more details about the classification applied to an item,
    request the classification metadata template.
    """
    
    dollar_can_edit: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$canEdit') }})
    dollar_parent: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$parent') }})
    dollar_scope: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$scope') }})
    dollar_template: Optional[ClassificationDollarTemplateEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$template') }})
    dollar_type: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$type') }})
    dollar_type_version: Optional[float] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$typeVersion') }})
    dollar_version: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$version') }})
    box_security_classification_key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('Box__Security__Classification__Key') }})
    
