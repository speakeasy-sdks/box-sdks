package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetSharedItemsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetSharedItemsHeaders struct {
	Boxapi      string  `header:"style=simple,explode=false,name=boxapi"`
	IfNoneMatch *string `header:"style=simple,explode=false,name=if-none-match"`
}

type GetSharedItemsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetSharedItemsQueryParams
	Headers     GetSharedItemsHeaders
}

type GetSharedItemsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	File        *shared.File
	StatusCode  int64
}
