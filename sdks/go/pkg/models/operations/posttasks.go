package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PostTasksRequestBodyActionEnum string

const (
	PostTasksRequestBodyActionEnumReview   PostTasksRequestBodyActionEnum = "review"
	PostTasksRequestBodyActionEnumComplete PostTasksRequestBodyActionEnum = "complete"
)

type PostTasksRequestBodyCompletionRuleEnum string

const (
	PostTasksRequestBodyCompletionRuleEnumAllAssignees PostTasksRequestBodyCompletionRuleEnum = "all_assignees"
	PostTasksRequestBodyCompletionRuleEnumAnyAssignee  PostTasksRequestBodyCompletionRuleEnum = "any_assignee"
)

type PostTasksRequestBodyItemTypeEnum string

const (
	PostTasksRequestBodyItemTypeEnumFile PostTasksRequestBodyItemTypeEnum = "file"
)

// PostTasksRequestBodyItem
// The file to attach the task to.
type PostTasksRequestBodyItem struct {
	ID   string                           `json:"id"`
	Type PostTasksRequestBodyItemTypeEnum `json:"type"`
}

type PostTasksRequestBody struct {
	Action         *PostTasksRequestBodyActionEnum         `json:"action,omitempty"`
	CompletionRule *PostTasksRequestBodyCompletionRuleEnum `json:"completion_rule,omitempty"`
	DueAt          *time.Time                              `json:"due_at,omitempty"`
	Item           PostTasksRequestBodyItem                `json:"item"`
	Message        *string                                 `json:"message,omitempty"`
}

type PostTasksRequest struct {
	Retries *utils.RetryConfig
	Request *PostTasksRequestBody `request:"mediaType=application/json"`
}

type PostTasksResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Task        *shared.Task
}
