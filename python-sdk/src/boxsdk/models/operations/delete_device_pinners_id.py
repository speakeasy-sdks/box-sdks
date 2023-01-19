import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteDevicePinnersIDPathParams:
    device_pinner_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'device_pinner_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteDevicePinnersIDRequest:
    path_params: DeleteDevicePinnersIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteDevicePinnersIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
