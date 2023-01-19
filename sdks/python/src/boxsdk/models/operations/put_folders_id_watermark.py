import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import watermark as shared_watermark


@dataclasses.dataclass
class PutFoldersIDWatermarkPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    
class PutFoldersIDWatermarkRequestBodyWatermarkImprintEnum(str, Enum):
    DEFAULT = "default"


@dataclass_json
@dataclasses.dataclass
class PutFoldersIDWatermarkRequestBodyWatermark:
    r"""PutFoldersIDWatermarkRequestBodyWatermark
    The watermark to imprint on the folder
    """
    
    imprint: PutFoldersIDWatermarkRequestBodyWatermarkImprintEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('imprint') }})
    

@dataclass_json
@dataclasses.dataclass
class PutFoldersIDWatermarkRequestBody:
    watermark: PutFoldersIDWatermarkRequestBodyWatermark = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('watermark') }})
    

@dataclasses.dataclass
class PutFoldersIDWatermarkRequest:
    path_params: PutFoldersIDWatermarkPathParams = dataclasses.field()
    request: Optional[PutFoldersIDWatermarkRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFoldersIDWatermarkResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    watermark: Optional[shared_watermark.Watermark] = dataclasses.field(default=None)
    
