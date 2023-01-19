package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutTermsOfServiceUserStatusesIDPathParams struct {
	TermsOfServiceUserStatusID string `pathParam:"style=simple,explode=false,name=terms_of_service_user_status_id"`
}

type PutTermsOfServiceUserStatusesIDRequestBody struct {
	IsAccepted bool `json:"is_accepted"`
}

type PutTermsOfServiceUserStatusesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutTermsOfServiceUserStatusesIDPathParams
	Request    *PutTermsOfServiceUserStatusesIDRequestBody `request:"mediaType=application/json"`
}

type PutTermsOfServiceUserStatusesIDResponse struct {
	ClientError              *shared.ClientError
	ContentType              string
	StatusCode               int64
	TermsOfServiceUserStatus *shared.TermsOfServiceUserStatus
}
