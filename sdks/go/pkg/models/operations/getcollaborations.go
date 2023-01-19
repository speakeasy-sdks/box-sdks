package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetCollaborationsStatusEnum string

const (
	GetCollaborationsStatusEnumPending GetCollaborationsStatusEnum = "pending"
)

type GetCollaborationsQueryParams struct {
	Fields []string                    `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64                      `queryParam:"style=form,explode=true,name=limit"`
	Offset *int64                      `queryParam:"style=form,explode=true,name=offset"`
	Status GetCollaborationsStatusEnum `queryParam:"style=form,explode=true,name=status"`
}

type GetCollaborationsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetCollaborationsQueryParams
}

type GetCollaborationsResponse struct {
	ClientError    *shared.ClientError
	Collaborations *shared.Collaborations
	ContentType    string
	StatusCode     int64
}
