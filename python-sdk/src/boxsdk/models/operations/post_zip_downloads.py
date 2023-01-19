import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import zipdownloadrequest as shared_zipdownloadrequest
from ..shared import clienterror as shared_clienterror
from ..shared import zipdownload as shared_zipdownload


@dataclasses.dataclass
class PostZipDownloadsRequest:
    request: Optional[shared_zipdownloadrequest.ZipDownloadRequest] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostZipDownloadsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    zip_download: Optional[shared_zipdownload.ZipDownload] = dataclasses.field(default=None)
    
