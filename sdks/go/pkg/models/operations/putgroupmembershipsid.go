package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutGroupMembershipsIDPathParams struct {
	GroupMembershipID string `pathParam:"style=simple,explode=false,name=group_membership_id"`
}

type PutGroupMembershipsIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PutGroupMembershipsIDRequestBodyRoleEnum string

const (
	PutGroupMembershipsIDRequestBodyRoleEnumMember PutGroupMembershipsIDRequestBodyRoleEnum = "member"
	PutGroupMembershipsIDRequestBodyRoleEnumAdmin  PutGroupMembershipsIDRequestBodyRoleEnum = "admin"
)

type PutGroupMembershipsIDRequestBody struct {
	ConfigurablePermissions map[string]bool                           `json:"configurable_permissions,omitempty"`
	Role                    *PutGroupMembershipsIDRequestBodyRoleEnum `json:"role,omitempty"`
}

type PutGroupMembershipsIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutGroupMembershipsIDPathParams
	QueryParams PutGroupMembershipsIDQueryParams
	Request     *PutGroupMembershipsIDRequestBody `request:"mediaType=application/json"`
}

type PutGroupMembershipsIDResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	GroupMembership *shared.GroupMembership
	StatusCode      int64
}
