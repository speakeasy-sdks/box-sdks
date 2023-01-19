package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarriersIDPathParams struct {
	ShieldInformationBarrierID string `pathParam:"style=simple,explode=false,name=shield_information_barrier_id"`
}

type GetShieldInformationBarriersIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetShieldInformationBarriersIDPathParams
}

type GetShieldInformationBarriersIDResponse struct {
	ClientError              *shared.ClientError
	ContentType              string
	ShieldInformationBarrier *shared.ShieldInformationBarrier
	StatusCode               int64
}
