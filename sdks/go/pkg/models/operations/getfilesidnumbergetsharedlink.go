package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDNumberGetSharedLinkPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDNumberGetSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type GetFilesIDNumberGetSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFilesIDNumberGetSharedLinkPathParams
	QueryParams GetFilesIDNumberGetSharedLinkQueryParams
}

type GetFilesIDNumberGetSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	File        *shared.File
	StatusCode  int64
}
