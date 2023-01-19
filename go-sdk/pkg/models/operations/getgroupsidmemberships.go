package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetGroupsIDMembershipsPathParams struct {
	GroupID string `pathParam:"style=simple,explode=false,name=group_id"`
}

type GetGroupsIDMembershipsQueryParams struct {
	Limit  *int64 `queryParam:"style=form,explode=true,name=limit"`
	Offset *int64 `queryParam:"style=form,explode=true,name=offset"`
}

type GetGroupsIDMembershipsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetGroupsIDMembershipsPathParams
	QueryParams GetGroupsIDMembershipsQueryParams
}

type GetGroupsIDMembershipsResponse struct {
	ClientError      *shared.ClientError
	ContentType      string
	GroupMemberships *shared.GroupMemberships
	StatusCode       int64
}
