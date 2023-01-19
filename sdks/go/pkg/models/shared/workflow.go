package shared

import (
	"time"
)

type WorkflowFlowsOutcomesActionTypeEnum string

const (
	WorkflowFlowsOutcomesActionTypeEnumAddMetadata               WorkflowFlowsOutcomesActionTypeEnum = "add_metadata"
	WorkflowFlowsOutcomesActionTypeEnumAssignTask                WorkflowFlowsOutcomesActionTypeEnum = "assign_task"
	WorkflowFlowsOutcomesActionTypeEnumCopyFile                  WorkflowFlowsOutcomesActionTypeEnum = "copy_file"
	WorkflowFlowsOutcomesActionTypeEnumCopyFolder                WorkflowFlowsOutcomesActionTypeEnum = "copy_folder"
	WorkflowFlowsOutcomesActionTypeEnumCreateFolder              WorkflowFlowsOutcomesActionTypeEnum = "create_folder"
	WorkflowFlowsOutcomesActionTypeEnumDeleteFile                WorkflowFlowsOutcomesActionTypeEnum = "delete_file"
	WorkflowFlowsOutcomesActionTypeEnumDeleteFolder              WorkflowFlowsOutcomesActionTypeEnum = "delete_folder"
	WorkflowFlowsOutcomesActionTypeEnumLockFile                  WorkflowFlowsOutcomesActionTypeEnum = "lock_file"
	WorkflowFlowsOutcomesActionTypeEnumMoveFile                  WorkflowFlowsOutcomesActionTypeEnum = "move_file"
	WorkflowFlowsOutcomesActionTypeEnumMoveFolder                WorkflowFlowsOutcomesActionTypeEnum = "move_folder"
	WorkflowFlowsOutcomesActionTypeEnumRemoveWatermarkFile       WorkflowFlowsOutcomesActionTypeEnum = "remove_watermark_file"
	WorkflowFlowsOutcomesActionTypeEnumRenameFolder              WorkflowFlowsOutcomesActionTypeEnum = "rename_folder"
	WorkflowFlowsOutcomesActionTypeEnumRestoreFolder             WorkflowFlowsOutcomesActionTypeEnum = "restore_folder"
	WorkflowFlowsOutcomesActionTypeEnumShareFile                 WorkflowFlowsOutcomesActionTypeEnum = "share_file"
	WorkflowFlowsOutcomesActionTypeEnumShareFolder               WorkflowFlowsOutcomesActionTypeEnum = "share_folder"
	WorkflowFlowsOutcomesActionTypeEnumUnlockFile                WorkflowFlowsOutcomesActionTypeEnum = "unlock_file"
	WorkflowFlowsOutcomesActionTypeEnumUploadFile                WorkflowFlowsOutcomesActionTypeEnum = "upload_file"
	WorkflowFlowsOutcomesActionTypeEnumWaitForTask               WorkflowFlowsOutcomesActionTypeEnum = "wait_for_task"
	WorkflowFlowsOutcomesActionTypeEnumWatermarkFile             WorkflowFlowsOutcomesActionTypeEnum = "watermark_file"
	WorkflowFlowsOutcomesActionTypeEnumGoBackToStep              WorkflowFlowsOutcomesActionTypeEnum = "go_back_to_step"
	WorkflowFlowsOutcomesActionTypeEnumApplyFileClassification   WorkflowFlowsOutcomesActionTypeEnum = "apply_file_classification"
	WorkflowFlowsOutcomesActionTypeEnumApplyFolderClassification WorkflowFlowsOutcomesActionTypeEnum = "apply_folder_classification"
	WorkflowFlowsOutcomesActionTypeEnumSendNotification          WorkflowFlowsOutcomesActionTypeEnum = "send_notification"
)

type WorkflowFlowsOutcomesIfRejectedActionTypeEnum string

const (
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumAddMetadata               WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "add_metadata"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumAssignTask                WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "assign_task"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumCopyFile                  WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "copy_file"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumCopyFolder                WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "copy_folder"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumCreateFolder              WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "create_folder"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumDeleteFile                WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "delete_file"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumDeleteFolder              WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "delete_folder"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumLockFile                  WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "lock_file"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumMoveFile                  WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "move_file"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumMoveFolder                WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "move_folder"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumRemoveWatermarkFile       WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "remove_watermark_file"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumRenameFolder              WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "rename_folder"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumRestoreFolder             WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "restore_folder"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumShareFile                 WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "share_file"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumShareFolder               WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "share_folder"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumUnlockFile                WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "unlock_file"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumUploadFile                WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "upload_file"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumWaitForTask               WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "wait_for_task"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumWatermarkFile             WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "watermark_file"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumGoBackToStep              WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "go_back_to_step"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumApplyFileClassification   WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "apply_file_classification"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumApplyFolderClassification WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "apply_folder_classification"
	WorkflowFlowsOutcomesIfRejectedActionTypeEnumSendNotification          WorkflowFlowsOutcomesIfRejectedActionTypeEnum = "send_notification"
)

type WorkflowFlowsOutcomesIfRejectedTypeEnum string

const (
	WorkflowFlowsOutcomesIfRejectedTypeEnumOutcome WorkflowFlowsOutcomesIfRejectedTypeEnum = "outcome"
)

type WorkflowFlowsOutcomesIfRejected struct {
	ActionType *WorkflowFlowsOutcomesIfRejectedActionTypeEnum `json:"action_type,omitempty"`
	ID         *string                                        `json:"id,omitempty"`
	Name       *string                                        `json:"name,omitempty"`
	Type       *WorkflowFlowsOutcomesIfRejectedTypeEnum       `json:"type,omitempty"`
}

type WorkflowFlowsOutcomesTypeEnum string

const (
	WorkflowFlowsOutcomesTypeEnumOutcome WorkflowFlowsOutcomesTypeEnum = "outcome"
)

// WorkflowFlowsOutcomes
// List of outcomes to perform once the conditions of trigger are met.
type WorkflowFlowsOutcomes struct {
	ActionType *WorkflowFlowsOutcomesActionTypeEnum `json:"action_type,omitempty"`
	ID         *string                              `json:"id,omitempty"`
	IfRejected []WorkflowFlowsOutcomesIfRejected    `json:"if_rejected,omitempty"`
	Name       *string                              `json:"name,omitempty"`
	Type       *WorkflowFlowsOutcomesTypeEnum       `json:"type,omitempty"`
}

type WorkflowFlowsTriggerScopeObjectTypeEnum string

const (
	WorkflowFlowsTriggerScopeObjectTypeEnumFolder WorkflowFlowsTriggerScopeObjectTypeEnum = "folder"
)

// WorkflowFlowsTriggerScopeObject
// The object the `ref` points to
type WorkflowFlowsTriggerScopeObject struct {
	ID   *string                                  `json:"id,omitempty"`
	Type *WorkflowFlowsTriggerScopeObjectTypeEnum `json:"type,omitempty"`
}

type WorkflowFlowsTriggerScopeTypeEnum string

const (
	WorkflowFlowsTriggerScopeTypeEnumTriggerScope WorkflowFlowsTriggerScopeTypeEnum = "trigger_scope"
)

// WorkflowFlowsTriggerScope
// Object that describes where and how a Trigger condition is met
type WorkflowFlowsTriggerScope struct {
	Object *WorkflowFlowsTriggerScopeObject   `json:"object,omitempty"`
	Ref    *string                            `json:"ref,omitempty"`
	Type   *WorkflowFlowsTriggerScopeTypeEnum `json:"type,omitempty"`
}

type WorkflowFlowsTriggerTriggerTypeEnum string

const (
	WorkflowFlowsTriggerTriggerTypeEnumWorkflowManualStart WorkflowFlowsTriggerTriggerTypeEnum = "WORKFLOW_MANUAL_START"
)

type WorkflowFlowsTriggerTypeEnum string

const (
	WorkflowFlowsTriggerTypeEnumTrigger WorkflowFlowsTriggerTypeEnum = "trigger"
)

type WorkflowFlowsTrigger struct {
	Scope       []WorkflowFlowsTriggerScope          `json:"scope,omitempty"`
	TriggerType *WorkflowFlowsTriggerTriggerTypeEnum `json:"trigger_type,omitempty"`
	Type        *WorkflowFlowsTriggerTypeEnum        `json:"type,omitempty"`
}

type WorkflowFlowsTypeEnum string

const (
	WorkflowFlowsTypeEnumFlow WorkflowFlowsTypeEnum = "flow"
)

// WorkflowFlows
// A step in a Box Relay Workflow. Each flow contains a `Trigger` and
// a collection of Outcomes to perform once the conditions of a
// `Trigger` are met
type WorkflowFlows struct {
	CreatedAt *time.Time              `json:"created_at,omitempty"`
	CreatedBy *UserBase               `json:"created_by,omitempty"`
	ID        *string                 `json:"id,omitempty"`
	Outcomes  []WorkflowFlowsOutcomes `json:"outcomes,omitempty"`
	Trigger   *WorkflowFlowsTrigger   `json:"trigger,omitempty"`
	Type      *WorkflowFlowsTypeEnum  `json:"type,omitempty"`
}

type WorkflowTypeEnum string

const (
	WorkflowTypeEnumWorkflow WorkflowTypeEnum = "workflow"
)

// Workflow
// Box Relay Workflows are objects that represent a named collection of flows.
//
// You application must be authorized to use the `Manage Box Relay` application
// scope within the developer console in order to use this resource.
type Workflow struct {
	Description *string           `json:"description,omitempty"`
	Flows       []WorkflowFlows   `json:"flows,omitempty"`
	ID          *string           `json:"id,omitempty"`
	IsEnabled   *bool             `json:"is_enabled,omitempty"`
	Name        *string           `json:"name,omitempty"`
	Type        *WorkflowTypeEnum `json:"type,omitempty"`
}
