package shared

import (
	"time"
)

type WebLinkItemStatusEnum string

const (
	WebLinkItemStatusEnumActive  WebLinkItemStatusEnum = "active"
	WebLinkItemStatusEnumTrashed WebLinkItemStatusEnum = "trashed"
	WebLinkItemStatusEnumDeleted WebLinkItemStatusEnum = "deleted"
)

// WebLinkPathCollection
// The tree of folders that this web link is contained in,
// starting at the root.
type WebLinkPathCollection struct {
	Entries    []FolderMini `json:"entries"`
	TotalCount int64        `json:"total_count"`
}

type WebLinkSharedLinkAccessEnum string

const (
	WebLinkSharedLinkAccessEnumOpen          WebLinkSharedLinkAccessEnum = "open"
	WebLinkSharedLinkAccessEnumCompany       WebLinkSharedLinkAccessEnum = "company"
	WebLinkSharedLinkAccessEnumCollaborators WebLinkSharedLinkAccessEnum = "collaborators"
)

type WebLinkSharedLinkEffectiveAccessEnum string

const (
	WebLinkSharedLinkEffectiveAccessEnumOpen          WebLinkSharedLinkEffectiveAccessEnum = "open"
	WebLinkSharedLinkEffectiveAccessEnumCompany       WebLinkSharedLinkEffectiveAccessEnum = "company"
	WebLinkSharedLinkEffectiveAccessEnumCollaborators WebLinkSharedLinkEffectiveAccessEnum = "collaborators"
)

type WebLinkSharedLinkEffectivePermissionEnum string

const (
	WebLinkSharedLinkEffectivePermissionEnumCanEdit     WebLinkSharedLinkEffectivePermissionEnum = "can_edit"
	WebLinkSharedLinkEffectivePermissionEnumCanDownload WebLinkSharedLinkEffectivePermissionEnum = "can_download"
	WebLinkSharedLinkEffectivePermissionEnumCanPreview  WebLinkSharedLinkEffectivePermissionEnum = "can_preview"
	WebLinkSharedLinkEffectivePermissionEnumNoAccess    WebLinkSharedLinkEffectivePermissionEnum = "no_access"
)

// WebLinkSharedLinkPermissions
// Defines if this link allows a user to preview, edit, and download an item.
// These permissions refer to the shared link only and
// do not supersede permissions applied to the item itself.
type WebLinkSharedLinkPermissions struct {
	CanDownload bool `json:"can_download"`
	CanEdit     bool `json:"can_edit"`
	CanPreview  bool `json:"can_preview"`
}

// WebLinkSharedLink
// The shared link object for this item. Will be
// `null` if no shared link has been created.
type WebLinkSharedLink struct {
	Access              *WebLinkSharedLinkAccessEnum             `json:"access,omitempty"`
	DownloadCount       int64                                    `json:"download_count"`
	DownloadURL         *string                                  `json:"download_url,omitempty"`
	EffectiveAccess     WebLinkSharedLinkEffectiveAccessEnum     `json:"effective_access"`
	EffectivePermission WebLinkSharedLinkEffectivePermissionEnum `json:"effective_permission"`
	IsPasswordEnabled   bool                                     `json:"is_password_enabled"`
	Permissions         *WebLinkSharedLinkPermissions            `json:"permissions,omitempty"`
	PreviewCount        int64                                    `json:"preview_count"`
	UnsharedAt          *time.Time                               `json:"unshared_at,omitempty"`
	URL                 string                                   `json:"url"`
	VanityName          *string                                  `json:"vanity_name,omitempty"`
	VanityURL           *string                                  `json:"vanity_url,omitempty"`
}

type WebLinkTypeEnum string

const (
	WebLinkTypeEnumWebLink WebLinkTypeEnum = "web_link"
)

// WebLink
// Web links are objects that point to URLs. These objects
// are also known as bookmarks within the Box web application.
//
// Web link objects are treated similarly to file objects,
// they will also support most actions that apply to regular files.
type WebLink struct {
	CreatedAt      *time.Time             `json:"created_at,omitempty"`
	CreatedBy      *UserMini              `json:"created_by,omitempty"`
	Description    *string                `json:"description,omitempty"`
	Etag           *string                `json:"etag,omitempty"`
	ID             string                 `json:"id"`
	ItemStatus     *WebLinkItemStatusEnum `json:"item_status,omitempty"`
	ModifiedAt     *time.Time             `json:"modified_at,omitempty"`
	ModifiedBy     *UserMini              `json:"modified_by,omitempty"`
	Name           *string                `json:"name,omitempty"`
	OwnedBy        *UserMini              `json:"owned_by,omitempty"`
	Parent         *FolderMini            `json:"parent,omitempty"`
	PathCollection *WebLinkPathCollection `json:"path_collection,omitempty"`
	PurgedAt       *time.Time             `json:"purged_at,omitempty"`
	SequenceID     map[string]interface{} `json:"sequence_id,omitempty"`
	SharedLink     *WebLinkSharedLink     `json:"shared_link,omitempty"`
	TrashedAt      *time.Time             `json:"trashed_at,omitempty"`
	Type           WebLinkTypeEnum        `json:"type"`
	URL            *string                `json:"url,omitempty"`
}
