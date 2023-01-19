import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import devicepinner as shared_devicepinner


@dataclasses.dataclass
class GetDevicePinnersIDPathParams:
    device_pinner_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'device_pinner_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetDevicePinnersIDRequest:
    path_params: GetDevicePinnersIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetDevicePinnersIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    device_pinner: Optional[shared_devicepinner.DevicePinner] = dataclasses.field(default=None)
    
