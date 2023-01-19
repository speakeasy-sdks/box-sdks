import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteShieldInformationBarrierSegmentRestrictionsIDPathParams:
    shield_information_barrier_segment_restriction_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'shield_information_barrier_segment_restriction_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteShieldInformationBarrierSegmentRestrictionsIDRequest:
    path_params: DeleteShieldInformationBarrierSegmentRestrictionsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteShieldInformationBarrierSegmentRestrictionsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
