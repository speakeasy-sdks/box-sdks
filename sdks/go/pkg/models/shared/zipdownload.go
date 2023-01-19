package shared

import (
	"time"
)

type ZipDownloadNameConflictsTypeEnum string

const (
	ZipDownloadNameConflictsTypeEnumFile   ZipDownloadNameConflictsTypeEnum = "file"
	ZipDownloadNameConflictsTypeEnumFolder ZipDownloadNameConflictsTypeEnum = "folder"
)

// ZipDownloadNameConflicts
// A file or folder for which a conflict was encountered, This object provides the type and identifier of the original item, as well as a mapping between its original name and it's new name as it will appear in the archive.
type ZipDownloadNameConflicts struct {
	DownloadName *string                           `json:"download_name,omitempty"`
	ID           *string                           `json:"id,omitempty"`
	OriginalName *string                           `json:"original_name,omitempty"`
	Type         *ZipDownloadNameConflictsTypeEnum `json:"type,omitempty"`
}

// ZipDownload
// Represents a successful request to create a `zip` archive of a list of files
// and folders.
type ZipDownload struct {
	DownloadURL   *string                      `json:"download_url,omitempty"`
	ExpiresAt     *time.Time                   `json:"expires_at,omitempty"`
	NameConflicts [][]ZipDownloadNameConflicts `json:"name_conflicts,omitempty"`
	StatusURL     *string                      `json:"status_url,omitempty"`
}
