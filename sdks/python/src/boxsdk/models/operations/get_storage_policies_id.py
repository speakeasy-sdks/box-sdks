import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import storagepolicy as shared_storagepolicy


@dataclasses.dataclass
class GetStoragePoliciesIDPathParams:
    storage_policy_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'storage_policy_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetStoragePoliciesIDRequest:
    path_params: GetStoragePoliciesIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetStoragePoliciesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    storage_policy: Optional[shared_storagepolicy.StoragePolicy] = dataclasses.field(default=None)
    
