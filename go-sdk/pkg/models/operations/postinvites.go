package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostInvitesQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

// PostInvitesRequestBodyActionableBy
// The user to invite
type PostInvitesRequestBodyActionableBy struct {
	Login *string `json:"login,omitempty"`
}

// PostInvitesRequestBodyEnterprise
// The enterprise to invite the user to
type PostInvitesRequestBodyEnterprise struct {
	ID string `json:"id"`
}

type PostInvitesRequestBody struct {
	ActionableBy PostInvitesRequestBodyActionableBy `json:"actionable_by"`
	Enterprise   PostInvitesRequestBodyEnterprise   `json:"enterprise"`
}

type PostInvitesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams PostInvitesQueryParams
	Request     *PostInvitesRequestBody `request:"mediaType=application/json"`
}

type PostInvitesResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Invite      *shared.Invite
	StatusCode  int64
}
