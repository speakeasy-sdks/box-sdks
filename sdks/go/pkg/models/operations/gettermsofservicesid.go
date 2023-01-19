package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetTermsOfServicesIDPathParams struct {
	TermsOfServiceID string `pathParam:"style=simple,explode=false,name=terms_of_service_id"`
}

type GetTermsOfServicesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetTermsOfServicesIDPathParams
}

type GetTermsOfServicesIDResponse struct {
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
	TermsOfService *shared.TermsOfService
}
