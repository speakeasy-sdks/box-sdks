import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import realtimeservers as shared_realtimeservers


@dataclasses.dataclass
class OptionsEventsRequest:
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class OptionsEventsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    realtime_servers: Optional[shared_realtimeservers.RealtimeServers] = dataclasses.field(default=None)
    
