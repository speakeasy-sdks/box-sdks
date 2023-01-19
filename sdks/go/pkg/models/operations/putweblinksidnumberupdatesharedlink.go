package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutWebLinksIDNumberUpdateSharedLinkPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

type PutWebLinksIDNumberUpdateSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum string

const (
	PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnumOpen          PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum = "open"
	PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnumCompany       PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum = "company"
	PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnumCollaborators PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum = "collaborators"
)

type PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkPermissions struct {
	CanDownload *bool `json:"can_download,omitempty"`
	CanEdit     *bool `json:"can_edit,omitempty"`
	CanPreview  *bool `json:"can_preview,omitempty"`
}

// PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLink
// The settings for the shared link to update.
type PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLink struct {
	Access      *PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum  `json:"access,omitempty"`
	Password    *string                                                              `json:"password,omitempty"`
	Permissions *PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLinkPermissions `json:"permissions,omitempty"`
	UnsharedAt  *time.Time                                                           `json:"unshared_at,omitempty"`
	VanityName  *string                                                              `json:"vanity_name,omitempty"`
}

type PutWebLinksIDNumberUpdateSharedLinkRequestBody struct {
	SharedLink *PutWebLinksIDNumberUpdateSharedLinkRequestBodySharedLink `json:"shared_link,omitempty"`
}

type PutWebLinksIDNumberUpdateSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutWebLinksIDNumberUpdateSharedLinkPathParams
	QueryParams PutWebLinksIDNumberUpdateSharedLinkQueryParams
	Request     *PutWebLinksIDNumberUpdateSharedLinkRequestBody `request:"mediaType=application/json"`
}

type PutWebLinksIDNumberUpdateSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	WebLink     *shared.WebLink
}
