package shared

import (
	"time"
)

type TrashFolderRestoredUserBaseTypeEnum string

const (
	TrashFolderRestoredUserBaseTypeEnumUser TrashFolderRestoredUserBaseTypeEnum = "user"
)

// TrashFolderRestoredUserBase
// The user who created this folder
type TrashFolderRestoredUserBase struct {
	ID    *string                             `json:"id,omitempty"`
	Login string                              `json:"login"`
	Name  string                              `json:"name"`
	Type  TrashFolderRestoredUserBaseTypeEnum `json:"type"`
}

type TrashFolderRestoredItemStatusEnum string

const (
	TrashFolderRestoredItemStatusEnumActive  TrashFolderRestoredItemStatusEnum = "active"
	TrashFolderRestoredItemStatusEnumTrashed TrashFolderRestoredItemStatusEnum = "trashed"
	TrashFolderRestoredItemStatusEnumDeleted TrashFolderRestoredItemStatusEnum = "deleted"
)

type TrashFolderRestoredFolderBaseTypeEnum string

const (
	TrashFolderRestoredFolderBaseTypeEnumFolder TrashFolderRestoredFolderBaseTypeEnum = "folder"
)

// TrashFolderRestoredFolderBase
// The optional folder that this folder is located within.
//
// This value may be `null` for some folders such as the
// root folder or the trash folder.
type TrashFolderRestoredFolderBase struct {
	Etag       *string                               `json:"etag,omitempty"`
	ID         string                                `json:"id"`
	Name       *string                               `json:"name,omitempty"`
	SequenceID map[string]interface{}                `json:"sequence_id,omitempty"`
	Type       TrashFolderRestoredFolderBaseTypeEnum `json:"type"`
}

// TrashFolderRestoredPathCollection
// The tree of folders that this file is contained in,
// starting at the root.
type TrashFolderRestoredPathCollection struct {
	Entries    []FolderMini `json:"entries"`
	TotalCount int64        `json:"total_count"`
}

type TrashFolderRestoredTypeEnum string

const (
	TrashFolderRestoredTypeEnumFolder TrashFolderRestoredTypeEnum = "folder"
)

// TrashFolderRestored
// Represents a folder restored from the trash.
type TrashFolderRestored struct {
	ContentCreatedAt  *time.Time                         `json:"content_created_at,omitempty"`
	ContentModifiedAt *time.Time                         `json:"content_modified_at,omitempty"`
	CreatedAt         *time.Time                         `json:"created_at,omitempty"`
	CreatedBy         *TrashFolderRestoredUserBase       `json:"created_by,omitempty"`
	Description       map[string]interface{}             `json:"description,omitempty"`
	Etag              *string                            `json:"etag,omitempty"`
	FolderUploadEmail *string                            `json:"folder_upload_email,omitempty"`
	ID                *string                            `json:"id,omitempty"`
	ItemStatus        *TrashFolderRestoredItemStatusEnum `json:"item_status,omitempty"`
	ModifiedAt        *time.Time                         `json:"modified_at,omitempty"`
	ModifiedBy        *TrashFolderRestoredUserBase       `json:"modified_by,omitempty"`
	Name              *string                            `json:"name,omitempty"`
	OwnedBy           *TrashFolderRestoredUserBase       `json:"owned_by,omitempty"`
	Parent            *TrashFolderRestoredFolderBase     `json:"parent,omitempty"`
	PathCollection    *TrashFolderRestoredPathCollection `json:"path_collection,omitempty"`
	PurgedAt          *string                            `json:"purged_at,omitempty"`
	SequenceID        map[string]interface{}             `json:"sequence_id,omitempty"`
	SharedLink        *string                            `json:"shared_link,omitempty"`
	Size              *int64                             `json:"size,omitempty"`
	TrashedAt         *string                            `json:"trashed_at,omitempty"`
	Type              *TrashFolderRestoredTypeEnum       `json:"type,omitempty"`
}
