import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class EnterpriseBaseTypeEnum(str, Enum):
    ENTERPRISE = "enterprise"


@dataclass_json
@dataclasses.dataclass
class EnterpriseBase:
    r"""EnterpriseBase
    A mini representation of a enterprise, used when
    nested within another resource.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[EnterpriseBaseTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
