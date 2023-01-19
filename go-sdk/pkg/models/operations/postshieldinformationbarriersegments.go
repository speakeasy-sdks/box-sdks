package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostShieldInformationBarrierSegmentsRequestBody struct {
	Description              *string                             `json:"description,omitempty"`
	Name                     string                              `json:"name"`
	ShieldInformationBarrier shared.ShieldInformationBarrierBase `json:"shield_information_barrier"`
}

type PostShieldInformationBarrierSegmentsRequest struct {
	Retries *utils.RetryConfig
	Request *PostShieldInformationBarrierSegmentsRequestBody `request:"mediaType=application/json"`
}

type PostShieldInformationBarrierSegmentsResponse struct {
	ClientError                     *shared.ClientError
	ContentType                     string
	ShieldInformationBarrierSegment *shared.ShieldInformationBarrierSegment
	StatusCode                      int64
}
