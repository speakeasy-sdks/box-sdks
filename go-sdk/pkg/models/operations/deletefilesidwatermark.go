package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFilesIDWatermarkPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type DeleteFilesIDWatermarkRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFilesIDWatermarkPathParams
}

type DeleteFilesIDWatermarkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
