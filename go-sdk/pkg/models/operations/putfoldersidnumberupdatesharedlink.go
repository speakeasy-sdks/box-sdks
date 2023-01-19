package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutFoldersIDNumberUpdateSharedLinkPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type PutFoldersIDNumberUpdateSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum string

const (
	PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnumOpen          PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum = "open"
	PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnumCompany       PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum = "company"
	PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnumCollaborators PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum = "collaborators"
)

type PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkPermissions struct {
	CanDownload *bool `json:"can_download,omitempty"`
	CanEdit     *bool `json:"can_edit,omitempty"`
	CanPreview  *bool `json:"can_preview,omitempty"`
}

// PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLink
// The settings for the shared link to update.
type PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLink struct {
	Access      *PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum  `json:"access,omitempty"`
	Password    *string                                                             `json:"password,omitempty"`
	Permissions *PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLinkPermissions `json:"permissions,omitempty"`
	UnsharedAt  *time.Time                                                          `json:"unshared_at,omitempty"`
	VanityName  *string                                                             `json:"vanity_name,omitempty"`
}

type PutFoldersIDNumberUpdateSharedLinkRequestBody struct {
	SharedLink *PutFoldersIDNumberUpdateSharedLinkRequestBodySharedLink `json:"shared_link,omitempty"`
}

type PutFoldersIDNumberUpdateSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutFoldersIDNumberUpdateSharedLinkPathParams
	QueryParams PutFoldersIDNumberUpdateSharedLinkQueryParams
	Request     *PutFoldersIDNumberUpdateSharedLinkRequestBody `request:"mediaType=application/json"`
}

type PutFoldersIDNumberUpdateSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
