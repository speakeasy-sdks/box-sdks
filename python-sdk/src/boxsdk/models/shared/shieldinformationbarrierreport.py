import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_base as shared_user_base
from ..shared import shieldinformationbarrierreportdetails as shared_shieldinformationbarrierreportdetails
from ..shared import shieldinformationbarrierreference as shared_shieldinformationbarrierreference

class ShieldInformationBarrierReportStatusEnum(str, Enum):
    PENDING = "pending"
    ERROR = "error"
    DONE = "done"
    CANCELLED = "cancelled"

class ShieldInformationBarrierReportTypeEnum(str, Enum):
    SHIELD_INFORMATION_BARRIER_REPORT = "shield_information_barrier_report"


@dataclass_json
@dataclasses.dataclass
class ShieldInformationBarrierReport:
    r"""ShieldInformationBarrierReport
    A base representation of a
    shield information barrier report object
    """
    
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_base.UserBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    details: Optional[shared_shieldinformationbarrierreportdetails.ShieldInformationBarrierReportDetails] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('details') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    shield_information_barrier: Optional[shared_shieldinformationbarrierreference.ShieldInformationBarrierReference] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('shield_information_barrier') }})
    status: Optional[ShieldInformationBarrierReportStatusEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    type: Optional[ShieldInformationBarrierReportTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    updated_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('updated_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    
