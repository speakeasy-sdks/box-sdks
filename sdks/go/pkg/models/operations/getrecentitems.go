package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetRecentItemsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64   `queryParam:"style=form,explode=true,name=limit"`
	Marker *string  `queryParam:"style=form,explode=true,name=marker"`
}

type GetRecentItemsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetRecentItemsQueryParams
}

type GetRecentItemsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	RecentItems *shared.RecentItems
	StatusCode  int64
}
