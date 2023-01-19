import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import shieldinformationbarrier as shared_shieldinformationbarrier
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class PostShieldInformationBarriersRequest:
    request: Optional[shared_shieldinformationbarrier.ShieldInformationBarrier] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostShieldInformationBarriersResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier: Optional[shared_shieldinformationbarrier.ShieldInformationBarrier] = dataclasses.field(default=None)
    
