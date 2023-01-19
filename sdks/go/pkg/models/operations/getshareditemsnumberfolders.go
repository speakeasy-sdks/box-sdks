package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetSharedItemsNumberFoldersQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetSharedItemsNumberFoldersHeaders struct {
	Boxapi      string  `header:"style=simple,explode=false,name=boxapi"`
	IfNoneMatch *string `header:"style=simple,explode=false,name=if-none-match"`
}

type GetSharedItemsNumberFoldersRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetSharedItemsNumberFoldersQueryParams
	Headers     GetSharedItemsNumberFoldersHeaders
}

type GetSharedItemsNumberFoldersResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
