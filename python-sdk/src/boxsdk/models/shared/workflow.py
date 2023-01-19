import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import user_base as shared_user_base

class WorkflowFlowsOutcomesActionTypeEnum(str, Enum):
    ADD_METADATA = "add_metadata"
    ASSIGN_TASK = "assign_task"
    COPY_FILE = "copy_file"
    COPY_FOLDER = "copy_folder"
    CREATE_FOLDER = "create_folder"
    DELETE_FILE = "delete_file"
    DELETE_FOLDER = "delete_folder"
    LOCK_FILE = "lock_file"
    MOVE_FILE = "move_file"
    MOVE_FOLDER = "move_folder"
    REMOVE_WATERMARK_FILE = "remove_watermark_file"
    RENAME_FOLDER = "rename_folder"
    RESTORE_FOLDER = "restore_folder"
    SHARE_FILE = "share_file"
    SHARE_FOLDER = "share_folder"
    UNLOCK_FILE = "unlock_file"
    UPLOAD_FILE = "upload_file"
    WAIT_FOR_TASK = "wait_for_task"
    WATERMARK_FILE = "watermark_file"
    GO_BACK_TO_STEP = "go_back_to_step"
    APPLY_FILE_CLASSIFICATION = "apply_file_classification"
    APPLY_FOLDER_CLASSIFICATION = "apply_folder_classification"
    SEND_NOTIFICATION = "send_notification"

class WorkflowFlowsOutcomesIfRejectedActionTypeEnum(str, Enum):
    ADD_METADATA = "add_metadata"
    ASSIGN_TASK = "assign_task"
    COPY_FILE = "copy_file"
    COPY_FOLDER = "copy_folder"
    CREATE_FOLDER = "create_folder"
    DELETE_FILE = "delete_file"
    DELETE_FOLDER = "delete_folder"
    LOCK_FILE = "lock_file"
    MOVE_FILE = "move_file"
    MOVE_FOLDER = "move_folder"
    REMOVE_WATERMARK_FILE = "remove_watermark_file"
    RENAME_FOLDER = "rename_folder"
    RESTORE_FOLDER = "restore_folder"
    SHARE_FILE = "share_file"
    SHARE_FOLDER = "share_folder"
    UNLOCK_FILE = "unlock_file"
    UPLOAD_FILE = "upload_file"
    WAIT_FOR_TASK = "wait_for_task"
    WATERMARK_FILE = "watermark_file"
    GO_BACK_TO_STEP = "go_back_to_step"
    APPLY_FILE_CLASSIFICATION = "apply_file_classification"
    APPLY_FOLDER_CLASSIFICATION = "apply_folder_classification"
    SEND_NOTIFICATION = "send_notification"

class WorkflowFlowsOutcomesIfRejectedTypeEnum(str, Enum):
    OUTCOME = "outcome"


@dataclass_json
@dataclasses.dataclass
class WorkflowFlowsOutcomesIfRejected:
    action_type: Optional[WorkflowFlowsOutcomesIfRejectedActionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('action_type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[WorkflowFlowsOutcomesIfRejectedTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class WorkflowFlowsOutcomesTypeEnum(str, Enum):
    OUTCOME = "outcome"


@dataclass_json
@dataclasses.dataclass
class WorkflowFlowsOutcomes:
    r"""WorkflowFlowsOutcomes
    List of outcomes to perform once the conditions of trigger are met.
    """
    
    action_type: Optional[WorkflowFlowsOutcomesActionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('action_type') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    if_rejected: Optional[list[WorkflowFlowsOutcomesIfRejected]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('if_rejected') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[WorkflowFlowsOutcomesTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class WorkflowFlowsTriggerScopeObjectTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class WorkflowFlowsTriggerScopeObject:
    r"""WorkflowFlowsTriggerScopeObject
    The object the `ref` points to
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[WorkflowFlowsTriggerScopeObjectTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class WorkflowFlowsTriggerScopeTypeEnum(str, Enum):
    TRIGGER_SCOPE = "trigger_scope"


@dataclass_json
@dataclasses.dataclass
class WorkflowFlowsTriggerScope:
    r"""WorkflowFlowsTriggerScope
    Object that describes where and how a Trigger condition is met
    """
    
    object: Optional[WorkflowFlowsTriggerScopeObject] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('object') }})
    ref: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('ref') }})
    type: Optional[WorkflowFlowsTriggerScopeTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class WorkflowFlowsTriggerTriggerTypeEnum(str, Enum):
    WORKFLOW_MANUAL_START = "WORKFLOW_MANUAL_START"

class WorkflowFlowsTriggerTypeEnum(str, Enum):
    TRIGGER = "trigger"


@dataclass_json
@dataclasses.dataclass
class WorkflowFlowsTrigger:
    scope: Optional[list[WorkflowFlowsTriggerScope]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('scope') }})
    trigger_type: Optional[WorkflowFlowsTriggerTriggerTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('trigger_type') }})
    type: Optional[WorkflowFlowsTriggerTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class WorkflowFlowsTypeEnum(str, Enum):
    FLOW = "flow"


@dataclass_json
@dataclasses.dataclass
class WorkflowFlows:
    r"""WorkflowFlows
    A step in a Box Relay Workflow. Each flow contains a `Trigger` and
    a collection of Outcomes to perform once the conditions of a
    `Trigger` are met
    """
    
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    created_by: Optional[shared_user_base.UserBase] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_by') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    outcomes: Optional[list[WorkflowFlowsOutcomes]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('outcomes') }})
    trigger: Optional[WorkflowFlowsTrigger] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('trigger') }})
    type: Optional[WorkflowFlowsTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class WorkflowTypeEnum(str, Enum):
    WORKFLOW = "workflow"


@dataclass_json
@dataclasses.dataclass
class Workflow:
    r"""Workflow
    Box Relay Workflows are objects that represent a named collection of flows.
    
    You application must be authorized to use the `Manage Box Relay` application
    scope within the developer console in order to use this resource.
    """
    
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    flows: Optional[list[WorkflowFlows]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('flows') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    is_enabled: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_enabled') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    type: Optional[WorkflowTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
