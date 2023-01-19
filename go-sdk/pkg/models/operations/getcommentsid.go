package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetCommentsIDPathParams struct {
	CommentID string `pathParam:"style=simple,explode=false,name=comment_id"`
}

type GetCommentsIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetCommentsIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetCommentsIDPathParams
	QueryParams GetCommentsIDQueryParams
}

type GetCommentsIDResponse struct {
	ClientError *shared.ClientError
	Comment     *shared.Comment
	ContentType string
	StatusCode  int64
}
