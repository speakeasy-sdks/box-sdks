package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostSignRequestsIDCancelPathParams struct {
	SignRequestID string `pathParam:"style=simple,explode=false,name=sign_request_id"`
}

type PostSignRequestsIDCancelRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostSignRequestsIDCancelPathParams
}

type PostSignRequestsIDCancelResponseOutput struct {
	ClientError *shared.ClientError
	ContentType string
	SignRequest *shared.SignRequestOutput
	StatusCode  int64
}
