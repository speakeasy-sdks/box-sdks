package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetWebLinksIDPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

type GetWebLinksIDHeaders struct {
	Boxapi *string `header:"style=simple,explode=false,name=boxapi"`
}

type GetWebLinksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetWebLinksIDPathParams
	Headers    GetWebLinksIDHeaders
}

type GetWebLinksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	WebLink     *shared.WebLink
}
