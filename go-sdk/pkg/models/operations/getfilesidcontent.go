package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDContentPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDContentQueryParams struct {
	AccessToken *string `queryParam:"style=form,explode=true,name=access_token"`
	Version     *string `queryParam:"style=form,explode=true,name=version"`
}

type GetFilesIDContentHeaders struct {
	Boxapi *string `header:"style=simple,explode=false,name=boxapi"`
	Range  *string `header:"style=simple,explode=false,name=range"`
}

type GetFilesIDContentRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFilesIDContentPathParams
	QueryParams GetFilesIDContentQueryParams
	Headers     GetFilesIDContentHeaders
}

type GetFilesIDContentResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Headers     map[string][]string
	StatusCode  int64
}
