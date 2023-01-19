package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetTasksIDAssignmentsPathParams struct {
	TaskID string `pathParam:"style=simple,explode=false,name=task_id"`
}

type GetTasksIDAssignmentsRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetTasksIDAssignmentsPathParams
}

type GetTasksIDAssignmentsResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	StatusCode      int64
	TaskAssignments *shared.TaskAssignments
}
