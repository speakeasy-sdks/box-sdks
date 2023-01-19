package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutFoldersIDPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type PutFoldersIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PutFoldersIDHeaders struct {
	IfMatch *string `header:"style=simple,explode=false,name=if-match"`
}

// PutFoldersIDRequestBodyReference
// The bare basic reference for an object
type PutFoldersIDRequestBodyReference struct {
	ID   *string `json:"id,omitempty"`
	Type *string `json:"type,omitempty"`
}

type PutFoldersIDRequestBodyFolderUploadEmailAccessEnum string

const (
	PutFoldersIDRequestBodyFolderUploadEmailAccessEnumOpen          PutFoldersIDRequestBodyFolderUploadEmailAccessEnum = "open"
	PutFoldersIDRequestBodyFolderUploadEmailAccessEnumCollaborators PutFoldersIDRequestBodyFolderUploadEmailAccessEnum = "collaborators"
)

// PutFoldersIDRequestBodyFolderUploadEmail
// The Write Folder Upload Email object
type PutFoldersIDRequestBodyFolderUploadEmail struct {
	Access *PutFoldersIDRequestBodyFolderUploadEmailAccessEnum `json:"access,omitempty"`
}

// PutFoldersIDRequestBodyParent
// The parent folder for this folder. Use this to move
// the folder or to restore it out of the trash.
type PutFoldersIDRequestBodyParent struct {
	ID *string `json:"id,omitempty"`
}

type PutFoldersIDRequestBodySharedLinkAccessEnum string

const (
	PutFoldersIDRequestBodySharedLinkAccessEnumOpen          PutFoldersIDRequestBodySharedLinkAccessEnum = "open"
	PutFoldersIDRequestBodySharedLinkAccessEnumCompany       PutFoldersIDRequestBodySharedLinkAccessEnum = "company"
	PutFoldersIDRequestBodySharedLinkAccessEnumCollaborators PutFoldersIDRequestBodySharedLinkAccessEnum = "collaborators"
)

type PutFoldersIDRequestBodySharedLinkPermissions struct {
	CanDownload *bool `json:"can_download,omitempty"`
}

// PutFoldersIDRequestBodySharedLink
// Defines a shared link for an item. Set this to `null` to remove
// the shared link.
type PutFoldersIDRequestBodySharedLink struct {
	Access      *PutFoldersIDRequestBodySharedLinkAccessEnum  `json:"access,omitempty"`
	Password    *string                                       `json:"password,omitempty"`
	Permissions *PutFoldersIDRequestBodySharedLinkPermissions `json:"permissions,omitempty"`
	UnsharedAt  *time.Time                                    `json:"unshared_at,omitempty"`
	VanityName  *string                                       `json:"vanity_name,omitempty"`
}

type PutFoldersIDRequestBodySyncStateEnum string

const (
	PutFoldersIDRequestBodySyncStateEnumSynced          PutFoldersIDRequestBodySyncStateEnum = "synced"
	PutFoldersIDRequestBodySyncStateEnumNotSynced       PutFoldersIDRequestBodySyncStateEnum = "not_synced"
	PutFoldersIDRequestBodySyncStateEnumPartiallySynced PutFoldersIDRequestBodySyncStateEnum = "partially_synced"
)

type PutFoldersIDRequestBody struct {
	CanNonOwnersInvite                    *bool                                     `json:"can_non_owners_invite,omitempty"`
	CanNonOwnersViewCollaborators         *bool                                     `json:"can_non_owners_view_collaborators,omitempty"`
	Collections                           []PutFoldersIDRequestBodyReference        `json:"collections,omitempty"`
	Description                           *string                                   `json:"description,omitempty"`
	FolderUploadEmail                     *PutFoldersIDRequestBodyFolderUploadEmail `json:"folder_upload_email,omitempty"`
	IsCollaborationRestrictedToEnterprise *bool                                     `json:"is_collaboration_restricted_to_enterprise,omitempty"`
	Name                                  *string                                   `json:"name,omitempty"`
	Parent                                *PutFoldersIDRequestBodyParent            `json:"parent,omitempty"`
	SharedLink                            *PutFoldersIDRequestBodySharedLink        `json:"shared_link,omitempty"`
	SyncState                             *PutFoldersIDRequestBodySyncStateEnum     `json:"sync_state,omitempty"`
	Tags                                  []string                                  `json:"tags,omitempty"`
}

type PutFoldersIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutFoldersIDPathParams
	QueryParams PutFoldersIDQueryParams
	Headers     PutFoldersIDHeaders
	Request     *PutFoldersIDRequestBody `request:"mediaType=application/json"`
}

type PutFoldersIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
