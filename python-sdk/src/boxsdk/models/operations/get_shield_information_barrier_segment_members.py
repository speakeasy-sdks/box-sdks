import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import shieldinformationbarriersegmentmember as shared_shieldinformationbarriersegmentmember
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class GetShieldInformationBarrierSegmentMembersQueryParams:
    shield_information_barrier_segment_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'shield_information_barrier_segment_id', 'style': 'form', 'explode': True }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclass_json
@dataclasses.dataclass
class GetShieldInformationBarrierSegmentMembers200ApplicationJSON:
    entries: Optional[list[shared_shieldinformationbarriersegmentmember.ShieldInformationBarrierSegmentMember]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    next_marker: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next_marker') }})
    

@dataclasses.dataclass
class GetShieldInformationBarrierSegmentMembersRequest:
    query_params: GetShieldInformationBarrierSegmentMembersQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetShieldInformationBarrierSegmentMembersResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    get_shield_information_barrier_segment_members_200_application_json_object: Optional[GetShieldInformationBarrierSegmentMembers200ApplicationJSON] = dataclasses.field(default=None)
    
