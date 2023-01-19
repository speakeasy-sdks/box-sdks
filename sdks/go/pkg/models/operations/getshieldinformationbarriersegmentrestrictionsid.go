package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarrierSegmentRestrictionsIDPathParams struct {
	ShieldInformationBarrierSegmentRestrictionID string `pathParam:"style=simple,explode=false,name=shield_information_barrier_segment_restriction_id"`
}

type GetShieldInformationBarrierSegmentRestrictionsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetShieldInformationBarrierSegmentRestrictionsIDPathParams
}

type GetShieldInformationBarrierSegmentRestrictionsIDResponse struct {
	ClientError                                *shared.ClientError
	ContentType                                string
	ShieldInformationBarrierSegmentRestriction *shared.ShieldInformationBarrierSegmentRestriction
	StatusCode                                 int64
}
