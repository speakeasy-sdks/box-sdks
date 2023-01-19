package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetCollaborationWhitelistEntriesIDPathParams struct {
	CollaborationWhitelistEntryID string `pathParam:"style=simple,explode=false,name=collaboration_whitelist_entry_id"`
}

type GetCollaborationWhitelistEntriesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetCollaborationWhitelistEntriesIDPathParams
}

type GetCollaborationWhitelistEntriesIDResponse struct {
	ClientError                 *shared.ClientError
	CollaborationAllowlistEntry *shared.CollaborationAllowlistEntry
	ContentType                 string
	StatusCode                  int64
}
