package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFileRequestsIDCopyPathParams struct {
	FileRequestID string `pathParam:"style=simple,explode=false,name=file_request_id"`
}

type PostFileRequestsIDCopyRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostFileRequestsIDCopyPathParams
	Request    *shared.FileRequestCopyRequest `request:"mediaType=application/json"`
}

type PostFileRequestsIDCopyResponse struct {
	ClientError *shared.ClientError
	ContentType string
	FileRequest *shared.FileRequest
	StatusCode  int64
}
