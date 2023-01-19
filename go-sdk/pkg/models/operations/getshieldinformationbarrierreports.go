package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarrierReportsQueryParams struct {
	Limit                      *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker                     *string `queryParam:"style=form,explode=true,name=marker"`
	ShieldInformationBarrierID string  `queryParam:"style=form,explode=true,name=shield_information_barrier_id"`
}

type GetShieldInformationBarrierReports200ApplicationJSON struct {
	Entries    []shared.ShieldInformationBarrierReport `json:"entries,omitempty"`
	Limit      *int64                                  `json:"limit,omitempty"`
	NextMarker *string                                 `json:"next_marker,omitempty"`
}

type GetShieldInformationBarrierReportsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetShieldInformationBarrierReportsQueryParams
}

type GetShieldInformationBarrierReportsResponse struct {
	ClientError                                                *shared.ClientError
	ContentType                                                string
	StatusCode                                                 int64
	GetShieldInformationBarrierReports200ApplicationJSONObject *GetShieldInformationBarrierReports200ApplicationJSON
}
