package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteShieldInformationBarrierSegmentRestrictionsIDPathParams struct {
	ShieldInformationBarrierSegmentRestrictionID string `pathParam:"style=simple,explode=false,name=shield_information_barrier_segment_restriction_id"`
}

type DeleteShieldInformationBarrierSegmentRestrictionsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteShieldInformationBarrierSegmentRestrictionsIDPathParams
}

type DeleteShieldInformationBarrierSegmentRestrictionsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
