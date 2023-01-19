package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutGroupsIDPathParams struct {
	GroupID string `pathParam:"style=simple,explode=false,name=group_id"`
}

type PutGroupsIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PutGroupsIDRequestBodyInvitabilityLevelEnum string

const (
	PutGroupsIDRequestBodyInvitabilityLevelEnumAdminsOnly       PutGroupsIDRequestBodyInvitabilityLevelEnum = "admins_only"
	PutGroupsIDRequestBodyInvitabilityLevelEnumAdminsAndMembers PutGroupsIDRequestBodyInvitabilityLevelEnum = "admins_and_members"
	PutGroupsIDRequestBodyInvitabilityLevelEnumAllManagedUsers  PutGroupsIDRequestBodyInvitabilityLevelEnum = "all_managed_users"
)

type PutGroupsIDRequestBodyMemberViewabilityLevelEnum string

const (
	PutGroupsIDRequestBodyMemberViewabilityLevelEnumAdminsOnly       PutGroupsIDRequestBodyMemberViewabilityLevelEnum = "admins_only"
	PutGroupsIDRequestBodyMemberViewabilityLevelEnumAdminsAndMembers PutGroupsIDRequestBodyMemberViewabilityLevelEnum = "admins_and_members"
	PutGroupsIDRequestBodyMemberViewabilityLevelEnumAllManagedUsers  PutGroupsIDRequestBodyMemberViewabilityLevelEnum = "all_managed_users"
)

type PutGroupsIDRequestBody struct {
	Description            *string                                           `json:"description,omitempty"`
	ExternalSyncIdentifier *string                                           `json:"external_sync_identifier,omitempty"`
	InvitabilityLevel      *PutGroupsIDRequestBodyInvitabilityLevelEnum      `json:"invitability_level,omitempty"`
	MemberViewabilityLevel *PutGroupsIDRequestBodyMemberViewabilityLevelEnum `json:"member_viewability_level,omitempty"`
	Name                   *string                                           `json:"name,omitempty"`
	Provenance             *string                                           `json:"provenance,omitempty"`
}

type PutGroupsIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutGroupsIDPathParams
	QueryParams PutGroupsIDQueryParams
	Request     *PutGroupsIDRequestBody `request:"mediaType=application/json"`
}

type PutGroupsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Group       *shared.Group
	StatusCode  int64
}
