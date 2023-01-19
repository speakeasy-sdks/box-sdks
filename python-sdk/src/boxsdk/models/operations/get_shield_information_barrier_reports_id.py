import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarrierreport as shared_shieldinformationbarrierreport


@dataclasses.dataclass
class GetShieldInformationBarrierReportsIDPathParams:
    shield_information_barrier_report_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'shield_information_barrier_report_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetShieldInformationBarrierReportsIDRequest:
    path_params: GetShieldInformationBarrierReportsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetShieldInformationBarrierReportsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier_report: Optional[shared_shieldinformationbarrierreport.ShieldInformationBarrierReport] = dataclasses.field(default=None)
    
