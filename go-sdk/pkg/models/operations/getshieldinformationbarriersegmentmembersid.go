package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarrierSegmentMembersIDPathParams struct {
	ShieldInformationBarrierSegmentMemberID string `pathParam:"style=simple,explode=false,name=shield_information_barrier_segment_member_id"`
}

type GetShieldInformationBarrierSegmentMembersIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetShieldInformationBarrierSegmentMembersIDPathParams
}

type GetShieldInformationBarrierSegmentMembersIDResponse struct {
	ClientError                           *shared.ClientError
	ContentType                           string
	ShieldInformationBarrierSegmentMember *shared.ShieldInformationBarrierSegmentMember
	StatusCode                            int64
}
