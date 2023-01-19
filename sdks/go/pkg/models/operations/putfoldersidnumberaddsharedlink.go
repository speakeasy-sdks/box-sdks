package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutFoldersIDNumberAddSharedLinkPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type PutFoldersIDNumberAddSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum string

const (
	PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnumOpen          PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum = "open"
	PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnumCompany       PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum = "company"
	PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnumCollaborators PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum = "collaborators"
)

type PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkPermissions struct {
	CanDownload *bool `json:"can_download,omitempty"`
	CanEdit     *bool `json:"can_edit,omitempty"`
	CanPreview  *bool `json:"can_preview,omitempty"`
}

// PutFoldersIDNumberAddSharedLinkRequestBodySharedLink
// The settings for the shared link to create on the folder.
//
// Use an empty object (`{}`) to use the default settings for shared
// links.
type PutFoldersIDNumberAddSharedLinkRequestBodySharedLink struct {
	Access      *PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum  `json:"access,omitempty"`
	Password    *string                                                          `json:"password,omitempty"`
	Permissions *PutFoldersIDNumberAddSharedLinkRequestBodySharedLinkPermissions `json:"permissions,omitempty"`
	UnsharedAt  *time.Time                                                       `json:"unshared_at,omitempty"`
	VanityName  *string                                                          `json:"vanity_name,omitempty"`
}

type PutFoldersIDNumberAddSharedLinkRequestBody struct {
	SharedLink *PutFoldersIDNumberAddSharedLinkRequestBodySharedLink `json:"shared_link,omitempty"`
}

type PutFoldersIDNumberAddSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutFoldersIDNumberAddSharedLinkPathParams
	QueryParams PutFoldersIDNumberAddSharedLinkQueryParams
	Request     *PutFoldersIDNumberAddSharedLinkRequestBody `request:"mediaType=application/json"`
}

type PutFoldersIDNumberAddSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
