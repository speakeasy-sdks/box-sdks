package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetTaskAssignmentsIDPathParams struct {
	TaskAssignmentID string `pathParam:"style=simple,explode=false,name=task_assignment_id"`
}

type GetTaskAssignmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetTaskAssignmentsIDPathParams
}

type GetTaskAssignmentsIDResponse struct {
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
	TaskAssignment *shared.TaskAssignment
}
