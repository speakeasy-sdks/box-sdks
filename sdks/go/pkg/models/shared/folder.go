package shared

import (
	"time"
)

type FolderUserBaseTypeEnum string

const (
	FolderUserBaseTypeEnumUser FolderUserBaseTypeEnum = "user"
)

// FolderUserBase
// The user who created this folder
type FolderUserBase struct {
	ID    *string                `json:"id,omitempty"`
	Login string                 `json:"login"`
	Name  string                 `json:"name"`
	Type  FolderUserBaseTypeEnum `json:"type"`
}

type FolderFolderUploadEmailAccessEnum string

const (
	FolderFolderUploadEmailAccessEnumOpen          FolderFolderUploadEmailAccessEnum = "open"
	FolderFolderUploadEmailAccessEnumCollaborators FolderFolderUploadEmailAccessEnum = "collaborators"
)

type FolderFolderUploadEmail struct {
	Access *FolderFolderUploadEmailAccessEnum `json:"access,omitempty"`
	Email  *string                            `json:"email,omitempty"`
}

type FolderItemsOrderDirectionEnum string

const (
	FolderItemsOrderDirectionEnumAsc  FolderItemsOrderDirectionEnum = "ASC"
	FolderItemsOrderDirectionEnumDesc FolderItemsOrderDirectionEnum = "DESC"
)

// FolderItemsOrder
// The order in which a pagination is ordered
type FolderItemsOrder struct {
	By        *string                        `json:"by,omitempty"`
	Direction *FolderItemsOrderDirectionEnum `json:"direction,omitempty"`
}

// FolderItems
// A page of the items that are in the folder.
//
// This field can only be requested when querying a folder's
// information, not when querying a folder's items.
type FolderItems struct {
	Entries    []interface{}      `json:"entries,omitempty"`
	Limit      *int64             `json:"limit,omitempty"`
	Offset     *int64             `json:"offset,omitempty"`
	Order      []FolderItemsOrder `json:"order,omitempty"`
	TotalCount *int64             `json:"total_count,omitempty"`
}

type FolderItemStatusEnum string

const (
	FolderItemStatusEnumActive  FolderItemStatusEnum = "active"
	FolderItemStatusEnumTrashed FolderItemStatusEnum = "trashed"
	FolderItemStatusEnumDeleted FolderItemStatusEnum = "deleted"
)

type FolderFolderBaseTypeEnum string

const (
	FolderFolderBaseTypeEnumFolder FolderFolderBaseTypeEnum = "folder"
)

// FolderFolderBase
// The optional folder that this folder is located within.
//
// This value may be `null` for some folders such as the
// root folder or the trash folder.
type FolderFolderBase struct {
	Etag       *string                  `json:"etag,omitempty"`
	ID         string                   `json:"id"`
	Name       *string                  `json:"name,omitempty"`
	SequenceID map[string]interface{}   `json:"sequence_id,omitempty"`
	Type       FolderFolderBaseTypeEnum `json:"type"`
}

// FolderPathCollection
// The tree of folders that this folder is contained in,
// starting at the root.
type FolderPathCollection struct {
	Entries    []FolderMini `json:"entries"`
	TotalCount int64        `json:"total_count"`
}

type FolderSharedLinkAccessEnum string

const (
	FolderSharedLinkAccessEnumOpen          FolderSharedLinkAccessEnum = "open"
	FolderSharedLinkAccessEnumCompany       FolderSharedLinkAccessEnum = "company"
	FolderSharedLinkAccessEnumCollaborators FolderSharedLinkAccessEnum = "collaborators"
)

type FolderSharedLinkEffectiveAccessEnum string

const (
	FolderSharedLinkEffectiveAccessEnumOpen          FolderSharedLinkEffectiveAccessEnum = "open"
	FolderSharedLinkEffectiveAccessEnumCompany       FolderSharedLinkEffectiveAccessEnum = "company"
	FolderSharedLinkEffectiveAccessEnumCollaborators FolderSharedLinkEffectiveAccessEnum = "collaborators"
)

type FolderSharedLinkEffectivePermissionEnum string

const (
	FolderSharedLinkEffectivePermissionEnumCanEdit     FolderSharedLinkEffectivePermissionEnum = "can_edit"
	FolderSharedLinkEffectivePermissionEnumCanDownload FolderSharedLinkEffectivePermissionEnum = "can_download"
	FolderSharedLinkEffectivePermissionEnumCanPreview  FolderSharedLinkEffectivePermissionEnum = "can_preview"
	FolderSharedLinkEffectivePermissionEnumNoAccess    FolderSharedLinkEffectivePermissionEnum = "no_access"
)

// FolderSharedLinkPermissions
// Defines if this link allows a user to preview, edit, and download an item.
// These permissions refer to the shared link only and
// do not supersede permissions applied to the item itself.
type FolderSharedLinkPermissions struct {
	CanDownload bool `json:"can_download"`
	CanEdit     bool `json:"can_edit"`
	CanPreview  bool `json:"can_preview"`
}

// FolderSharedLink
// The shared link for this folder. This will be
// `null` if no shared link has been created for this
// folder.
type FolderSharedLink struct {
	Access              *FolderSharedLinkAccessEnum             `json:"access,omitempty"`
	DownloadCount       int64                                   `json:"download_count"`
	DownloadURL         *string                                 `json:"download_url,omitempty"`
	EffectiveAccess     FolderSharedLinkEffectiveAccessEnum     `json:"effective_access"`
	EffectivePermission FolderSharedLinkEffectivePermissionEnum `json:"effective_permission"`
	IsPasswordEnabled   bool                                    `json:"is_password_enabled"`
	Permissions         *FolderSharedLinkPermissions            `json:"permissions,omitempty"`
	PreviewCount        int64                                   `json:"preview_count"`
	UnsharedAt          *time.Time                              `json:"unshared_at,omitempty"`
	URL                 string                                  `json:"url"`
	VanityName          *string                                 `json:"vanity_name,omitempty"`
	VanityURL           *string                                 `json:"vanity_url,omitempty"`
}

type FolderTypeEnum string

const (
	FolderTypeEnumFolder FolderTypeEnum = "folder"
)

// Folder
// The bare basic representation of a folder, the minimal
// amount of fields returned when using the `fields` query
// parameter.
type Folder struct {
	ContentCreatedAt  *time.Time               `json:"content_created_at,omitempty"`
	ContentModifiedAt *time.Time               `json:"content_modified_at,omitempty"`
	CreatedAt         *time.Time               `json:"created_at,omitempty"`
	CreatedBy         FolderUserBase           `json:"created_by"`
	Description       map[string]interface{}   `json:"description,omitempty"`
	Etag              *string                  `json:"etag,omitempty"`
	FolderUploadEmail *FolderFolderUploadEmail `json:"folder_upload_email,omitempty"`
	ID                string                   `json:"id"`
	ItemCollection    FolderItems              `json:"item_collection"`
	ItemStatus        FolderItemStatusEnum     `json:"item_status"`
	ModifiedAt        *time.Time               `json:"modified_at,omitempty"`
	ModifiedBy        FolderUserBase           `json:"modified_by"`
	Name              *string                  `json:"name,omitempty"`
	OwnedBy           FolderUserBase           `json:"owned_by"`
	Parent            *FolderFolderBase        `json:"parent,omitempty"`
	PathCollection    FolderPathCollection     `json:"path_collection"`
	PurgedAt          *time.Time               `json:"purged_at,omitempty"`
	SequenceID        map[string]interface{}   `json:"sequence_id,omitempty"`
	SharedLink        *FolderSharedLink        `json:"shared_link,omitempty"`
	Size              int64                    `json:"size"`
	TrashedAt         *time.Time               `json:"trashed_at,omitempty"`
	Type              FolderTypeEnum           `json:"type"`
}
