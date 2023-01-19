package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFoldersIDWatermarkPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type DeleteFoldersIDWatermarkRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFoldersIDWatermarkPathParams
}

type DeleteFoldersIDWatermarkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
