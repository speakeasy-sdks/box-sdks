package shared

import (
	"time"
)

type TrashFileRestoredItemStatusEnum string

const (
	TrashFileRestoredItemStatusEnumActive  TrashFileRestoredItemStatusEnum = "active"
	TrashFileRestoredItemStatusEnumTrashed TrashFileRestoredItemStatusEnum = "trashed"
	TrashFileRestoredItemStatusEnumDeleted TrashFileRestoredItemStatusEnum = "deleted"
)

type TrashFileRestoredUserBaseTypeEnum string

const (
	TrashFileRestoredUserBaseTypeEnumUser TrashFileRestoredUserBaseTypeEnum = "user"
)

// TrashFileRestoredUserBase
// The user who last modified this file
type TrashFileRestoredUserBase struct {
	ID    *string                           `json:"id,omitempty"`
	Login string                            `json:"login"`
	Name  string                            `json:"name"`
	Type  TrashFileRestoredUserBaseTypeEnum `json:"type"`
}

type TrashFileRestoredFolderBaseTypeEnum string

const (
	TrashFileRestoredFolderBaseTypeEnumFolder TrashFileRestoredFolderBaseTypeEnum = "folder"
)

// TrashFileRestoredFolderBase
// The folder that this file is located within.
type TrashFileRestoredFolderBase struct {
	Etag       *string                             `json:"etag,omitempty"`
	ID         string                              `json:"id"`
	Name       *string                             `json:"name,omitempty"`
	SequenceID map[string]interface{}              `json:"sequence_id,omitempty"`
	Type       TrashFileRestoredFolderBaseTypeEnum `json:"type"`
}

// TrashFileRestoredPathCollection
// The tree of folders that this file is contained in,
// starting at the root.
type TrashFileRestoredPathCollection struct {
	Entries    []FolderMini `json:"entries"`
	TotalCount int64        `json:"total_count"`
}

type TrashFileRestoredTypeEnum string

const (
	TrashFileRestoredTypeEnumFile TrashFileRestoredTypeEnum = "file"
)

// TrashFileRestored
// Represents a file restored from the trash.
type TrashFileRestored struct {
	ContentCreatedAt  *time.Time                      `json:"content_created_at,omitempty"`
	ContentModifiedAt *time.Time                      `json:"content_modified_at,omitempty"`
	CreatedAt         time.Time                       `json:"created_at"`
	CreatedBy         *UserMini                       `json:"created_by,omitempty"`
	Description       string                          `json:"description"`
	Etag              *string                         `json:"etag,omitempty"`
	FileVersion       *FileVersionMini                `json:"file_version,omitempty"`
	ID                string                          `json:"id"`
	ItemStatus        TrashFileRestoredItemStatusEnum `json:"item_status"`
	ModifiedAt        time.Time                       `json:"modified_at"`
	ModifiedBy        TrashFileRestoredUserBase       `json:"modified_by"`
	Name              *string                         `json:"name,omitempty"`
	OwnedBy           TrashFileRestoredUserBase       `json:"owned_by"`
	Parent            *TrashFileRestoredFolderBase    `json:"parent,omitempty"`
	PathCollection    TrashFileRestoredPathCollection `json:"path_collection"`
	PurgedAt          *string                         `json:"purged_at,omitempty"`
	SequenceID        map[string]interface{}          `json:"sequence_id"`
	Sha1              string                          `json:"sha1"`
	SharedLink        *string                         `json:"shared_link,omitempty"`
	Size              int64                           `json:"size"`
	TrashedAt         *string                         `json:"trashed_at,omitempty"`
	Type              TrashFileRestoredTypeEnum       `json:"type"`
}
