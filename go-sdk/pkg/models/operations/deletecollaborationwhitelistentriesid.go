package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteCollaborationWhitelistEntriesIDPathParams struct {
	CollaborationWhitelistEntryID string `pathParam:"style=simple,explode=false,name=collaboration_whitelist_entry_id"`
}

type DeleteCollaborationWhitelistEntriesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteCollaborationWhitelistEntriesIDPathParams
}

type DeleteCollaborationWhitelistEntriesIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
