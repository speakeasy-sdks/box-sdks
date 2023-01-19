package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var DeleteFilesUploadSessionsIDServerList = []string{
	"https://upload.box.com/api/2.0",
}

type DeleteFilesUploadSessionsIDPathParams struct {
	UploadSessionID string `pathParam:"style=simple,explode=false,name=upload_session_id"`
}

type DeleteFilesUploadSessionsIDRequest struct {
	Retries    *utils.RetryConfig
	ServerURL  *string
	PathParams DeleteFilesUploadSessionsIDPathParams
}

type DeleteFilesUploadSessionsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
