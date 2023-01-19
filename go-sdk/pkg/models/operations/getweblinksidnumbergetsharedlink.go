package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetWebLinksIDNumberGetSharedLinkPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

type GetWebLinksIDNumberGetSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type GetWebLinksIDNumberGetSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetWebLinksIDNumberGetSharedLinkPathParams
	QueryParams GetWebLinksIDNumberGetSharedLinkQueryParams
}

type GetWebLinksIDNumberGetSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	WebLink     *shared.WebLink
}
