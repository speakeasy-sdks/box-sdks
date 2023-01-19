package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteShieldInformationBarrierSegmentMembersIDPathParams struct {
	ShieldInformationBarrierSegmentMemberID string `pathParam:"style=simple,explode=false,name=shield_information_barrier_segment_member_id"`
}

type DeleteShieldInformationBarrierSegmentMembersIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteShieldInformationBarrierSegmentMembersIDPathParams
}

type DeleteShieldInformationBarrierSegmentMembersIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
