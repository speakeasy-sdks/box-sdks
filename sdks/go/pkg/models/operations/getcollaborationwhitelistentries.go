package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetCollaborationWhitelistEntriesQueryParams struct {
	Limit  *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker *string `queryParam:"style=form,explode=true,name=marker"`
}

type GetCollaborationWhitelistEntriesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetCollaborationWhitelistEntriesQueryParams
}

type GetCollaborationWhitelistEntriesResponse struct {
	ClientError                   *shared.ClientError
	CollaborationAllowlistEntries *shared.CollaborationAllowlistEntries
	ContentType                   string
	StatusCode                    int64
}
