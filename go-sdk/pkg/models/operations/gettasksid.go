package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetTasksIDPathParams struct {
	TaskID string `pathParam:"style=simple,explode=false,name=task_id"`
}

type GetTasksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetTasksIDPathParams
}

type GetTasksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Task        *shared.Task
}
