package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetGroupsIDCollaborationsPathParams struct {
	GroupID string `pathParam:"style=simple,explode=false,name=group_id"`
}

type GetGroupsIDCollaborationsQueryParams struct {
	Limit  *int64 `queryParam:"style=form,explode=true,name=limit"`
	Offset *int64 `queryParam:"style=form,explode=true,name=offset"`
}

type GetGroupsIDCollaborationsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetGroupsIDCollaborationsPathParams
	QueryParams GetGroupsIDCollaborationsQueryParams
}

type GetGroupsIDCollaborationsResponse struct {
	ClientError    *shared.ClientError
	Collaborations *shared.Collaborations
	ContentType    string
	StatusCode     int64
}
