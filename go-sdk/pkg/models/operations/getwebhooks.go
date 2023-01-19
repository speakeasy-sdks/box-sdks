package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetWebhooksQueryParams struct {
	Limit  *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker *string `queryParam:"style=form,explode=true,name=marker"`
}

type GetWebhooksRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetWebhooksQueryParams
}

type GetWebhooksResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Webhooks    *shared.Webhooks
}
