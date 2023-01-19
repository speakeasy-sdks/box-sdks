import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import shieldinformationbarrier_base as shared_shieldinformationbarrier_base


@dataclass_json
@dataclasses.dataclass
class ShieldInformationBarrierReference:
    r"""ShieldInformationBarrierReference
    A shield information barrier reference for requests and responses
    """
    
    shield_information_barrier: Optional[shared_shieldinformationbarrier_base.ShieldInformationBarrierBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shield_information_barrier') }})
    
