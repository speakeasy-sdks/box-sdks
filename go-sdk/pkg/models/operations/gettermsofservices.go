package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetTermsOfServicesTosTypeEnum string

const (
	GetTermsOfServicesTosTypeEnumExternal GetTermsOfServicesTosTypeEnum = "external"
	GetTermsOfServicesTosTypeEnumManaged  GetTermsOfServicesTosTypeEnum = "managed"
)

type GetTermsOfServicesQueryParams struct {
	TosType *GetTermsOfServicesTosTypeEnum `queryParam:"style=form,explode=true,name=tos_type"`
}

type GetTermsOfServicesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetTermsOfServicesQueryParams
}

type GetTermsOfServicesResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	StatusCode      int64
	TermsOfServices *shared.TermsOfServices
}
