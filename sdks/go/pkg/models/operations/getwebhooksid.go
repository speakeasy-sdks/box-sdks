package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetWebhooksIDPathParams struct {
	WebhookID string `pathParam:"style=simple,explode=false,name=webhook_id"`
}

type GetWebhooksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetWebhooksIDPathParams
}

type GetWebhooksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Webhook     *shared.Webhook
}
