package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var PostFilesUploadSessionsIDCommitServerList = []string{
	"https://upload.box.com/api/2.0",
}

type PostFilesUploadSessionsIDCommitPathParams struct {
	UploadSessionID string `pathParam:"style=simple,explode=false,name=upload_session_id"`
}

type PostFilesUploadSessionsIDCommitHeaders struct {
	Digest      string  `header:"style=simple,explode=false,name=digest"`
	IfMatch     *string `header:"style=simple,explode=false,name=if-match"`
	IfNoneMatch *string `header:"style=simple,explode=false,name=if-none-match"`
}

type PostFilesUploadSessionsIDCommitRequestBody struct {
	Parts []shared.UploadPart `json:"parts"`
}

type PostFilesUploadSessionsIDCommitRequest struct {
	Retries    *utils.RetryConfig
	ServerURL  *string
	PathParams PostFilesUploadSessionsIDCommitPathParams
	Headers    PostFilesUploadSessionsIDCommitHeaders
	Request    *PostFilesUploadSessionsIDCommitRequestBody `request:"mediaType=application/json"`
}

type PostFilesUploadSessionsIDCommitResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Files       *shared.Files
	Headers     map[string][]string
	StatusCode  int64
}
