package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostShieldInformationBarriersRequest struct {
	Retries *utils.RetryConfig
	Request *shared.ShieldInformationBarrier `request:"mediaType=application/json"`
}

type PostShieldInformationBarriersResponse struct {
	ClientError              *shared.ClientError
	ContentType              string
	ShieldInformationBarrier *shared.ShieldInformationBarrier
	StatusCode               int64
}
