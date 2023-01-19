import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadatatemplates as shared_metadatatemplates


@dataclasses.dataclass
class GetMetadataTemplatesEnterpriseQueryParams:
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetMetadataTemplatesEnterpriseRequest:
    query_params: GetMetadataTemplatesEnterpriseQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetMetadataTemplatesEnterpriseResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_templates: Optional[shared_metadatatemplates.MetadataTemplates] = dataclasses.field(default=None)
    
