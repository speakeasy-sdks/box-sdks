package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFileRequestsIDPathParams struct {
	FileRequestID string `pathParam:"style=simple,explode=false,name=file_request_id"`
}

type PutFileRequestsIDHeaders struct {
	IfMatch *string `header:"style=simple,explode=false,name=if-match"`
}

type PutFileRequestsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutFileRequestsIDPathParams
	Headers    PutFileRequestsIDHeaders
	Request    *shared.FileRequestUpdateRequest `request:"mediaType=application/json"`
}

type PutFileRequestsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	FileRequest *shared.FileRequest
	StatusCode  int64
}
