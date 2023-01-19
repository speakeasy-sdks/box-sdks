package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteWebLinksIDPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

type DeleteWebLinksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteWebLinksIDPathParams
}

type DeleteWebLinksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
