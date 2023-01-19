package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarriersQueryParams struct {
	Limit  *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker *string `queryParam:"style=form,explode=true,name=marker"`
}

type GetShieldInformationBarriers200ApplicationJSON struct {
	Entries    []shared.ShieldInformationBarrier `json:"entries,omitempty"`
	Limit      *int64                            `json:"limit,omitempty"`
	NextMarker *string                           `json:"next_marker,omitempty"`
}

type GetShieldInformationBarriersRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetShieldInformationBarriersQueryParams
}

type GetShieldInformationBarriersResponse struct {
	ClientError                                          *shared.ClientError
	ContentType                                          string
	StatusCode                                           int64
	GetShieldInformationBarriers200ApplicationJSONObject *GetShieldInformationBarriers200ApplicationJSON
}
