package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDWatermarkPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDWatermarkRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFilesIDWatermarkPathParams
}

type GetFilesIDWatermarkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Watermark   *shared.Watermark
}
