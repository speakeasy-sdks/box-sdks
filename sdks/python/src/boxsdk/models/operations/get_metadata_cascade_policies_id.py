import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadatacascadepolicy as shared_metadatacascadepolicy


@dataclasses.dataclass
class GetMetadataCascadePoliciesIDPathParams:
    metadata_cascade_policy_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'metadata_cascade_policy_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetMetadataCascadePoliciesIDRequest:
    path_params: GetMetadataCascadePoliciesIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetMetadataCascadePoliciesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_cascade_policy: Optional[shared_metadatacascadepolicy.MetadataCascadePolicy] = dataclasses.field(default=None)
    
