import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import clienterror as shared_clienterror


@dataclasses.dataclass
class PostWorkflowsIDStartPathParams:
    workflow_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'workflow_id', 'style': 'simple', 'explode': False }})
    
class PostWorkflowsIDStartRequestBodyFilesTypeEnum(str, Enum):
    FILE = "file"


@dataclass_json
@dataclasses.dataclass
class PostWorkflowsIDStartRequestBodyFiles:
    r"""PostWorkflowsIDStartRequestBodyFiles
    A file the workflow should start for
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[PostWorkflowsIDStartRequestBodyFilesTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class PostWorkflowsIDStartRequestBodyFlow:
    r"""PostWorkflowsIDStartRequestBodyFlow
    The flow that will be triggered
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostWorkflowsIDStartRequestBodyFolderTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class PostWorkflowsIDStartRequestBodyFolder:
    r"""PostWorkflowsIDStartRequestBodyFolder
    The folder object for which the workflow is configured.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[PostWorkflowsIDStartRequestBodyFolderTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostWorkflowsIDStartRequestBodyOutcomesTypeEnum(str, Enum):
    OUTCOME = "outcome"


@dataclass_json
@dataclasses.dataclass
class PostWorkflowsIDStartRequestBodyOutcomes:
    r"""PostWorkflowsIDStartRequestBodyOutcomes
    A configurable outcome the workflow should complete. If you
    have a `task_completion_rule`, you may input `all_assignees` or
    `any_assignee` in the `variable_value` field. Similarly, if you
    have a `collaborator_role`, you may input `editor`, `viewer`,
    `previewer`, `uploader`, `previewer uploader`, `viewer uploader`
    , `co-owner` in the `variable_value` field.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    parameter: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parameter') }})
    type: Optional[PostWorkflowsIDStartRequestBodyOutcomesTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class PostWorkflowsIDStartRequestBodyTypeEnum(str, Enum):
    WORKFLOW_PARAMETERS = "workflow_parameters"


@dataclass_json
@dataclasses.dataclass
class PostWorkflowsIDStartRequestBody:
    files: list[PostWorkflowsIDStartRequestBodyFiles] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('files') }})
    flow: PostWorkflowsIDStartRequestBodyFlow = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('flow') }})
    folder: PostWorkflowsIDStartRequestBodyFolder = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('folder') }})
    outcomes: Optional[list[PostWorkflowsIDStartRequestBodyOutcomes]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('outcomes') }})
    type: Optional[PostWorkflowsIDStartRequestBodyTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclasses.dataclass
class PostWorkflowsIDStartRequest:
    path_params: PostWorkflowsIDStartPathParams = dataclasses.field()
    request: Optional[PostWorkflowsIDStartRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostWorkflowsIDStartResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    
