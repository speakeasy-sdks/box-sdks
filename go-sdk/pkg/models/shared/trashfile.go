package shared

import (
	"time"
)

type TrashFileItemStatusEnum string

const (
	TrashFileItemStatusEnumActive  TrashFileItemStatusEnum = "active"
	TrashFileItemStatusEnumTrashed TrashFileItemStatusEnum = "trashed"
	TrashFileItemStatusEnumDeleted TrashFileItemStatusEnum = "deleted"
)

type TrashFileUserBaseTypeEnum string

const (
	TrashFileUserBaseTypeEnumUser TrashFileUserBaseTypeEnum = "user"
)

// TrashFileUserBase
// The user who last modified this file
type TrashFileUserBase struct {
	ID    *string                   `json:"id,omitempty"`
	Login string                    `json:"login"`
	Name  string                    `json:"name"`
	Type  TrashFileUserBaseTypeEnum `json:"type"`
}

type TrashFileFolderBaseTypeEnum string

const (
	TrashFileFolderBaseTypeEnumFolder TrashFileFolderBaseTypeEnum = "folder"
)

// TrashFileFolderBase
// The folder that this file is located within.
type TrashFileFolderBase struct {
	Etag       *string                     `json:"etag,omitempty"`
	ID         string                      `json:"id"`
	Name       *string                     `json:"name,omitempty"`
	SequenceID map[string]interface{}      `json:"sequence_id,omitempty"`
	Type       TrashFileFolderBaseTypeEnum `json:"type"`
}

type TrashFilePathCollectionTrashEntriesTypeEnum string

const (
	TrashFilePathCollectionTrashEntriesTypeEnumFolder TrashFilePathCollectionTrashEntriesTypeEnum = "folder"
)

// TrashFilePathCollectionTrashEntries
// The parent folder for this item
type TrashFilePathCollectionTrashEntries struct {
	Etag       *string                                      `json:"etag,omitempty"`
	ID         *string                                      `json:"id,omitempty"`
	Name       *string                                      `json:"name,omitempty"`
	SequenceID *string                                      `json:"sequence_id,omitempty"`
	Type       *TrashFilePathCollectionTrashEntriesTypeEnum `json:"type,omitempty"`
}

// TrashFilePathCollectionTrash
// The tree of folders that this file is contained in,
// starting at the root.
type TrashFilePathCollectionTrash struct {
	Entries    []TrashFilePathCollectionTrashEntries `json:"entries"`
	TotalCount int64                                 `json:"total_count"`
}

type TrashFileTypeEnum string

const (
	TrashFileTypeEnumFile TrashFileTypeEnum = "file"
)

// TrashFile
// Represents a trashed file.
type TrashFile struct {
	ContentCreatedAt  *time.Time                   `json:"content_created_at,omitempty"`
	ContentModifiedAt *time.Time                   `json:"content_modified_at,omitempty"`
	CreatedAt         time.Time                    `json:"created_at"`
	CreatedBy         *UserMini                    `json:"created_by,omitempty"`
	Description       string                       `json:"description"`
	Etag              *string                      `json:"etag,omitempty"`
	FileVersion       *FileVersionMini             `json:"file_version,omitempty"`
	ID                string                       `json:"id"`
	ItemStatus        TrashFileItemStatusEnum      `json:"item_status"`
	ModifiedAt        time.Time                    `json:"modified_at"`
	ModifiedBy        TrashFileUserBase            `json:"modified_by"`
	Name              *string                      `json:"name,omitempty"`
	OwnedBy           TrashFileUserBase            `json:"owned_by"`
	Parent            *TrashFileFolderBase         `json:"parent,omitempty"`
	PathCollection    TrashFilePathCollectionTrash `json:"path_collection"`
	PurgedAt          *time.Time                   `json:"purged_at,omitempty"`
	SequenceID        map[string]interface{}       `json:"sequence_id"`
	Sha1              string                       `json:"sha1"`
	SharedLink        *string                      `json:"shared_link,omitempty"`
	Size              int64                        `json:"size"`
	TrashedAt         *time.Time                   `json:"trashed_at,omitempty"`
	Type              TrashFileTypeEnum            `json:"type"`
}
