package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetGroupsQueryParams struct {
	Fields     []string `queryParam:"style=form,explode=false,name=fields"`
	FilterTerm *string  `queryParam:"style=form,explode=true,name=filter_term"`
	Limit      *int64   `queryParam:"style=form,explode=true,name=limit"`
	Offset     *int64   `queryParam:"style=form,explode=true,name=offset"`
}

type GetGroupsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetGroupsQueryParams
}

type GetGroupsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Groups      *shared.Groups
	StatusCode  int64
}
