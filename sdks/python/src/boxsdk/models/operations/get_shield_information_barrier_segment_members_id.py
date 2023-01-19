import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarriersegmentmember as shared_shieldinformationbarriersegmentmember


@dataclasses.dataclass
class GetShieldInformationBarrierSegmentMembersIDPathParams:
    shield_information_barrier_segment_member_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'shield_information_barrier_segment_member_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetShieldInformationBarrierSegmentMembersIDRequest:
    path_params: GetShieldInformationBarrierSegmentMembersIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetShieldInformationBarrierSegmentMembersIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier_segment_member: Optional[shared_shieldinformationbarriersegmentmember.ShieldInformationBarrierSegmentMember] = dataclasses.field(default=None)
    
