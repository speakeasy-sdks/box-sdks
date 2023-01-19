package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostSignRequestsRequest struct {
	Retries *utils.RetryConfig
	Request *shared.SignRequestCreateRequest `request:"mediaType=application/json"`
}

type PostSignRequestsResponseOutput struct {
	ClientError *shared.ClientError
	ContentType string
	SignRequest *shared.SignRequestOutput
	StatusCode  int64
}
