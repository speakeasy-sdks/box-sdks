package shared

type ZipDownloadRequestItemsTypeEnum string

const (
	ZipDownloadRequestItemsTypeEnumFile   ZipDownloadRequestItemsTypeEnum = "file"
	ZipDownloadRequestItemsTypeEnumFolder ZipDownloadRequestItemsTypeEnum = "folder."
)

// ZipDownloadRequestItems
// An item to add to the `zip` archive. This can be a file or a folder.
type ZipDownloadRequestItems struct {
	ID   string                          `json:"id"`
	Type ZipDownloadRequestItemsTypeEnum `json:"type"`
}

// ZipDownloadRequest
// A request to create a `zip` archive to download
type ZipDownloadRequest struct {
	DownloadFileName *string                   `json:"download_file_name,omitempty"`
	Items            []ZipDownloadRequestItems `json:"items"`
}
