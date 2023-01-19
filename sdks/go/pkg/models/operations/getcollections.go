package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetCollectionsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64   `queryParam:"style=form,explode=true,name=limit"`
	Offset *int64   `queryParam:"style=form,explode=true,name=offset"`
}

type GetCollectionsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetCollectionsQueryParams
}

type GetCollectionsResponse struct {
	ClientError *shared.ClientError
	Collections *shared.Collections
	ContentType string
	StatusCode  int64
}
