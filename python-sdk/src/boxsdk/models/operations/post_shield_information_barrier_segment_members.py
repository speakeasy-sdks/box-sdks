import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import shieldinformationbarrier_base as shared_shieldinformationbarrier_base
from ..shared import user_base as shared_user_base
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarriersegmentmember as shared_shieldinformationbarriersegmentmember

class PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER_SEGMENT = "shield_information_barrier_segment"


@dataclass_json
@dataclasses.dataclass
class PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment:
    r"""PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment
    The `type` and `id` of the
    requested shield information barrier segment.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER_SEGMENT_MEMBER = "shield_information_barrier_segment_member"


@dataclass_json
@dataclasses.dataclass
class PostShieldInformationBarrierSegmentMembersRequestBody:
    shield_information_barrier_segment: PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('shield_information_barrier_segment') }})
    user: shared_user_base.UserBase = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('user') }})
    shield_information_barrier: Optional[shared_shieldinformationbarrier_base.ShieldInformationBarrierBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shield_information_barrier') }})
    type: Optional[PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclasses.dataclass
class PostShieldInformationBarrierSegmentMembersRequest:
    request: Optional[PostShieldInformationBarrierSegmentMembersRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostShieldInformationBarrierSegmentMembersResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier_segment_member: Optional[shared_shieldinformationbarriersegmentmember.ShieldInformationBarrierSegmentMember] = dataclasses.field(default=None)
    
