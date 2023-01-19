package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostCollaborationWhitelistEntriesRequestBodyDirectionEnum string

const (
	PostCollaborationWhitelistEntriesRequestBodyDirectionEnumInbound  PostCollaborationWhitelistEntriesRequestBodyDirectionEnum = "inbound"
	PostCollaborationWhitelistEntriesRequestBodyDirectionEnumOutbound PostCollaborationWhitelistEntriesRequestBodyDirectionEnum = "outbound"
	PostCollaborationWhitelistEntriesRequestBodyDirectionEnumBoth     PostCollaborationWhitelistEntriesRequestBodyDirectionEnum = "both"
)

type PostCollaborationWhitelistEntriesRequestBody struct {
	Direction PostCollaborationWhitelistEntriesRequestBodyDirectionEnum `json:"direction"`
	Domain    string                                                    `json:"domain"`
}

type PostCollaborationWhitelistEntriesRequest struct {
	Retries *utils.RetryConfig
	Request *PostCollaborationWhitelistEntriesRequestBody `request:"mediaType=application/json"`
}

type PostCollaborationWhitelistEntriesResponse struct {
	ClientError                 *shared.ClientError
	CollaborationAllowlistEntry *shared.CollaborationAllowlistEntry
	ContentType                 string
	StatusCode                  int64
}
