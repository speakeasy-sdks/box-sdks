package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutWebLinksIDNumberAddSharedLinkPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

type PutWebLinksIDNumberAddSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum string

const (
	PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnumOpen          PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum = "open"
	PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnumCompany       PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum = "company"
	PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnumCollaborators PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum = "collaborators"
)

type PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkPermissions struct {
	CanDownload *bool `json:"can_download,omitempty"`
	CanEdit     *bool `json:"can_edit,omitempty"`
	CanPreview  *bool `json:"can_preview,omitempty"`
}

// PutWebLinksIDNumberAddSharedLinkRequestBodySharedLink
// The settings for the shared link to create on the web link.
//
// Use an empty object (`{}`) to use the default settings for shared
// links.
type PutWebLinksIDNumberAddSharedLinkRequestBodySharedLink struct {
	Access      *PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum  `json:"access,omitempty"`
	Password    *string                                                           `json:"password,omitempty"`
	Permissions *PutWebLinksIDNumberAddSharedLinkRequestBodySharedLinkPermissions `json:"permissions,omitempty"`
	UnsharedAt  *time.Time                                                        `json:"unshared_at,omitempty"`
	VanityName  *string                                                           `json:"vanity_name,omitempty"`
}

type PutWebLinksIDNumberAddSharedLinkRequestBody struct {
	SharedLink *PutWebLinksIDNumberAddSharedLinkRequestBodySharedLink `json:"shared_link,omitempty"`
}

type PutWebLinksIDNumberAddSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutWebLinksIDNumberAddSharedLinkPathParams
	QueryParams PutWebLinksIDNumberAddSharedLinkQueryParams
	Request     *PutWebLinksIDNumberAddSharedLinkRequestBody `request:"mediaType=application/json"`
}

type PutWebLinksIDNumberAddSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	WebLink     *shared.WebLink
}
