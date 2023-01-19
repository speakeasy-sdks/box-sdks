import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils


@dataclass_json
@dataclasses.dataclass
class OAuth2Error:
    r"""OAuth2Error
    An OAuth 2.0 error
    """
    
    error: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('error') }})
    error_description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('error_description') }})
    
