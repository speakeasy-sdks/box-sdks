package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostGroupMembershipsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

// PostGroupMembershipsRequestBodyGroup
// The group to add the user to.
type PostGroupMembershipsRequestBodyGroup struct {
	ID string `json:"id"`
}

type PostGroupMembershipsRequestBodyRoleEnum string

const (
	PostGroupMembershipsRequestBodyRoleEnumMember PostGroupMembershipsRequestBodyRoleEnum = "member"
	PostGroupMembershipsRequestBodyRoleEnumAdmin  PostGroupMembershipsRequestBodyRoleEnum = "admin"
)

// PostGroupMembershipsRequestBodyUser
// The user to add to the group.
type PostGroupMembershipsRequestBodyUser struct {
	ID string `json:"id"`
}

type PostGroupMembershipsRequestBody struct {
	ConfigurablePermissions map[string]bool                          `json:"configurable_permissions,omitempty"`
	Group                   PostGroupMembershipsRequestBodyGroup     `json:"group"`
	Role                    *PostGroupMembershipsRequestBodyRoleEnum `json:"role,omitempty"`
	User                    PostGroupMembershipsRequestBodyUser      `json:"user"`
}

type PostGroupMembershipsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams PostGroupMembershipsQueryParams
	Request     *PostGroupMembershipsRequestBody `request:"mediaType=application/json"`
}

type PostGroupMembershipsResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	GroupMembership *shared.GroupMembership
	StatusCode      int64
}
