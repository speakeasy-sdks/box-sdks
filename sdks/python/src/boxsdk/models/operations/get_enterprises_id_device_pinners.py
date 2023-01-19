import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import devicepinners as shared_devicepinners


@dataclasses.dataclass
class GetEnterprisesIDDevicePinnersPathParams:
    enterprise_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'enterprise_id', 'style': 'simple', 'explode': False }})
    
class GetEnterprisesIDDevicePinnersDirectionEnum(str, Enum):
    ASC = "ASC"
    DESC = "DESC"


@dataclasses.dataclass
class GetEnterprisesIDDevicePinnersQueryParams:
    direction: Optional[GetEnterprisesIDDevicePinnersDirectionEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'direction', 'style': 'form', 'explode': True }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetEnterprisesIDDevicePinnersRequest:
    path_params: GetEnterprisesIDDevicePinnersPathParams = dataclasses.field()
    query_params: GetEnterprisesIDDevicePinnersQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetEnterprisesIDDevicePinnersResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    device_pinners: Optional[shared_devicepinners.DevicePinners] = dataclasses.field(default=None)
    
