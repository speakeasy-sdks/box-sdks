package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetInvitesIDPathParams struct {
	InviteID string `pathParam:"style=simple,explode=false,name=invite_id"`
}

type GetInvitesIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetInvitesIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetInvitesIDPathParams
	QueryParams GetInvitesIDQueryParams
}

type GetInvitesIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Invite      *shared.Invite
	StatusCode  int64
}
