package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteGroupMembershipsIDPathParams struct {
	GroupMembershipID string `pathParam:"style=simple,explode=false,name=group_membership_id"`
}

type DeleteGroupMembershipsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteGroupMembershipsIDPathParams
}

type DeleteGroupMembershipsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
