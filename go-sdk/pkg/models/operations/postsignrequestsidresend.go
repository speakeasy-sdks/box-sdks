package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostSignRequestsIDResendPathParams struct {
	SignRequestID string `pathParam:"style=simple,explode=false,name=sign_request_id"`
}

type PostSignRequestsIDResendRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostSignRequestsIDResendPathParams
}

type PostSignRequestsIDResendResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
