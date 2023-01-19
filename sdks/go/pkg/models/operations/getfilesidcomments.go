package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDCommentsPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDCommentsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64   `queryParam:"style=form,explode=true,name=limit"`
	Offset *int64   `queryParam:"style=form,explode=true,name=offset"`
}

type GetFilesIDCommentsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFilesIDCommentsPathParams
	QueryParams GetFilesIDCommentsQueryParams
}

type GetFilesIDCommentsResponse struct {
	ClientError *shared.ClientError
	Comments    *shared.Comments
	ContentType string
	StatusCode  int64
}
