package shared

import (
	"time"
)

type TaskActionEnum string

const (
	TaskActionEnumReview   TaskActionEnum = "review"
	TaskActionEnumComplete TaskActionEnum = "complete"
)

type TaskCompletionRuleEnum string

const (
	TaskCompletionRuleEnumAllAssignees TaskCompletionRuleEnum = "all_assignees"
	TaskCompletionRuleEnumAnyAssignee  TaskCompletionRuleEnum = "any_assignee"
)

type TaskTypeEnum string

const (
	TaskTypeEnumTask TaskTypeEnum = "task"
)

// Task
// A task allows for file-centric workflows within Box. Users can
// create tasks on files and assign them to other users for them to complete the
// tasks.
type Task struct {
	Action                   *TaskActionEnum         `json:"action,omitempty"`
	CompletionRule           *TaskCompletionRuleEnum `json:"completion_rule,omitempty"`
	CreatedAt                *time.Time              `json:"created_at,omitempty"`
	CreatedBy                *UserMini               `json:"created_by,omitempty"`
	DueAt                    *time.Time              `json:"due_at,omitempty"`
	ID                       *string                 `json:"id,omitempty"`
	IsCompleted              *bool                   `json:"is_completed,omitempty"`
	Item                     *FileMini               `json:"item,omitempty"`
	Message                  *string                 `json:"message,omitempty"`
	TaskAssignmentCollection *TaskAssignments        `json:"task_assignment_collection,omitempty"`
	Type                     *TaskTypeEnum           `json:"type,omitempty"`
}
