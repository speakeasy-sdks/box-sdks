import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteShieldInformationBarrierSegmentsIDPathParams:
    shield_information_barrier_segment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'shield_information_barrier_segment_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteShieldInformationBarrierSegmentsIDRequest:
    path_params: DeleteShieldInformationBarrierSegmentsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteShieldInformationBarrierSegmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
