package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostZipDownloadsRequest struct {
	Retries *utils.RetryConfig
	Request *shared.ZipDownloadRequest `request:"mediaType=application/json"`
}

type PostZipDownloadsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	ZipDownload *shared.ZipDownload
}
