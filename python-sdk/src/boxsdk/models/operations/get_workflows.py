import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import workflows as shared_workflows


@dataclasses.dataclass
class GetWorkflowsQueryParams:
    folder_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'folder_id', 'style': 'form', 'explode': True }})
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    marker: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'marker', 'style': 'form', 'explode': True }})
    trigger_type: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'trigger_type', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetWorkflowsRequest:
    query_params: GetWorkflowsQueryParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetWorkflowsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    workflows: Optional[shared_workflows.Workflows] = dataclasses.field(default=None)
    
