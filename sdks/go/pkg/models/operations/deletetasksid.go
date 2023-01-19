package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteTasksIDPathParams struct {
	TaskID string `pathParam:"style=simple,explode=false,name=task_id"`
}

type DeleteTasksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteTasksIDPathParams
}

type DeleteTasksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
