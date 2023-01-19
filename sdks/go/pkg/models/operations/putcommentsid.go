package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutCommentsIDPathParams struct {
	CommentID string `pathParam:"style=simple,explode=false,name=comment_id"`
}

type PutCommentsIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PutCommentsIDRequestBody struct {
	Message *string `json:"message,omitempty"`
}

type PutCommentsIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutCommentsIDPathParams
	QueryParams PutCommentsIDQueryParams
	Request     *PutCommentsIDRequestBody `request:"mediaType=application/json"`
}

type PutCommentsIDResponse struct {
	ClientError *shared.ClientError
	Comment     *shared.Comment
	ContentType string
	StatusCode  int64
}
