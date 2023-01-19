import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarriersegment as shared_shieldinformationbarriersegment


@dataclasses.dataclass
class GetShieldInformationBarrierSegmentsIDPathParams:
    shield_information_barrier_segment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'shield_information_barrier_segment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetShieldInformationBarrierSegmentsIDRequest:
    path_params: GetShieldInformationBarrierSegmentsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetShieldInformationBarrierSegmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier_segment: Optional[shared_shieldinformationbarriersegment.ShieldInformationBarrierSegment] = dataclasses.field(default=None)
    
