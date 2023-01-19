package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var PostFilesIDUploadSessionsServerList = []string{
	"https://upload.box.com/api/2.0",
}

type PostFilesIDUploadSessionsPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PostFilesIDUploadSessionsRequestBody struct {
	FileName *string `json:"file_name,omitempty"`
	FileSize int64   `json:"file_size"`
}

type PostFilesIDUploadSessionsRequest struct {
	Retries    *utils.RetryConfig
	ServerURL  *string
	PathParams PostFilesIDUploadSessionsPathParams
	Request    *PostFilesIDUploadSessionsRequestBody `request:"mediaType=application/json"`
}

type PostFilesIDUploadSessionsResponse struct {
	ClientError   *shared.ClientError
	ContentType   string
	StatusCode    int64
	UploadSession *shared.UploadSession
}
