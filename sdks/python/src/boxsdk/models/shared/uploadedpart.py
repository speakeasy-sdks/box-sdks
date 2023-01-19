import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import uploadpart as shared_uploadpart


@dataclass_json
@dataclasses.dataclass
class UploadedPart:
    r"""UploadedPart
    A chunk of a file uploaded as part of
    an upload session, as returned by some endpoints.
    """
    
    part: Optional[shared_uploadpart.UploadPart] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('part') }})
    
