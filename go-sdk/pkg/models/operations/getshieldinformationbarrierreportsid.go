package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetShieldInformationBarrierReportsIDPathParams struct {
	ShieldInformationBarrierReportID string `pathParam:"style=simple,explode=false,name=shield_information_barrier_report_id"`
}

type GetShieldInformationBarrierReportsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetShieldInformationBarrierReportsIDPathParams
}

type GetShieldInformationBarrierReportsIDResponse struct {
	ClientError                    *shared.ClientError
	ContentType                    string
	ShieldInformationBarrierReport *shared.ShieldInformationBarrierReport
	StatusCode                     int64
}
