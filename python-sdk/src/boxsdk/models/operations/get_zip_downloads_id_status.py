import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import zipdownloadstatus as shared_zipdownloadstatus


@dataclasses.dataclass
class GetZipDownloadsIDStatusPathParams:
    zip_download_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'zip_download_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetZipDownloadsIDStatusRequest:
    path_params: GetZipDownloadsIDStatusPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetZipDownloadsIDStatusResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    zip_download_status: Optional[shared_zipdownloadstatus.ZipDownloadStatus] = dataclasses.field(default=None)
    
