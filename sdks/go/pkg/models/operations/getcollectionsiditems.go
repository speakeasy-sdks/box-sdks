package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetCollectionsIDItemsPathParams struct {
	CollectionID string `pathParam:"style=simple,explode=false,name=collection_id"`
}

type GetCollectionsIDItemsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64   `queryParam:"style=form,explode=true,name=limit"`
	Offset *int64   `queryParam:"style=form,explode=true,name=offset"`
}

type GetCollectionsIDItemsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetCollectionsIDItemsPathParams
	QueryParams GetCollectionsIDItemsQueryParams
}

type GetCollectionsIDItemsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Items       *shared.Items
	StatusCode  int64
}
