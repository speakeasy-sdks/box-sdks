package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarrierSegmentsQueryParams struct {
	Limit                      *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker                     *string `queryParam:"style=form,explode=true,name=marker"`
	ShieldInformationBarrierID string  `queryParam:"style=form,explode=true,name=shield_information_barrier_id"`
}

type GetShieldInformationBarrierSegments200ApplicationJSON struct {
	Entries    []shared.ShieldInformationBarrierSegment `json:"entries,omitempty"`
	Limit      *int64                                   `json:"limit,omitempty"`
	NextMarker *string                                  `json:"next_marker,omitempty"`
}

type GetShieldInformationBarrierSegmentsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetShieldInformationBarrierSegmentsQueryParams
}

type GetShieldInformationBarrierSegmentsResponse struct {
	ClientError                                                 *shared.ClientError
	ContentType                                                 string
	StatusCode                                                  int64
	GetShieldInformationBarrierSegments200ApplicationJSONObject *GetShieldInformationBarrierSegments200ApplicationJSON
}
