package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDTrashPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDTrashQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetFilesIDTrashRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFilesIDTrashPathParams
	QueryParams GetFilesIDTrashQueryParams
}

type GetFilesIDTrashResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	TrashFile   *shared.TrashFile
}
