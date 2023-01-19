package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostGroupsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PostGroupsRequestBodyInvitabilityLevelEnum string

const (
	PostGroupsRequestBodyInvitabilityLevelEnumAdminsOnly       PostGroupsRequestBodyInvitabilityLevelEnum = "admins_only"
	PostGroupsRequestBodyInvitabilityLevelEnumAdminsAndMembers PostGroupsRequestBodyInvitabilityLevelEnum = "admins_and_members"
	PostGroupsRequestBodyInvitabilityLevelEnumAllManagedUsers  PostGroupsRequestBodyInvitabilityLevelEnum = "all_managed_users"
)

type PostGroupsRequestBodyMemberViewabilityLevelEnum string

const (
	PostGroupsRequestBodyMemberViewabilityLevelEnumAdminsOnly       PostGroupsRequestBodyMemberViewabilityLevelEnum = "admins_only"
	PostGroupsRequestBodyMemberViewabilityLevelEnumAdminsAndMembers PostGroupsRequestBodyMemberViewabilityLevelEnum = "admins_and_members"
	PostGroupsRequestBodyMemberViewabilityLevelEnumAllManagedUsers  PostGroupsRequestBodyMemberViewabilityLevelEnum = "all_managed_users"
)

type PostGroupsRequestBody struct {
	Description            *string                                          `json:"description,omitempty"`
	ExternalSyncIdentifier *string                                          `json:"external_sync_identifier,omitempty"`
	InvitabilityLevel      *PostGroupsRequestBodyInvitabilityLevelEnum      `json:"invitability_level,omitempty"`
	MemberViewabilityLevel *PostGroupsRequestBodyMemberViewabilityLevelEnum `json:"member_viewability_level,omitempty"`
	Name                   string                                           `json:"name"`
	Provenance             *string                                          `json:"provenance,omitempty"`
}

type PostGroupsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams PostGroupsQueryParams
	Request     *PostGroupsRequestBody `request:"mediaType=application/json"`
}

type PostGroupsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Group       *shared.Group
	StatusCode  int64
}
