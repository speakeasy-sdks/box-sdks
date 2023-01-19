package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var GetFilesUploadSessionsIDPartsServerList = []string{
	"https://upload.box.com/api/2.0",
}

type GetFilesUploadSessionsIDPartsPathParams struct {
	UploadSessionID string `pathParam:"style=simple,explode=false,name=upload_session_id"`
}

type GetFilesUploadSessionsIDPartsQueryParams struct {
	Limit  *int64 `queryParam:"style=form,explode=true,name=limit"`
	Offset *int64 `queryParam:"style=form,explode=true,name=offset"`
}

type GetFilesUploadSessionsIDPartsRequest struct {
	Retries     *utils.RetryConfig
	ServerURL   *string
	PathParams  GetFilesUploadSessionsIDPartsPathParams
	QueryParams GetFilesUploadSessionsIDPartsQueryParams
}

type GetFilesUploadSessionsIDPartsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	UploadParts *shared.UploadParts
}
