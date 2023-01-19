import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadatacascadepolicies as shared_metadatacascadepolicies


@dataclasses.dataclass
class GetMetadataCascadePoliciesQueryParams:
    folder_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'folder_id', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'offset', 'style': 'form', 'explode': True }})
    owner_enterprise_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'owner_enterprise_id', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetMetadataCascadePoliciesRequest:
    query_params: GetMetadataCascadePoliciesQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetMetadataCascadePoliciesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_cascade_policies: Optional[shared_metadatacascadepolicies.MetadataCascadePolicies] = dataclasses.field(default=None)
    
