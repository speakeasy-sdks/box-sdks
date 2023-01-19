package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteWebLinksIDTrashPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

type DeleteWebLinksIDTrashRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteWebLinksIDTrashPathParams
}

type DeleteWebLinksIDTrashResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
