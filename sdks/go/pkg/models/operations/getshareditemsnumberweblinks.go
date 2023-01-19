package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetSharedItemsNumberWebLinksQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetSharedItemsNumberWebLinksHeaders struct {
	Boxapi      string  `header:"style=simple,explode=false,name=boxapi"`
	IfNoneMatch *string `header:"style=simple,explode=false,name=if-none-match"`
}

type GetSharedItemsNumberWebLinksRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetSharedItemsNumberWebLinksQueryParams
	Headers     GetSharedItemsNumberWebLinksHeaders
}

type GetSharedItemsNumberWebLinksResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	WebLink     *shared.WebLink
}
