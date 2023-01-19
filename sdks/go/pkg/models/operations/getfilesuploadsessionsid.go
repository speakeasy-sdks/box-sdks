package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var GetFilesUploadSessionsIDServerList = []string{
	"https://upload.box.com/api/2.0",
}

type GetFilesUploadSessionsIDPathParams struct {
	UploadSessionID string `pathParam:"style=simple,explode=false,name=upload_session_id"`
}

type GetFilesUploadSessionsIDRequest struct {
	Retries    *utils.RetryConfig
	ServerURL  *string
	PathParams GetFilesUploadSessionsIDPathParams
}

type GetFilesUploadSessionsIDResponse struct {
	ClientError   *shared.ClientError
	ContentType   string
	StatusCode    int64
	UploadSession *shared.UploadSession
}
