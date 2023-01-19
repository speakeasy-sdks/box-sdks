package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteTaskAssignmentsIDPathParams struct {
	TaskAssignmentID string `pathParam:"style=simple,explode=false,name=task_assignment_id"`
}

type DeleteTaskAssignmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteTaskAssignmentsIDPathParams
}

type DeleteTaskAssignmentsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
