import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarriersegmentrestriction as shared_shieldinformationbarriersegmentrestriction


@dataclasses.dataclass
class GetShieldInformationBarrierSegmentRestrictionsIDPathParams:
    shield_information_barrier_segment_restriction_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'shield_information_barrier_segment_restriction_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetShieldInformationBarrierSegmentRestrictionsIDRequest:
    path_params: GetShieldInformationBarrierSegmentRestrictionsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetShieldInformationBarrierSegmentRestrictionsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier_segment_restriction: Optional[shared_shieldinformationbarriersegmentrestriction.ShieldInformationBarrierSegmentRestriction] = dataclasses.field(default=None)
    
