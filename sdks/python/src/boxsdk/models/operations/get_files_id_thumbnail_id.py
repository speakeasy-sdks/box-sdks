import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror

class GetFilesIDThumbnailIDExtensionEnum(str, Enum):
    PNG = "png"
    JPG = "jpg"


@dataclasses.dataclass
class GetFilesIDThumbnailIDPathParams:
    extension: GetFilesIDThumbnailIDExtensionEnum = dataclasses.field(metadata={'path_param': { 'field_name': 'extension', 'style': 'simple', 'explode': False }})
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFilesIDThumbnailIDQueryParams:
    max_height: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'max_height', 'style': 'form', 'explode': True }})
    max_width: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'max_width', 'style': 'form', 'explode': True }})
    min_height: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'min_height', 'style': 'form', 'explode': True }})
    min_width: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'min_width', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetFilesIDThumbnailIDRequest:
    path_params: GetFilesIDThumbnailIDPathParams = dataclasses.field()
    query_params: GetFilesIDThumbnailIDQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFilesIDThumbnailIDResponse:
    content_type: str = dataclasses.field()
    headers: dict[str, list[str]] = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    get_files_id_thumbnail_id_200_image_jpg_binary_string: Optional[bytes] = dataclasses.field(default=None)
    get_files_id_thumbnail_id_200_image_png_binary_string: Optional[bytes] = dataclasses.field(default=None)
    
