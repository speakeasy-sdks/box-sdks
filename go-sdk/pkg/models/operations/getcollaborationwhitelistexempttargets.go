package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetCollaborationWhitelistExemptTargetsQueryParams struct {
	Limit  *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker *string `queryParam:"style=form,explode=true,name=marker"`
}

type GetCollaborationWhitelistExemptTargetsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetCollaborationWhitelistExemptTargetsQueryParams
}

type GetCollaborationWhitelistExemptTargetsResponse struct {
	ClientError                         *shared.ClientError
	CollaborationAllowlistExemptTargets *shared.CollaborationAllowlistExemptTargets
	ContentType                         string
	StatusCode                          int64
}
