package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetSignRequestsQueryParams struct {
	Limit  *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker *string `queryParam:"style=form,explode=true,name=marker"`
}

type GetSignRequestsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetSignRequestsQueryParams
}

type GetSignRequestsResponseOutput struct {
	ClientError  *shared.ClientError
	ContentType  string
	SignRequests *shared.SignRequestsOutput
	StatusCode   int64
}
