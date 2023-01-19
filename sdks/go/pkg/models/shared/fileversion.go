package shared

import (
	"time"
)

type FileVersionTypeEnum string

const (
	FileVersionTypeEnumFileVersion FileVersionTypeEnum = "file_version"
)

// FileVersion
// The bare basic representation of a file version, the minimal
// amount of fields returned when using the `fields` query
// parameter.
type FileVersion struct {
	CreatedAt           *time.Time          `json:"created_at,omitempty"`
	ID                  string              `json:"id"`
	ModifiedAt          *time.Time          `json:"modified_at,omitempty"`
	ModifiedBy          *UserMini           `json:"modified_by,omitempty"`
	Name                *string             `json:"name,omitempty"`
	PurgedAt            *time.Time          `json:"purged_at,omitempty"`
	RestoredAt          *time.Time          `json:"restored_at,omitempty"`
	RestoredBy          *UserMini           `json:"restored_by,omitempty"`
	Sha1                *string             `json:"sha1,omitempty"`
	Size                *int64              `json:"size,omitempty"`
	TrashedAt           *time.Time          `json:"trashed_at,omitempty"`
	TrashedBy           *UserMini           `json:"trashed_by,omitempty"`
	Type                FileVersionTypeEnum `json:"type"`
	UploaderDisplayName *string             `json:"uploader_display_name,omitempty"`
}
