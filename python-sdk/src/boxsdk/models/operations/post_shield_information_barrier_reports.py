import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import shieldinformationbarrierreference as shared_shieldinformationbarrierreference
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarrierreport as shared_shieldinformationbarrierreport


@dataclasses.dataclass
class PostShieldInformationBarrierReportsRequest:
    request: Optional[shared_shieldinformationbarrierreference.ShieldInformationBarrierReference] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostShieldInformationBarrierReportsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier_report: Optional[shared_shieldinformationbarrierreport.ShieldInformationBarrierReport] = dataclasses.field(default=None)
    
