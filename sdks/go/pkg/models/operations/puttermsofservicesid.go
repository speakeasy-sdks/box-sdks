package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutTermsOfServicesIDPathParams struct {
	TermsOfServiceID string `pathParam:"style=simple,explode=false,name=terms_of_service_id"`
}

type PutTermsOfServicesIDRequestBodyStatusEnum string

const (
	PutTermsOfServicesIDRequestBodyStatusEnumEnabled  PutTermsOfServicesIDRequestBodyStatusEnum = "enabled"
	PutTermsOfServicesIDRequestBodyStatusEnumDisabled PutTermsOfServicesIDRequestBodyStatusEnum = "disabled"
)

type PutTermsOfServicesIDRequestBody struct {
	Status PutTermsOfServicesIDRequestBodyStatusEnum `json:"status"`
	Text   string                                    `json:"text"`
}

type PutTermsOfServicesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutTermsOfServicesIDPathParams
	Request    *PutTermsOfServicesIDRequestBody `request:"mediaType=application/json"`
}

type PutTermsOfServicesIDResponse struct {
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
	TermsOfService *shared.TermsOfService
}
