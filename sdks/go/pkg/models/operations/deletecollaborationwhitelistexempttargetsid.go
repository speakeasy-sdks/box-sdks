package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteCollaborationWhitelistExemptTargetsIDPathParams struct {
	CollaborationWhitelistExemptTargetID string `pathParam:"style=simple,explode=false,name=collaboration_whitelist_exempt_target_id"`
}

type DeleteCollaborationWhitelistExemptTargetsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteCollaborationWhitelistExemptTargetsIDPathParams
}

type DeleteCollaborationWhitelistExemptTargetsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
