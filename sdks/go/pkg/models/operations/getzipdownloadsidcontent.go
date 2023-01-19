package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var GetZipDownloadsIDContentServerList = []string{
	"https://dl.boxcloud.com/2.0",
}

type GetZipDownloadsIDContentPathParams struct {
	ZipDownloadID string `pathParam:"style=simple,explode=false,name=zip_download_id"`
}

type GetZipDownloadsIDContentRequest struct {
	Retries    *utils.RetryConfig
	ServerURL  *string
	PathParams GetZipDownloadsIDContentPathParams
}

type GetZipDownloadsIDContentResponse struct {
	ClientError                                                   *shared.ClientError
	ContentType                                                   string
	Headers                                                       map[string][]string
	StatusCode                                                    int64
	GetZipDownloadsIDContent200ApplicationOctetStreamBinaryString []byte
}
