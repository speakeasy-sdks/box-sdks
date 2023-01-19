import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteMetadataCascadePoliciesIDPathParams:
    metadata_cascade_policy_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'metadata_cascade_policy_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteMetadataCascadePoliciesIDRequest:
    path_params: DeleteMetadataCascadePoliciesIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteMetadataCascadePoliciesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
