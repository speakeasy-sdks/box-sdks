import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils


@dataclass_json
@dataclasses.dataclass
class Metadata:
    r"""Metadata
    The base representation of a metadata instance.
    """
    
    dollar_parent: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$parent') }})
    dollar_scope: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$scope') }})
    dollar_template: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$template') }})
    dollar_version: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('$version') }})
    
