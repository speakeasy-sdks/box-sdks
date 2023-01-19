package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarrierSegmentRestrictionsQueryParams struct {
	Limit                             *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker                            *string `queryParam:"style=form,explode=true,name=marker"`
	ShieldInformationBarrierSegmentID string  `queryParam:"style=form,explode=true,name=shield_information_barrier_segment_id"`
}

type GetShieldInformationBarrierSegmentRestrictions200ApplicationJSON struct {
	Entries    []shared.ShieldInformationBarrierSegmentRestriction `json:"entries,omitempty"`
	Limit      *int64                                              `json:"limit,omitempty"`
	NextMarker *string                                             `json:"next_marker,omitempty"`
}

type GetShieldInformationBarrierSegmentRestrictionsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetShieldInformationBarrierSegmentRestrictionsQueryParams
}

type GetShieldInformationBarrierSegmentRestrictionsResponse struct {
	ClientError                                                            *shared.ClientError
	ContentType                                                            string
	StatusCode                                                             int64
	GetShieldInformationBarrierSegmentRestrictions200ApplicationJSONObject *GetShieldInformationBarrierSegmentRestrictions200ApplicationJSON
}
