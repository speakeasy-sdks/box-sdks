import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_base as shared_user_base
from ..shared import shieldinformationbarrier_base as shared_shieldinformationbarrier_base

class ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER_SEGMENT = "shield_information_barrier_segment"


@dataclass_json
@dataclasses.dataclass
class ShieldInformationBarrierSegmentRestrictionRestrictedSegment:
    r"""ShieldInformationBarrierSegmentRestrictionRestrictedSegment
    The `type` and `id` of the
    restricted shield information barrier segment.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[ShieldInformationBarrierSegmentRestrictionRestrictedSegmentTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER_SEGMENT = "shield_information_barrier_segment"


@dataclass_json
@dataclasses.dataclass
class ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment:
    r"""ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment
    The `type` and `id` of the
    requested shield information barrier segment.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegmentTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class ShieldInformationBarrierSegmentRestrictionTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER_SEGMENT_RESTRICTION = "shield_information_barrier_segment_restriction"


@dataclass_json
@dataclasses.dataclass
class ShieldInformationBarrierSegmentRestriction:
    r"""ShieldInformationBarrierSegmentRestriction
    A base representation of
    a segment restriction object for
    the shield information barrier
    """
    
    restricted_segment: ShieldInformationBarrierSegmentRestrictionRestrictedSegment = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('restricted_segment') }})
    shield_information_barrier_segment: ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('shield_information_barrier_segment') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_base.UserBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    shield_information_barrier: Optional[shared_shieldinformationbarrier_base.ShieldInformationBarrierBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shield_information_barrier') }})
    type: Optional[ShieldInformationBarrierSegmentRestrictionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    updated_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('updated_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    updated_by: Optional[shared_user_base.UserBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('updated_by') }})
    
