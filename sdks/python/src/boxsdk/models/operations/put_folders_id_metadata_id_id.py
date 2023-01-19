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

class PutFoldersIDMetadataIDIDScopeEnum(str, Enum):
    GLOBAL = "global"
    ENTERPRISE = "enterprise"


@dataclasses.dataclass
class PutFoldersIDMetadataIDIDPathParams:
    folder_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'folder_id', 'style': 'simple', 'explode': False }})
    scope: PutFoldersIDMetadataIDIDScopeEnum = dataclasses.field(metadata={'path_param': { 'field_name': 'scope', 'style': 'simple', 'explode': False }})
    template_key: str = dataclasses.field(metadata={'path_param': { 'field_name': 'template_key', 'style': 'simple', 'explode': False }})
    
class PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum(str, Enum):
    ADD = "add"
    REPLACE = "replace"
    REMOVE = "remove"
    TEST = "test"
    MOVE = "move"
    COPY = "copy"


@dataclass_json
@dataclasses.dataclass
class PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperation:
    r"""PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperation
    A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
    change to make to the metadata instance.
    """
    
    from_: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('from') }})
    op: Optional[PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('op') }})
    path: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('path') }})
    value: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    

@dataclasses.dataclass
class PutFoldersIDMetadataIDIDRequest:
    path_params: PutFoldersIDMetadataIDIDPathParams = dataclasses.field()
    request: Optional[list[PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperation]] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json-patch+json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PutFoldersIDMetadataIDIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata: Optional[shared_metadata.Metadata] = dataclasses.field(default=None)
    
