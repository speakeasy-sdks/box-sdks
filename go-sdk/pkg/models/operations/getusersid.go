package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetUsersIDPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type GetUsersIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetUsersIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetUsersIDPathParams
	QueryParams GetUsersIDQueryParams
}

type GetUsersIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	User        *shared.User
}
