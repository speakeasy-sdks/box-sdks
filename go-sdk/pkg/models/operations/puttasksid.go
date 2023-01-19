package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutTasksIDPathParams struct {
	TaskID string `pathParam:"style=simple,explode=false,name=task_id"`
}

type PutTasksIDRequestBodyActionEnum string

const (
	PutTasksIDRequestBodyActionEnumReview   PutTasksIDRequestBodyActionEnum = "review"
	PutTasksIDRequestBodyActionEnumComplete PutTasksIDRequestBodyActionEnum = "complete"
)

type PutTasksIDRequestBodyCompletionRuleEnum string

const (
	PutTasksIDRequestBodyCompletionRuleEnumAllAssignees PutTasksIDRequestBodyCompletionRuleEnum = "all_assignees"
	PutTasksIDRequestBodyCompletionRuleEnumAnyAssignee  PutTasksIDRequestBodyCompletionRuleEnum = "any_assignee"
)

type PutTasksIDRequestBody struct {
	Action         *PutTasksIDRequestBodyActionEnum         `json:"action,omitempty"`
	CompletionRule *PutTasksIDRequestBodyCompletionRuleEnum `json:"completion_rule,omitempty"`
	DueAt          *time.Time                               `json:"due_at,omitempty"`
	Message        *string                                  `json:"message,omitempty"`
}

type PutTasksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutTasksIDPathParams
	Request    *PutTasksIDRequestBody `request:"mediaType=application/json"`
}

type PutTasksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Task        *shared.Task
}
