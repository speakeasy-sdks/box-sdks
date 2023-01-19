package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDVersionsIDPathParams struct {
	FileID        string `pathParam:"style=simple,explode=false,name=file_id"`
	FileVersionID string `pathParam:"style=simple,explode=false,name=file_version_id"`
}

type GetFilesIDVersionsIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetFilesIDVersionsIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFilesIDVersionsIDPathParams
	QueryParams GetFilesIDVersionsIDQueryParams
}

type GetFilesIDVersionsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	FileVersion *shared.FileVersion
	StatusCode  int64
}
