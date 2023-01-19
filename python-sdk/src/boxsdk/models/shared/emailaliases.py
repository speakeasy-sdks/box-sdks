import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import emailalias as shared_emailalias


@dataclass_json
@dataclasses.dataclass
class EmailAliases:
    r"""EmailAliases
    A list of email aliases
    """
    
    entries: Optional[list[shared_emailalias.EmailAlias]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    total_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_count') }})
    
