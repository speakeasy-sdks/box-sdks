import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import shieldinformationbarrier_base as shared_shieldinformationbarrier_base
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarriersegment as shared_shieldinformationbarriersegment


@dataclass_json
@dataclasses.dataclass
class PostShieldInformationBarrierSegmentsRequestBody:
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    shield_information_barrier: shared_shieldinformationbarrier_base.ShieldInformationBarrierBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('shield_information_barrier') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    

@dataclasses.dataclass
class PostShieldInformationBarrierSegmentsRequest:
    request: Optional[PostShieldInformationBarrierSegmentsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostShieldInformationBarrierSegmentsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier_segment: Optional[shared_shieldinformationbarriersegment.ShieldInformationBarrierSegment] = dataclasses.field(default=None)
    
