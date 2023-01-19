import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class TermsOfServiceBaseTypeEnum(str, Enum):
    TERMS_OF_SERVICE = "terms_of_service"


@dataclass_json
@dataclasses.dataclass
class TermsOfServiceBase:
    r"""TermsOfServiceBase
    The root-level record that is supposed to represent a
    single Terms of Service.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[TermsOfServiceBaseTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
