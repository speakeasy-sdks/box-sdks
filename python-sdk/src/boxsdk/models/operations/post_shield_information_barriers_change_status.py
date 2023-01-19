import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarrier as shared_shieldinformationbarrier

class PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum(str, Enum):
    PENDING = "pending"
    DISABLED = "disabled"


@dataclass_json
@dataclasses.dataclass
class PostShieldInformationBarriersChangeStatusRequestBody:
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    status: PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    

@dataclasses.dataclass
class PostShieldInformationBarriersChangeStatusRequest:
    request: Optional[PostShieldInformationBarriersChangeStatusRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostShieldInformationBarriersChangeStatusResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier: Optional[shared_shieldinformationbarrier.ShieldInformationBarrier] = dataclasses.field(default=None)
    
