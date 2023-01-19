package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

// PostCollaborationWhitelistExemptTargetsRequestBodyUser
// The user to exempt.
type PostCollaborationWhitelistExemptTargetsRequestBodyUser struct {
	ID string `json:"id"`
}

type PostCollaborationWhitelistExemptTargetsRequestBody struct {
	User PostCollaborationWhitelistExemptTargetsRequestBodyUser `json:"user"`
}

type PostCollaborationWhitelistExemptTargetsRequest struct {
	Retries *utils.RetryConfig
	Request *PostCollaborationWhitelistExemptTargetsRequestBody `request:"mediaType=application/json"`
}

type PostCollaborationWhitelistExemptTargetsResponse struct {
	ClientError                        *shared.ClientError
	CollaborationAllowlistExemptTarget *shared.CollaborationAllowlistExemptTarget
	ContentType                        string
	StatusCode                         int64
}
