package shared

type ZipDownloadStatusStateEnum string

const (
	ZipDownloadStatusStateEnumInProgress ZipDownloadStatusStateEnum = "in_progress"
	ZipDownloadStatusStateEnumFailed     ZipDownloadStatusStateEnum = "failed"
	ZipDownloadStatusStateEnumSuccess    ZipDownloadStatusStateEnum = "success"
)

// ZipDownloadStatus
// The status of a `zip` archive being downloaded.
type ZipDownloadStatus struct {
	DownloadedFileCount *int64                      `json:"downloaded_file_count,omitempty"`
	SkippedFileCount    *int64                      `json:"skipped_file_count,omitempty"`
	SkippedFolderCount  *int64                      `json:"skipped_folder_count,omitempty"`
	State               *ZipDownloadStatusStateEnum `json:"state,omitempty"`
	TotalFileCount      *int64                      `json:"total_file_count,omitempty"`
}
