package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetEnterprisesIDDevicePinnersPathParams struct {
	EnterpriseID string `pathParam:"style=simple,explode=false,name=enterprise_id"`
}

type GetEnterprisesIDDevicePinnersDirectionEnum string

const (
	GetEnterprisesIDDevicePinnersDirectionEnumAsc  GetEnterprisesIDDevicePinnersDirectionEnum = "ASC"
	GetEnterprisesIDDevicePinnersDirectionEnumDesc GetEnterprisesIDDevicePinnersDirectionEnum = "DESC"
)

type GetEnterprisesIDDevicePinnersQueryParams struct {
	Direction *GetEnterprisesIDDevicePinnersDirectionEnum `queryParam:"style=form,explode=true,name=direction"`
	Limit     *int64                                      `queryParam:"style=form,explode=true,name=limit"`
	Marker    *string                                     `queryParam:"style=form,explode=true,name=marker"`
}

type GetEnterprisesIDDevicePinnersRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetEnterprisesIDDevicePinnersPathParams
	QueryParams GetEnterprisesIDDevicePinnersQueryParams
}

type GetEnterprisesIDDevicePinnersResponse struct {
	ClientError   *shared.ClientError
	ContentType   string
	DevicePinners *shared.DevicePinners
	StatusCode    int64
}
