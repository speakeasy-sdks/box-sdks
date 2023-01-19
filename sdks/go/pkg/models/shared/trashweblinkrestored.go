package shared

import (
	"time"
)

type TrashWebLinkRestoredItemStatusEnum string

const (
	TrashWebLinkRestoredItemStatusEnumActive  TrashWebLinkRestoredItemStatusEnum = "active"
	TrashWebLinkRestoredItemStatusEnumTrashed TrashWebLinkRestoredItemStatusEnum = "trashed"
	TrashWebLinkRestoredItemStatusEnumDeleted TrashWebLinkRestoredItemStatusEnum = "deleted"
)

// TrashWebLinkRestoredPathCollection
// The tree of folders that this web link is contained in,
// starting at the root.
type TrashWebLinkRestoredPathCollection struct {
	Entries    []FolderMini `json:"entries"`
	TotalCount int64        `json:"total_count"`
}

type TrashWebLinkRestoredTypeEnum string

const (
	TrashWebLinkRestoredTypeEnumWebLink TrashWebLinkRestoredTypeEnum = "web_link"
)

// TrashWebLinkRestored
// Represents a web link restored from the trash.
type TrashWebLinkRestored struct {
	CreatedAt      *time.Time                          `json:"created_at,omitempty"`
	CreatedBy      *UserMini                           `json:"created_by,omitempty"`
	Description    *string                             `json:"description,omitempty"`
	Etag           *string                             `json:"etag,omitempty"`
	ID             *string                             `json:"id,omitempty"`
	ItemStatus     *TrashWebLinkRestoredItemStatusEnum `json:"item_status,omitempty"`
	ModifiedAt     *time.Time                          `json:"modified_at,omitempty"`
	ModifiedBy     *UserMini                           `json:"modified_by,omitempty"`
	Name           *string                             `json:"name,omitempty"`
	OwnedBy        *UserMini                           `json:"owned_by,omitempty"`
	Parent         *FolderMini                         `json:"parent,omitempty"`
	PathCollection TrashWebLinkRestoredPathCollection  `json:"path_collection"`
	PurgedAt       *string                             `json:"purged_at,omitempty"`
	SequenceID     map[string]interface{}              `json:"sequence_id"`
	SharedLink     *string                             `json:"shared_link,omitempty"`
	TrashedAt      *string                             `json:"trashed_at,omitempty"`
	Type           *TrashWebLinkRestoredTypeEnum       `json:"type,omitempty"`
	URL            *string                             `json:"url,omitempty"`
}
