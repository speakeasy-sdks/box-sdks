package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetFilesIDHeaders struct {
	Boxapi      *string `header:"style=simple,explode=false,name=boxapi"`
	IfNoneMatch *string `header:"style=simple,explode=false,name=if-none-match"`
	XRepHints   string  `header:"style=simple,explode=false,name=x-rep-hints"`
}

type GetFilesIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFilesIDPathParams
	QueryParams GetFilesIDQueryParams
	Headers     GetFilesIDHeaders
}

type GetFilesIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	File        *shared.File
	StatusCode  int64
}
