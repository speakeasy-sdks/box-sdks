package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersIDTrashPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type GetFoldersIDTrashQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetFoldersIDTrashRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFoldersIDTrashPathParams
	QueryParams GetFoldersIDTrashQueryParams
}

type GetFoldersIDTrashResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	TrashFolder *shared.TrashFolder
}
