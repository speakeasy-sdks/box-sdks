package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFileRequestsIDPathParams struct {
	FileRequestID string `pathParam:"style=simple,explode=false,name=file_request_id"`
}

type GetFileRequestsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFileRequestsIDPathParams
}

type GetFileRequestsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	FileRequest *shared.FileRequest
	StatusCode  int64
}
