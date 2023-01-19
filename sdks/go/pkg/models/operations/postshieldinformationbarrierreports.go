package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostShieldInformationBarrierReportsRequest struct {
	Retries *utils.RetryConfig
	Request *shared.ShieldInformationBarrierReference `request:"mediaType=application/json"`
}

type PostShieldInformationBarrierReportsResponse struct {
	ClientError                    *shared.ClientError
	ContentType                    string
	ShieldInformationBarrierReport *shared.ShieldInformationBarrierReport
	StatusCode                     int64
}
