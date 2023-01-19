package shared

import (
	"time"
)

type TaskAssignmentResolutionStateEnum string

const (
	TaskAssignmentResolutionStateEnumCompleted  TaskAssignmentResolutionStateEnum = "completed"
	TaskAssignmentResolutionStateEnumIncomplete TaskAssignmentResolutionStateEnum = "incomplete"
	TaskAssignmentResolutionStateEnumApproved   TaskAssignmentResolutionStateEnum = "approved"
	TaskAssignmentResolutionStateEnumRejected   TaskAssignmentResolutionStateEnum = "rejected"
)

type TaskAssignmentTypeEnum string

const (
	TaskAssignmentTypeEnumTaskAssignment TaskAssignmentTypeEnum = "task_assignment"
)

// TaskAssignment
// A task assignment defines which task is assigned to which user to complete.
type TaskAssignment struct {
	AssignedAt      *time.Time                         `json:"assigned_at,omitempty"`
	AssignedBy      *UserMini                          `json:"assigned_by,omitempty"`
	AssignedTo      *UserMini                          `json:"assigned_to,omitempty"`
	CompletedAt     *time.Time                         `json:"completed_at,omitempty"`
	ID              *string                            `json:"id,omitempty"`
	Item            *FileMini                          `json:"item,omitempty"`
	Message         *string                            `json:"message,omitempty"`
	RemindedAt      *time.Time                         `json:"reminded_at,omitempty"`
	ResolutionState *TaskAssignmentResolutionStateEnum `json:"resolution_state,omitempty"`
	Type            *TaskAssignmentTypeEnum            `json:"type,omitempty"`
}
