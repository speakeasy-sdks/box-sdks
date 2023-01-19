package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetSignRequestsIDPathParams struct {
	SignRequestID string `pathParam:"style=simple,explode=false,name=sign_request_id"`
}

type GetSignRequestsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetSignRequestsIDPathParams
}

type GetSignRequestsIDResponseOutput struct {
	ClientError *shared.ClientError
	ContentType string
	SignRequest *shared.SignRequestOutput
	StatusCode  int64
}
