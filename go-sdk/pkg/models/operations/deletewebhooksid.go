package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteWebhooksIDPathParams struct {
	WebhookID string `pathParam:"style=simple,explode=false,name=webhook_id"`
}

type DeleteWebhooksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteWebhooksIDPathParams
}

type DeleteWebhooksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
