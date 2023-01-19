import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadataqueryindices as shared_metadataqueryindices

class GetMetadataQueryIndicesScopeEnum(str, Enum):
    GLOBAL = "global"
    ENTERPRISE = "enterprise"


@dataclasses.dataclass
class GetMetadataQueryIndicesQueryParams:
    scope: GetMetadataQueryIndicesScopeEnum = dataclasses.field(metadata={'query_param': { 'field_name': 'scope', 'style': 'form', 'explode': True }})
    template_key: str = dataclasses.field(metadata={'query_param': { 'field_name': 'template_key', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetMetadataQueryIndicesRequest:
    query_params: GetMetadataQueryIndicesQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetMetadataQueryIndicesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_query_indices: Optional[shared_metadataqueryindices.MetadataQueryIndices] = dataclasses.field(default=None)
    
