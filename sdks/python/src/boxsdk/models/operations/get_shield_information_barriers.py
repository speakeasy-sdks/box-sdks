import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import shieldinformationbarrier as shared_shieldinformationbarrier
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class GetShieldInformationBarriersQueryParams:
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclass_json
@dataclasses.dataclass
class GetShieldInformationBarriers200ApplicationJSON:
    entries: Optional[list[shared_shieldinformationbarrier.ShieldInformationBarrier]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('limit') }})
    next_marker: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next_marker') }})
    

@dataclasses.dataclass
class GetShieldInformationBarriersRequest:
    query_params: GetShieldInformationBarriersQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetShieldInformationBarriersResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    get_shield_information_barriers_200_application_json_object: Optional[GetShieldInformationBarriers200ApplicationJSON] = dataclasses.field(default=None)
    
