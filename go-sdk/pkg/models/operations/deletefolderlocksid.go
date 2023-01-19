package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFolderLocksIDPathParams struct {
	FolderLockID string `pathParam:"style=simple,explode=false,name=folder_lock_id"`
}

type DeleteFolderLocksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFolderLocksIDPathParams
}

type DeleteFolderLocksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
