import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import termsofservice as shared_termsofservice


@dataclass_json
@dataclasses.dataclass
class TermsOfServices:
    r"""TermsOfServices
    A list of terms of services
    """
    
    entries: Optional[list[shared_termsofservice.TermsOfService]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    total_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
