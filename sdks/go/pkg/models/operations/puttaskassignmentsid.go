package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutTaskAssignmentsIDPathParams struct {
	TaskAssignmentID string `pathParam:"style=simple,explode=false,name=task_assignment_id"`
}

type PutTaskAssignmentsIDRequestBodyResolutionStateEnum string

const (
	PutTaskAssignmentsIDRequestBodyResolutionStateEnumCompleted  PutTaskAssignmentsIDRequestBodyResolutionStateEnum = "completed"
	PutTaskAssignmentsIDRequestBodyResolutionStateEnumIncomplete PutTaskAssignmentsIDRequestBodyResolutionStateEnum = "incomplete"
	PutTaskAssignmentsIDRequestBodyResolutionStateEnumApproved   PutTaskAssignmentsIDRequestBodyResolutionStateEnum = "approved"
	PutTaskAssignmentsIDRequestBodyResolutionStateEnumRejected   PutTaskAssignmentsIDRequestBodyResolutionStateEnum = "rejected"
)

type PutTaskAssignmentsIDRequestBody struct {
	Message         *string                                             `json:"message,omitempty"`
	ResolutionState *PutTaskAssignmentsIDRequestBodyResolutionStateEnum `json:"resolution_state,omitempty"`
}

type PutTaskAssignmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutTaskAssignmentsIDPathParams
	Request    *PutTaskAssignmentsIDRequestBody `request:"mediaType=application/json"`
}

type PutTaskAssignmentsIDResponse struct {
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
	TaskAssignment *shared.TaskAssignment
}
