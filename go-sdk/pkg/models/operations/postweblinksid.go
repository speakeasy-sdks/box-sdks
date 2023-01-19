package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostWebLinksIDPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

type PostWebLinksIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

// PostWebLinksIDRequestBodyParent
// The parent for this item
type PostWebLinksIDRequestBodyParent struct {
	ID *string `json:"id,omitempty"`
}

type PostWebLinksIDRequestBody struct {
	Name   *string                          `json:"name,omitempty"`
	Parent *PostWebLinksIDRequestBodyParent `json:"parent,omitempty"`
}

type PostWebLinksIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PostWebLinksIDPathParams
	QueryParams PostWebLinksIDQueryParams
	Request     *PostWebLinksIDRequestBody `request:"mediaType=application/json"`
}

type PostWebLinksIDResponse struct {
	ClientError          *shared.ClientError
	ContentType          string
	StatusCode           int64
	TrashWebLinkRestored *shared.TrashWebLinkRestored
}
