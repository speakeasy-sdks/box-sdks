package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetUsersMeQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetUsersMeRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetUsersMeQueryParams
}

type GetUsersMeResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	User        *shared.User
}
