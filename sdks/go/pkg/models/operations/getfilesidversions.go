package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDVersionsPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDVersionsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64   `queryParam:"style=form,explode=true,name=limit"`
	Offset *int64   `queryParam:"style=form,explode=true,name=offset"`
}

type GetFilesIDVersionsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFilesIDVersionsPathParams
	QueryParams GetFilesIDVersionsQueryParams
}

type GetFilesIDVersionsResponse struct {
	ClientError  *shared.ClientError
	ContentType  string
	FileVersions *shared.FileVersions
	StatusCode   int64
}
