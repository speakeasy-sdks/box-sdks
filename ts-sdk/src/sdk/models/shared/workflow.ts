import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserBase } from "./userbase";


export enum WorkflowFlowsOutcomesActionTypeEnum {
    AddMetadata = "add_metadata",
    AssignTask = "assign_task",
    CopyFile = "copy_file",
    CopyFolder = "copy_folder",
    CreateFolder = "create_folder",
    DeleteFile = "delete_file",
    DeleteFolder = "delete_folder",
    LockFile = "lock_file",
    MoveFile = "move_file",
    MoveFolder = "move_folder",
    RemoveWatermarkFile = "remove_watermark_file",
    RenameFolder = "rename_folder",
    RestoreFolder = "restore_folder",
    ShareFile = "share_file",
    ShareFolder = "share_folder",
    UnlockFile = "unlock_file",
    UploadFile = "upload_file",
    WaitForTask = "wait_for_task",
    WatermarkFile = "watermark_file",
    GoBackToStep = "go_back_to_step",
    ApplyFileClassification = "apply_file_classification",
    ApplyFolderClassification = "apply_folder_classification",
    SendNotification = "send_notification"
}

export enum WorkflowFlowsOutcomesIfRejectedActionTypeEnum {
    AddMetadata = "add_metadata",
    AssignTask = "assign_task",
    CopyFile = "copy_file",
    CopyFolder = "copy_folder",
    CreateFolder = "create_folder",
    DeleteFile = "delete_file",
    DeleteFolder = "delete_folder",
    LockFile = "lock_file",
    MoveFile = "move_file",
    MoveFolder = "move_folder",
    RemoveWatermarkFile = "remove_watermark_file",
    RenameFolder = "rename_folder",
    RestoreFolder = "restore_folder",
    ShareFile = "share_file",
    ShareFolder = "share_folder",
    UnlockFile = "unlock_file",
    UploadFile = "upload_file",
    WaitForTask = "wait_for_task",
    WatermarkFile = "watermark_file",
    GoBackToStep = "go_back_to_step",
    ApplyFileClassification = "apply_file_classification",
    ApplyFolderClassification = "apply_folder_classification",
    SendNotification = "send_notification"
}

export enum WorkflowFlowsOutcomesIfRejectedTypeEnum {
    Outcome = "outcome"
}


export class WorkflowFlowsOutcomesIfRejected extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=action_type" })
  actionType?: WorkflowFlowsOutcomesIfRejectedActionTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WorkflowFlowsOutcomesIfRejectedTypeEnum;
}

export enum WorkflowFlowsOutcomesTypeEnum {
    Outcome = "outcome"
}


// WorkflowFlowsOutcomes
/** 
 * List of outcomes to perform once the conditions of trigger are met.
**/
export class WorkflowFlowsOutcomes extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=action_type" })
  actionType?: WorkflowFlowsOutcomesActionTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=if_rejected", elemType: WorkflowFlowsOutcomesIfRejected })
  ifRejected?: WorkflowFlowsOutcomesIfRejected[];

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WorkflowFlowsOutcomesTypeEnum;
}

export enum WorkflowFlowsTriggerScopeObjectTypeEnum {
    Folder = "folder"
}


// WorkflowFlowsTriggerScopeObject
/** 
 * The object the `ref` points to
**/
export class WorkflowFlowsTriggerScopeObject extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WorkflowFlowsTriggerScopeObjectTypeEnum;
}

export enum WorkflowFlowsTriggerScopeTypeEnum {
    TriggerScope = "trigger_scope"
}


// WorkflowFlowsTriggerScope
/** 
 * Object that describes where and how a Trigger condition is met
**/
export class WorkflowFlowsTriggerScope extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=object" })
  object?: WorkflowFlowsTriggerScopeObject;

  @SpeakeasyMetadata({ data: "json, name=ref" })
  ref?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WorkflowFlowsTriggerScopeTypeEnum;
}

export enum WorkflowFlowsTriggerTriggerTypeEnum {
    WorkflowManualStart = "WORKFLOW_MANUAL_START"
}

export enum WorkflowFlowsTriggerTypeEnum {
    Trigger = "trigger"
}


export class WorkflowFlowsTrigger extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=scope", elemType: WorkflowFlowsTriggerScope })
  scope?: WorkflowFlowsTriggerScope[];

  @SpeakeasyMetadata({ data: "json, name=trigger_type" })
  triggerType?: WorkflowFlowsTriggerTriggerTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WorkflowFlowsTriggerTypeEnum;
}

export enum WorkflowFlowsTypeEnum {
    Flow = "flow"
}


// WorkflowFlows
/** 
 * A step in a Box Relay Workflow. Each flow contains a `Trigger` and
 * a collection of Outcomes to perform once the conditions of a
 * `Trigger` are met
**/
export class WorkflowFlows extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: UserBase;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=outcomes", elemType: WorkflowFlowsOutcomes })
  outcomes?: WorkflowFlowsOutcomes[];

  @SpeakeasyMetadata({ data: "json, name=trigger" })
  trigger?: WorkflowFlowsTrigger;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WorkflowFlowsTypeEnum;
}

export enum WorkflowTypeEnum {
    Workflow = "workflow"
}


// Workflow
/** 
 * Box Relay Workflows are objects that represent a named collection of flows.
 * 
 * You application must be authorized to use the `Manage Box Relay` application
 * scope within the developer console in order to use this resource.
**/
export class Workflow extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=flows", elemType: WorkflowFlows })
  flows?: WorkflowFlows[];

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=is_enabled" })
  isEnabled?: boolean;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WorkflowTypeEnum;
}
