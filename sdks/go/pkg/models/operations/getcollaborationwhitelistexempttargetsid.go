package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetCollaborationWhitelistExemptTargetsIDPathParams struct {
	CollaborationWhitelistExemptTargetID string `pathParam:"style=simple,explode=false,name=collaboration_whitelist_exempt_target_id"`
}

type GetCollaborationWhitelistExemptTargetsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetCollaborationWhitelistExemptTargetsIDPathParams
}

type GetCollaborationWhitelistExemptTargetsIDResponse struct {
	ClientError                        *shared.ClientError
	CollaborationAllowlistExemptTarget *shared.CollaborationAllowlistExemptTarget
	ContentType                        string
	StatusCode                         int64
}
