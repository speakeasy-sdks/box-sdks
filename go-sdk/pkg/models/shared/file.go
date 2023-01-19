package shared

import (
	"time"
)

type FileItemStatusEnum string

const (
	FileItemStatusEnumActive  FileItemStatusEnum = "active"
	FileItemStatusEnumTrashed FileItemStatusEnum = "trashed"
	FileItemStatusEnumDeleted FileItemStatusEnum = "deleted"
)

type FileUserBaseTypeEnum string

const (
	FileUserBaseTypeEnumUser FileUserBaseTypeEnum = "user"
)

// FileUserBase
// The user who last modified this file
type FileUserBase struct {
	ID    *string              `json:"id,omitempty"`
	Login string               `json:"login"`
	Name  string               `json:"name"`
	Type  FileUserBaseTypeEnum `json:"type"`
}

type FileFolderBaseTypeEnum string

const (
	FileFolderBaseTypeEnumFolder FileFolderBaseTypeEnum = "folder"
)

// FileFolderBase
// The folder that this file is located within.
type FileFolderBase struct {
	Etag       *string                `json:"etag,omitempty"`
	ID         string                 `json:"id"`
	Name       *string                `json:"name,omitempty"`
	SequenceID map[string]interface{} `json:"sequence_id,omitempty"`
	Type       FileFolderBaseTypeEnum `json:"type"`
}

// FilePathCollection
// The tree of folders that this file is contained in,
// starting at the root.
type FilePathCollection struct {
	Entries    []FolderMini `json:"entries"`
	TotalCount int64        `json:"total_count"`
}

type FileSharedLinkAccessEnum string

const (
	FileSharedLinkAccessEnumOpen          FileSharedLinkAccessEnum = "open"
	FileSharedLinkAccessEnumCompany       FileSharedLinkAccessEnum = "company"
	FileSharedLinkAccessEnumCollaborators FileSharedLinkAccessEnum = "collaborators"
)

type FileSharedLinkEffectiveAccessEnum string

const (
	FileSharedLinkEffectiveAccessEnumOpen          FileSharedLinkEffectiveAccessEnum = "open"
	FileSharedLinkEffectiveAccessEnumCompany       FileSharedLinkEffectiveAccessEnum = "company"
	FileSharedLinkEffectiveAccessEnumCollaborators FileSharedLinkEffectiveAccessEnum = "collaborators"
)

type FileSharedLinkEffectivePermissionEnum string

const (
	FileSharedLinkEffectivePermissionEnumCanEdit     FileSharedLinkEffectivePermissionEnum = "can_edit"
	FileSharedLinkEffectivePermissionEnumCanDownload FileSharedLinkEffectivePermissionEnum = "can_download"
	FileSharedLinkEffectivePermissionEnumCanPreview  FileSharedLinkEffectivePermissionEnum = "can_preview"
	FileSharedLinkEffectivePermissionEnumNoAccess    FileSharedLinkEffectivePermissionEnum = "no_access"
)

// FileSharedLinkPermissions
// Defines if this link allows a user to preview, edit, and download an item.
// These permissions refer to the shared link only and
// do not supersede permissions applied to the item itself.
type FileSharedLinkPermissions struct {
	CanDownload bool `json:"can_download"`
	CanEdit     bool `json:"can_edit"`
	CanPreview  bool `json:"can_preview"`
}

// FileSharedLink
// The shared link for this file. This will be
// `null` if no shared link has been created for this
// file.
type FileSharedLink struct {
	Access              *FileSharedLinkAccessEnum             `json:"access,omitempty"`
	DownloadCount       int64                                 `json:"download_count"`
	DownloadURL         *string                               `json:"download_url,omitempty"`
	EffectiveAccess     FileSharedLinkEffectiveAccessEnum     `json:"effective_access"`
	EffectivePermission FileSharedLinkEffectivePermissionEnum `json:"effective_permission"`
	IsPasswordEnabled   bool                                  `json:"is_password_enabled"`
	Permissions         *FileSharedLinkPermissions            `json:"permissions,omitempty"`
	PreviewCount        int64                                 `json:"preview_count"`
	UnsharedAt          *time.Time                            `json:"unshared_at,omitempty"`
	URL                 string                                `json:"url"`
	VanityName          *string                               `json:"vanity_name,omitempty"`
	VanityURL           *string                               `json:"vanity_url,omitempty"`
}

type FileTypeEnum string

const (
	FileTypeEnumFile FileTypeEnum = "file"
)

// File
// The bare basic representation of a file, the minimal
// amount of fields returned when using the `fields` query
// parameter.
type File struct {
	ContentCreatedAt  *time.Time             `json:"content_created_at,omitempty"`
	ContentModifiedAt *time.Time             `json:"content_modified_at,omitempty"`
	CreatedAt         time.Time              `json:"created_at"`
	CreatedBy         *UserMini              `json:"created_by,omitempty"`
	Description       string                 `json:"description"`
	Etag              *string                `json:"etag,omitempty"`
	FileVersion       *FileVersionMini       `json:"file_version,omitempty"`
	ID                string                 `json:"id"`
	ItemStatus        FileItemStatusEnum     `json:"item_status"`
	ModifiedAt        time.Time              `json:"modified_at"`
	ModifiedBy        FileUserBase           `json:"modified_by"`
	Name              *string                `json:"name,omitempty"`
	OwnedBy           FileUserBase           `json:"owned_by"`
	Parent            *FileFolderBase        `json:"parent,omitempty"`
	PathCollection    FilePathCollection     `json:"path_collection"`
	PurgedAt          *time.Time             `json:"purged_at,omitempty"`
	SequenceID        map[string]interface{} `json:"sequence_id"`
	Sha1              string                 `json:"sha1"`
	SharedLink        *FileSharedLink        `json:"shared_link,omitempty"`
	Size              int64                  `json:"size"`
	TrashedAt         *time.Time             `json:"trashed_at,omitempty"`
	Type              FileTypeEnum           `json:"type"`
}
