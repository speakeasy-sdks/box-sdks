package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetTermsOfServiceUserStatusesQueryParams struct {
	TosID  string  `queryParam:"style=form,explode=true,name=tos_id"`
	UserID *string `queryParam:"style=form,explode=true,name=user_id"`
}

type GetTermsOfServiceUserStatusesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetTermsOfServiceUserStatusesQueryParams
}

type GetTermsOfServiceUserStatusesResponse struct {
	ClientError                *shared.ClientError
	ContentType                string
	StatusCode                 int64
	TermsOfServiceUserStatuses *shared.TermsOfServiceUserStatuses
}
