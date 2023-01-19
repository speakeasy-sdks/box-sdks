import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import shieldinformationbarrier_base as shared_shieldinformationbarrier_base
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarriersegmentrestriction as shared_shieldinformationbarriersegmentrestriction

class PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER_SEGMENT = "shield_information_barrier_segment"


@dataclass_json
@dataclasses.dataclass
class PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment:
    r"""PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment
    The `type` and `id` of the restricted
    shield information barrier segment.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER_SEGMENT = "shield_information_barrier_segment"


@dataclass_json
@dataclasses.dataclass
class PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment:
    r"""PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment
    The `type` and `id` of the requested
    shield information barrier segment.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER_SEGMENT_RESTRICTION = "shield_information_barrier_segment_restriction"


@dataclass_json
@dataclasses.dataclass
class PostShieldInformationBarrierSegmentRestrictionsRequestBody:
    restricted_segment: PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('restricted_segment') }})
    shield_information_barrier_segment: PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('shield_information_barrier_segment') }})
    type: PostShieldInformationBarrierSegmentRestrictionsRequestBodyTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    shield_information_barrier: Optional[shared_shieldinformationbarrier_base.ShieldInformationBarrierBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shield_information_barrier') }})
    

@dataclasses.dataclass
class PostShieldInformationBarrierSegmentRestrictionsRequest:
    request: Optional[PostShieldInformationBarrierSegmentRestrictionsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostShieldInformationBarrierSegmentRestrictionsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier_segment_restriction: Optional[shared_shieldinformationbarriersegmentrestriction.ShieldInformationBarrierSegmentRestriction] = dataclasses.field(default=None)
    
