package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetUsersIDMembershipsPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type GetUsersIDMembershipsQueryParams struct {
	Limit  *int64 `queryParam:"style=form,explode=true,name=limit"`
	Offset *int64 `queryParam:"style=form,explode=true,name=offset"`
}

type GetUsersIDMembershipsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetUsersIDMembershipsPathParams
	QueryParams GetUsersIDMembershipsQueryParams
}

type GetUsersIDMembershipsResponse struct {
	ClientError      *shared.ClientError
	ContentType      string
	GroupMemberships *shared.GroupMemberships
	StatusCode       int64
}
