package shared

import (
	"time"
)

type TrashWebLinkItemStatusEnum string

const (
	TrashWebLinkItemStatusEnumActive  TrashWebLinkItemStatusEnum = "active"
	TrashWebLinkItemStatusEnumTrashed TrashWebLinkItemStatusEnum = "trashed"
	TrashWebLinkItemStatusEnumDeleted TrashWebLinkItemStatusEnum = "deleted"
)

type TrashWebLinkPathCollectionTrashEntriesTypeEnum string

const (
	TrashWebLinkPathCollectionTrashEntriesTypeEnumFolder TrashWebLinkPathCollectionTrashEntriesTypeEnum = "folder"
)

// TrashWebLinkPathCollectionTrashEntries
// The parent folder for this item
type TrashWebLinkPathCollectionTrashEntries struct {
	Etag       *string                                         `json:"etag,omitempty"`
	ID         *string                                         `json:"id,omitempty"`
	Name       *string                                         `json:"name,omitempty"`
	SequenceID *string                                         `json:"sequence_id,omitempty"`
	Type       *TrashWebLinkPathCollectionTrashEntriesTypeEnum `json:"type,omitempty"`
}

// TrashWebLinkPathCollectionTrash
// The tree of folders that this web link is contained in,
// starting at the root.
type TrashWebLinkPathCollectionTrash struct {
	Entries    []TrashWebLinkPathCollectionTrashEntries `json:"entries"`
	TotalCount int64                                    `json:"total_count"`
}

type TrashWebLinkTypeEnum string

const (
	TrashWebLinkTypeEnumWebLink TrashWebLinkTypeEnum = "web_link"
)

// TrashWebLink
// Represents a trashed web link.
type TrashWebLink struct {
	CreatedAt      *time.Time                       `json:"created_at,omitempty"`
	CreatedBy      *UserMini                        `json:"created_by,omitempty"`
	Description    *string                          `json:"description,omitempty"`
	Etag           *string                          `json:"etag,omitempty"`
	ID             *string                          `json:"id,omitempty"`
	ItemStatus     *TrashWebLinkItemStatusEnum      `json:"item_status,omitempty"`
	ModifiedAt     *time.Time                       `json:"modified_at,omitempty"`
	ModifiedBy     *UserMini                        `json:"modified_by,omitempty"`
	Name           *string                          `json:"name,omitempty"`
	OwnedBy        *UserMini                        `json:"owned_by,omitempty"`
	Parent         *FolderMini                      `json:"parent,omitempty"`
	PathCollection *TrashWebLinkPathCollectionTrash `json:"path_collection,omitempty"`
	PurgedAt       *time.Time                       `json:"purged_at,omitempty"`
	SequenceID     map[string]interface{}           `json:"sequence_id,omitempty"`
	SharedLink     *string                          `json:"shared_link,omitempty"`
	TrashedAt      *time.Time                       `json:"trashed_at,omitempty"`
	Type           *TrashWebLinkTypeEnum            `json:"type,omitempty"`
	URL            *string                          `json:"url,omitempty"`
}
