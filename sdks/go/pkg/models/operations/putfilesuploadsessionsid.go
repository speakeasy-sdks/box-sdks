package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var PutFilesUploadSessionsIDServerList = []string{
	"https://upload.box.com/api/2.0",
}

type PutFilesUploadSessionsIDPathParams struct {
	UploadSessionID string `pathParam:"style=simple,explode=false,name=upload_session_id"`
}

type PutFilesUploadSessionsIDHeaders struct {
	ContentRange string `header:"style=simple,explode=false,name=content-range"`
	Digest       string `header:"style=simple,explode=false,name=digest"`
}

type PutFilesUploadSessionsIDRequest struct {
	Retries    *utils.RetryConfig
	ServerURL  *string
	PathParams PutFilesUploadSessionsIDPathParams
	Headers    PutFilesUploadSessionsIDHeaders
	Request    []byte `request:"mediaType=application/octet-stream"`
}

type PutFilesUploadSessionsIDResponse struct {
	ClientError  *shared.ClientError
	ContentType  string
	StatusCode   int64
	UploadedPart *shared.UploadedPart
}
