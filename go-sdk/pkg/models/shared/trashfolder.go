package shared

import (
	"time"
)

type TrashFolderUserBaseTypeEnum string

const (
	TrashFolderUserBaseTypeEnumUser TrashFolderUserBaseTypeEnum = "user"
)

// TrashFolderUserBase
// The user who created this folder
type TrashFolderUserBase struct {
	ID    *string                     `json:"id,omitempty"`
	Login string                      `json:"login"`
	Name  string                      `json:"name"`
	Type  TrashFolderUserBaseTypeEnum `json:"type"`
}

type TrashFolderItemStatusEnum string

const (
	TrashFolderItemStatusEnumActive  TrashFolderItemStatusEnum = "active"
	TrashFolderItemStatusEnumTrashed TrashFolderItemStatusEnum = "trashed"
	TrashFolderItemStatusEnumDeleted TrashFolderItemStatusEnum = "deleted"
)

type TrashFolderFolderBaseTypeEnum string

const (
	TrashFolderFolderBaseTypeEnumFolder TrashFolderFolderBaseTypeEnum = "folder"
)

// TrashFolderFolderBase
// The optional folder that this folder is located within.
//
// This value may be `null` for some folders such as the
// root folder or the trash folder.
type TrashFolderFolderBase struct {
	Etag       *string                       `json:"etag,omitempty"`
	ID         string                        `json:"id"`
	Name       *string                       `json:"name,omitempty"`
	SequenceID map[string]interface{}        `json:"sequence_id,omitempty"`
	Type       TrashFolderFolderBaseTypeEnum `json:"type"`
}

type TrashFolderPathCollectionTrashEntriesTypeEnum string

const (
	TrashFolderPathCollectionTrashEntriesTypeEnumFolder TrashFolderPathCollectionTrashEntriesTypeEnum = "folder"
)

// TrashFolderPathCollectionTrashEntries
// The parent folder for this item
type TrashFolderPathCollectionTrashEntries struct {
	Etag       *string                                        `json:"etag,omitempty"`
	ID         *string                                        `json:"id,omitempty"`
	Name       *string                                        `json:"name,omitempty"`
	SequenceID *string                                        `json:"sequence_id,omitempty"`
	Type       *TrashFolderPathCollectionTrashEntriesTypeEnum `json:"type,omitempty"`
}

// TrashFolderPathCollectionTrash
// The tree of folders that this file is contained in,
// starting at the root.
type TrashFolderPathCollectionTrash struct {
	Entries    []TrashFolderPathCollectionTrashEntries `json:"entries"`
	TotalCount int64                                   `json:"total_count"`
}

type TrashFolderTypeEnum string

const (
	TrashFolderTypeEnumFolder TrashFolderTypeEnum = "folder"
)

// TrashFolder
// Represents a trashed folder.
type TrashFolder struct {
	ContentCreatedAt  *time.Time                     `json:"content_created_at,omitempty"`
	ContentModifiedAt *time.Time                     `json:"content_modified_at,omitempty"`
	CreatedAt         *time.Time                     `json:"created_at,omitempty"`
	CreatedBy         TrashFolderUserBase            `json:"created_by"`
	Description       map[string]interface{}         `json:"description"`
	Etag              *string                        `json:"etag,omitempty"`
	FolderUploadEmail *string                        `json:"folder_upload_email,omitempty"`
	ID                string                         `json:"id"`
	ItemStatus        TrashFolderItemStatusEnum      `json:"item_status"`
	ModifiedAt        *time.Time                     `json:"modified_at,omitempty"`
	ModifiedBy        TrashFolderUserBase            `json:"modified_by"`
	Name              string                         `json:"name"`
	OwnedBy           TrashFolderUserBase            `json:"owned_by"`
	Parent            *TrashFolderFolderBase         `json:"parent,omitempty"`
	PathCollection    TrashFolderPathCollectionTrash `json:"path_collection"`
	PurgedAt          *time.Time                     `json:"purged_at,omitempty"`
	SequenceID        map[string]interface{}         `json:"sequence_id,omitempty"`
	SharedLink        *string                        `json:"shared_link,omitempty"`
	Size              int64                          `json:"size"`
	TrashedAt         *time.Time                     `json:"trashed_at,omitempty"`
	Type              TrashFolderTypeEnum            `json:"type"`
}
