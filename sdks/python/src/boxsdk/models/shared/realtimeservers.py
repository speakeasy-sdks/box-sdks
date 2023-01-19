import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import realtimeserver as shared_realtimeserver


@dataclass_json
@dataclasses.dataclass
class RealtimeServers:
    r"""RealtimeServers
    A list of real-time servers that can
    be used for long-polling.
    """
    
    chunk_size: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('chunk_size') }})
    entries: Optional[list[shared_realtimeserver.RealtimeServer]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    
