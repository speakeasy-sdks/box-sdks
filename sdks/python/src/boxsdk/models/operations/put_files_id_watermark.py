import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import watermark as shared_watermark


@dataclasses.dataclass
class PutFilesIDWatermarkPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    
class PutFilesIDWatermarkRequestBodyWatermarkImprintEnum(str, Enum):
    DEFAULT = "default"


@dataclass_json
@dataclasses.dataclass
class PutFilesIDWatermarkRequestBodyWatermark:
    r"""PutFilesIDWatermarkRequestBodyWatermark
    The watermark to imprint on the file
    """
    
    imprint: PutFilesIDWatermarkRequestBodyWatermarkImprintEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('imprint') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFilesIDWatermarkRequestBody:
    watermark: PutFilesIDWatermarkRequestBodyWatermark = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('watermark') }})
    

@dataclasses.dataclass
class PutFilesIDWatermarkRequest:
    path_params: PutFilesIDWatermarkPathParams = dataclasses.field()
    request: Optional[PutFilesIDWatermarkRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFilesIDWatermarkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    watermark: Optional[shared_watermark.Watermark] = dataclasses.field(default=None)
    
