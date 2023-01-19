package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFoldersIDTrashPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type DeleteFoldersIDTrashRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFoldersIDTrashPathParams
}

type DeleteFoldersIDTrashResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
