import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadatatemplate as shared_metadatatemplate


@dataclasses.dataclass
class GetMetadataTemplatesIDPathParams:
    template_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'template_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetMetadataTemplatesIDRequest:
    path_params: GetMetadataTemplatesIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetMetadataTemplatesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_template: Optional[shared_metadatatemplate.MetadataTemplate] = dataclasses.field(default=None)
    
