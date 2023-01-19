import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


GET_ZIP_DOWNLOADS_ID_CONTENT_SERVERS = [
	"https://dl.boxcloud.com/2.0",
]


@dataclasses.dataclass
class GetZipDownloadsIDContentPathParams:
    zip_download_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'zip_download_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetZipDownloadsIDContentRequest:
    path_params: GetZipDownloadsIDContentPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    server_url: Optional[str] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetZipDownloadsIDContentResponse:
    content_type: str = dataclasses.field()
    headers: dict[str, list[str]] = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    get_zip_downloads_id_content_200_application_octet_stream_binary_string: Optional[bytes] = dataclasses.field(default=None)
    
