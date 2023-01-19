import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror
from ..shared import metadata as shared_metadata

class PutFilesIDMetadataIDIDScopeEnum(str, Enum):
    GLOBAL = "global"
    ENTERPRISE = "enterprise"


@dataclasses.dataclass
class PutFilesIDMetadataIDIDPathParams:
    file_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'file_id', 'style': 'simple', 'explode': False }})
    scope: PutFilesIDMetadataIDIDScopeEnum = dataclasses.field(metadata={'path_param': { 'field_name': 'scope', 'style': 'simple', 'explode': False }})
    template_key: str = dataclasses.field(metadata={'path_param': { 'field_name': 'template_key', 'style': 'simple', 'explode': False }})
    
class PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum(str, Enum):
    ADD = "add"
    REPLACE = "replace"
    REMOVE = "remove"
    TEST = "test"
    MOVE = "move"
    COPY = "copy"


@dataclass_json
@dataclasses.dataclass
class PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperation:
    r"""PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperation
    A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
    change to make to the metadata instance.
    """
    
    from_: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('from') }})
    op: Optional[PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('op') }})
    path: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('path') }})
    value: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    

@dataclasses.dataclass
class PutFilesIDMetadataIDIDRequest:
    path_params: PutFilesIDMetadataIDIDPathParams = dataclasses.field()
    request: Optional[list[PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperation]] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json-patch+json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFilesIDMetadataIDIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata: Optional[shared_metadata.Metadata] = dataclasses.field(default=None)
    
