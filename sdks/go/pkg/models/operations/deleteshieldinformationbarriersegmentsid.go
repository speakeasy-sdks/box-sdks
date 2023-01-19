package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteShieldInformationBarrierSegmentsIDPathParams struct {
	ShieldInformationBarrierSegmentID string `pathParam:"style=simple,explode=false,name=shield_information_barrier_segment_id"`
}

type DeleteShieldInformationBarrierSegmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteShieldInformationBarrierSegmentsIDPathParams
}

type DeleteShieldInformationBarrierSegmentsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
