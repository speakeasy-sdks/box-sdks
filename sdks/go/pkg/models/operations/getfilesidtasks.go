package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDTasksPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDTasksRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFilesIDTasksPathParams
}

type GetFilesIDTasksResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Tasks       *shared.Tasks
}
