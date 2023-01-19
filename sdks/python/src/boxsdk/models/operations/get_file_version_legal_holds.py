import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import fileversionlegalholds as shared_fileversionlegalholds


@dataclasses.dataclass
class GetFileVersionLegalHoldsQueryParams:
    policy_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'policy_id', 'style': 'form', 'explode': True }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetFileVersionLegalHoldsRequest:
    query_params: GetFileVersionLegalHoldsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFileVersionLegalHoldsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_version_legal_holds: Optional[shared_fileversionlegalholds.FileVersionLegalHolds] = dataclasses.field(default=None)
    
