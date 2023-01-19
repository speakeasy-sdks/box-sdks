import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadata as shared_metadata

class GetFoldersIDMetadataIDIDScopeEnum(str, Enum):
    GLOBAL = "global"
    ENTERPRISE = "enterprise"


@dataclasses.dataclass
class GetFoldersIDMetadataIDIDPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    scope: GetFoldersIDMetadataIDIDScopeEnum = dataclasses.field(metadata={'path_param': { 'field_name': 'scope', 'style': 'simple', 'explode': False }})
    template_key: str = dataclasses.field(metadata={'path_param': { 'field_name': 'template_key', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetFoldersIDMetadataIDIDRequest:
    path_params: GetFoldersIDMetadataIDIDPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetFoldersIDMetadataIDIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata: Optional[shared_metadata.Metadata] = dataclasses.field(default=None)
    
