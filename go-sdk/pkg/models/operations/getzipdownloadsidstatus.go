package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetZipDownloadsIDStatusPathParams struct {
	ZipDownloadID string `pathParam:"style=simple,explode=false,name=zip_download_id"`
}

type GetZipDownloadsIDStatusRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetZipDownloadsIDStatusPathParams
}

type GetZipDownloadsIDStatusResponse struct {
	ClientError       *shared.ClientError
	ContentType       string
	StatusCode        int64
	ZipDownloadStatus *shared.ZipDownloadStatus
}
