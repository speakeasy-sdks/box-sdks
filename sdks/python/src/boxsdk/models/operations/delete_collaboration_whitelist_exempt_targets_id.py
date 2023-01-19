import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class DeleteCollaborationWhitelistExemptTargetsIDPathParams:
    collaboration_whitelist_exempt_target_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'collaboration_whitelist_exempt_target_id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class DeleteCollaborationWhitelistExemptTargetsIDRequest:
    path_params: DeleteCollaborationWhitelistExemptTargetsIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class DeleteCollaborationWhitelistExemptTargetsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
