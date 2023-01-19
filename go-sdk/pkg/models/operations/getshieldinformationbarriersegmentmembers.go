package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarrierSegmentMembersQueryParams struct {
	Limit                             *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker                            *string `queryParam:"style=form,explode=true,name=marker"`
	ShieldInformationBarrierSegmentID string  `queryParam:"style=form,explode=true,name=shield_information_barrier_segment_id"`
}

type GetShieldInformationBarrierSegmentMembers200ApplicationJSON struct {
	Entries    []shared.ShieldInformationBarrierSegmentMember `json:"entries,omitempty"`
	Limit      *int64                                         `json:"limit,omitempty"`
	NextMarker *string                                        `json:"next_marker,omitempty"`
}

type GetShieldInformationBarrierSegmentMembersRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetShieldInformationBarrierSegmentMembersQueryParams
}

type GetShieldInformationBarrierSegmentMembersResponse struct {
	ClientError                                                       *shared.ClientError
	ContentType                                                       string
	StatusCode                                                        int64
	GetShieldInformationBarrierSegmentMembers200ApplicationJSONObject *GetShieldInformationBarrierSegmentMembers200ApplicationJSON
}
