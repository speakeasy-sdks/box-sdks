package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetWebLinksIDTrashPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

type GetWebLinksIDTrashQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetWebLinksIDTrashRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetWebLinksIDTrashPathParams
	QueryParams GetWebLinksIDTrashQueryParams
}

type GetWebLinksIDTrashResponse struct {
	ClientError  *shared.ClientError
	ContentType  string
	StatusCode   int64
	TrashWebLink *shared.TrashWebLink
}
