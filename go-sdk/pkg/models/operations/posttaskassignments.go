package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

// PostTaskAssignmentsRequestBodyAssignTo
// The user to assign the task to.
type PostTaskAssignmentsRequestBodyAssignTo struct {
	ID    *string `json:"id,omitempty"`
	Login *string `json:"login,omitempty"`
}

type PostTaskAssignmentsRequestBodyTaskTypeEnum string

const (
	PostTaskAssignmentsRequestBodyTaskTypeEnumTask PostTaskAssignmentsRequestBodyTaskTypeEnum = "task"
)

// PostTaskAssignmentsRequestBodyTask
// The task to assign to a user.
type PostTaskAssignmentsRequestBodyTask struct {
	ID   string                                     `json:"id"`
	Type PostTaskAssignmentsRequestBodyTaskTypeEnum `json:"type"`
}

type PostTaskAssignmentsRequestBody struct {
	AssignTo PostTaskAssignmentsRequestBodyAssignTo `json:"assign_to"`
	Task     PostTaskAssignmentsRequestBodyTask     `json:"task"`
}

type PostTaskAssignmentsRequest struct {
	Retries *utils.RetryConfig
	Request *PostTaskAssignmentsRequestBody `request:"mediaType=application/json"`
}

type PostTaskAssignmentsResponse struct {
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
	TaskAssignment *shared.TaskAssignment
}
