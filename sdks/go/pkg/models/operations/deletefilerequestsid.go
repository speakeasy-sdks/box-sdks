package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFileRequestsIDPathParams struct {
	FileRequestID string `pathParam:"style=simple,explode=false,name=file_request_id"`
}

type DeleteFileRequestsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFileRequestsIDPathParams
}

type DeleteFileRequestsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
