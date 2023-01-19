import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import termsofserviceuserstatus as shared_termsofserviceuserstatus


@dataclass_json
@dataclasses.dataclass
class TermsOfServiceUserStatuses:
    r"""TermsOfServiceUserStatuses
    A list of terms of service user statuses
    """
    
    entries: Optional[list[shared_termsofserviceuserstatus.TermsOfServiceUserStatus]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    total_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
