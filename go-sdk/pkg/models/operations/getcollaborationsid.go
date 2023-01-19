package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetCollaborationsIDPathParams struct {
	CollaborationID string `pathParam:"style=simple,explode=false,name=collaboration_id"`
}

type GetCollaborationsIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetCollaborationsIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetCollaborationsIDPathParams
	QueryParams GetCollaborationsIDQueryParams
}

type GetCollaborationsIDResponse struct {
	ClientError   *shared.ClientError
	Collaboration *shared.Collaboration
	ContentType   string
	StatusCode    int64
}
