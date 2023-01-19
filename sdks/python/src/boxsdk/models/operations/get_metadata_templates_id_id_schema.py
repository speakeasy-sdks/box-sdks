import dataclasses
from typing import Optional
from enum import Enum
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadatatemplate as shared_metadatatemplate

class GetMetadataTemplatesIDIDSchemaScopeEnum(str, Enum):
    GLOBAL = "global"
    ENTERPRISE = "enterprise"


@dataclasses.dataclass
class GetMetadataTemplatesIDIDSchemaPathParams:
    scope: GetMetadataTemplatesIDIDSchemaScopeEnum = dataclasses.field(metadata={'path_param': { 'field_name': 'scope', 'style': 'simple', 'explode': False }})
    template_key: str = dataclasses.field(metadata={'path_param': { 'field_name': 'template_key', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetMetadataTemplatesIDIDSchemaRequest:
    path_params: GetMetadataTemplatesIDIDSchemaPathParams = dataclasses.field()
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class GetMetadataTemplatesIDIDSchemaResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_template: Optional[shared_metadatatemplate.MetadataTemplate] = dataclasses.field(default=None)
    
