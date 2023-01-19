package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var PostFilesUploadSessionsServerList = []string{
	"https://upload.box.com/api/2.0",
}

type PostFilesUploadSessionsRequestBody struct {
	FileName string `json:"file_name"`
	FileSize int64  `json:"file_size"`
	FolderID string `json:"folder_id"`
}

type PostFilesUploadSessionsRequest struct {
	Retries   *utils.RetryConfig
	ServerURL *string
	Request   *PostFilesUploadSessionsRequestBody `request:"mediaType=application/json"`
}

type PostFilesUploadSessionsResponse struct {
	ClientError   *shared.ClientError
	ContentType   string
	StatusCode    int64
	UploadSession *shared.UploadSession
}
