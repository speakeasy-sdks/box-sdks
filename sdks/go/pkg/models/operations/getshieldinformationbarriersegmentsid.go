package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarrierSegmentsIDPathParams struct {
	ShieldInformationBarrierSegmentID string `pathParam:"style=simple,explode=false,name=shield_information_barrier_segment_id"`
}

type GetShieldInformationBarrierSegmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetShieldInformationBarrierSegmentsIDPathParams
}

type GetShieldInformationBarrierSegmentsIDResponse struct {
	ClientError                     *shared.ClientError
	ContentType                     string
	ShieldInformationBarrierSegment *shared.ShieldInformationBarrierSegment
	StatusCode                      int64
}
