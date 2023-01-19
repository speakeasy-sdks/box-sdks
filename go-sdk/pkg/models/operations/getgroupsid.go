package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetGroupsIDPathParams struct {
	GroupID string `pathParam:"style=simple,explode=false,name=group_id"`
}

type GetGroupsIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetGroupsIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetGroupsIDPathParams
	QueryParams GetGroupsIDQueryParams
}

type GetGroupsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Group       *shared.Group
	StatusCode  int64
}
