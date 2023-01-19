import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import watermark as shared_watermark


@dataclasses.dataclass
class GetFilesIDWatermarkPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDWatermarkRequest:
    path_params: GetFilesIDWatermarkPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesIDWatermarkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    watermark: Optional[shared_watermark.Watermark] = dataclasses.field(default=None)
    
