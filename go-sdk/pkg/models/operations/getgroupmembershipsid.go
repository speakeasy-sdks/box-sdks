package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetGroupMembershipsIDPathParams struct {
	GroupMembershipID string `pathParam:"style=simple,explode=false,name=group_membership_id"`
}

type GetGroupMembershipsIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetGroupMembershipsIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetGroupMembershipsIDPathParams
	QueryParams GetGroupMembershipsIDQueryParams
}

type GetGroupMembershipsIDResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	GroupMembership *shared.GroupMembership
	StatusCode      int64
}
