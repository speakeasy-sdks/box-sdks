package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetDevicePinnersIDPathParams struct {
	DevicePinnerID string `pathParam:"style=simple,explode=false,name=device_pinner_id"`
}

type GetDevicePinnersIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetDevicePinnersIDPathParams
}

type GetDevicePinnersIDResponse struct {
	ClientError  *shared.ClientError
	ContentType  string
	DevicePinner *shared.DevicePinner
	StatusCode   int64
}
