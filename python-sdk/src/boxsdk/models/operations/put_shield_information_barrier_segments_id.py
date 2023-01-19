import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import shieldinformationbarriersegment as shared_shieldinformationbarriersegment


@dataclasses.dataclass
class PutShieldInformationBarrierSegmentsIDPathParams:
    shield_information_barrier_segment_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'shield_information_barrier_segment_id', 'style': 'simple', 'explode': False }})
    

@dataclass_json
@dataclasses.dataclass
class PutShieldInformationBarrierSegmentsIDRequestBody:
    r"""PutShieldInformationBarrierSegmentsIDRequestBody
    An object containing update(s) to be made on the Shield
    Information Barrier Segment. Possible properties include
    'name' and 'description', the value in object is the update.
    """
    
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    

@dataclasses.dataclass
class PutShieldInformationBarrierSegmentsIDRequest:
    path_params: PutShieldInformationBarrierSegmentsIDPathParams = dataclasses.field()
    request: Optional[PutShieldInformationBarrierSegmentsIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutShieldInformationBarrierSegmentsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    shield_information_barrier_segment: Optional[shared_shieldinformationbarriersegment.ShieldInformationBarrierSegment] = dataclasses.field(default=None)
    
