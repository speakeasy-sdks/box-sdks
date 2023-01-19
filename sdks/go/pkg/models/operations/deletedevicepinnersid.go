package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteDevicePinnersIDPathParams struct {
	DevicePinnerID string `pathParam:"style=simple,explode=false,name=device_pinner_id"`
}

type DeleteDevicePinnersIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteDevicePinnersIDPathParams
}

type DeleteDevicePinnersIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
