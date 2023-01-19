import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils


@dataclass_json
@dataclasses.dataclass
class ShieldInformationBarrierReportDetailsDetails:
    folder_id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder_id') }})
    

@dataclass_json
@dataclasses.dataclass
class ShieldInformationBarrierReportDetails:
    r"""ShieldInformationBarrierReportDetails
    Indicates which folder the report
    file is located and any errors when generating the report.
    """
    
    details: Optional[ShieldInformationBarrierReportDetailsDetails] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('details') }})
    
