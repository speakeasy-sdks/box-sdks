import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadatatemplates as shared_metadatatemplates


@dataclasses.dataclass
class GetMetadataTemplatesQueryParams:
    metadata_instance_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'metadata_instance_id', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetMetadataTemplatesRequest:
    query_params: GetMetadataTemplatesQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetMetadataTemplatesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_templates: Optional[shared_metadatatemplates.MetadataTemplates] = dataclasses.field(default=None)
    
