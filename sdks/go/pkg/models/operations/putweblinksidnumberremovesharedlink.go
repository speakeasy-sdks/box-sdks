package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutWebLinksIDNumberRemoveSharedLinkPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

type PutWebLinksIDNumberRemoveSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type PutWebLinksIDNumberRemoveSharedLinkRequestBody struct {
	SharedLink map[string]interface{} `json:"shared_link,omitempty"`
}

type PutWebLinksIDNumberRemoveSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutWebLinksIDNumberRemoveSharedLinkPathParams
	QueryParams PutWebLinksIDNumberRemoveSharedLinkQueryParams
	Request     *PutWebLinksIDNumberRemoveSharedLinkRequestBody `request:"mediaType=application/json"`
}

type PutWebLinksIDNumberRemoveSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	WebLink     *shared.WebLink
}
