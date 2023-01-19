package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersIDWatermarkPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type GetFoldersIDWatermarkRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFoldersIDWatermarkPathParams
}

type GetFoldersIDWatermarkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Watermark   *shared.Watermark
}
