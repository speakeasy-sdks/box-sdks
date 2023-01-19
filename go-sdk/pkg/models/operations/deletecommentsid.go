package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteCommentsIDPathParams struct {
	CommentID string `pathParam:"style=simple,explode=false,name=comment_id"`
}

type DeleteCommentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteCommentsIDPathParams
}

type DeleteCommentsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
