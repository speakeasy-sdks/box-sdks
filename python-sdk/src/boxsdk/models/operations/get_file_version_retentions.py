import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import fileversionretentions as shared_fileversionretentions

class GetFileVersionRetentionsDispositionActionEnum(str, Enum):
    PERMANENTLY_DELETE = "permanently_delete"
    REMOVE_RETENTION = "remove_retention"


@dataclasses.dataclass
class GetFileVersionRetentionsQueryParams:
    disposition_action: Optional[GetFileVersionRetentionsDispositionActionEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'disposition_action', 'style': 'form', 'explode': True }})
    disposition_after: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'disposition_after', 'style': 'form', 'explode': True }})
    disposition_before: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'disposition_before', 'style': 'form', 'explode': True }})
    file_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'file_id', 'style': 'form', 'explode': True }})
    file_version_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'file_version_id', 'style': 'form', 'explode': True }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    policy_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'policy_id', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetFileVersionRetentionsRequest:
    query_params: GetFileVersionRetentionsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFileVersionRetentionsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    file_version_retentions: Optional[shared_fileversionretentions.FileVersionRetentions] = dataclasses.field(default=None)
    
