package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFolderLocksQueryParams struct {
	FolderID string `queryParam:"style=form,explode=true,name=folder_id"`
}

type GetFolderLocksRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetFolderLocksQueryParams
}

type GetFolderLocksResponse struct {
	ClientError *shared.ClientError
	ContentType string
	FolderLocks *shared.FolderLocks
	StatusCode  int64
}
