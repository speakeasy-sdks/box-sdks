package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutWebLinksIDPathParams struct {
	WebLinkID string `pathParam:"style=simple,explode=false,name=web_link_id"`
}

// PutWebLinksIDRequestBodyParent
// The parent for this item
type PutWebLinksIDRequestBodyParent struct {
	ID *string `json:"id,omitempty"`
}

type PutWebLinksIDRequestBodySharedLinkAccessEnum string

const (
	PutWebLinksIDRequestBodySharedLinkAccessEnumOpen          PutWebLinksIDRequestBodySharedLinkAccessEnum = "open"
	PutWebLinksIDRequestBodySharedLinkAccessEnumCompany       PutWebLinksIDRequestBodySharedLinkAccessEnum = "company"
	PutWebLinksIDRequestBodySharedLinkAccessEnumCollaborators PutWebLinksIDRequestBodySharedLinkAccessEnum = "collaborators"
)

// PutWebLinksIDRequestBodySharedLink
// The settings for the shared link to update.
type PutWebLinksIDRequestBodySharedLink struct {
	Access     *PutWebLinksIDRequestBodySharedLinkAccessEnum `json:"access,omitempty"`
	Password   *string                                       `json:"password,omitempty"`
	UnsharedAt *time.Time                                    `json:"unshared_at,omitempty"`
	VanityName *string                                       `json:"vanity_name,omitempty"`
}

type PutWebLinksIDRequestBody struct {
	Description *string                             `json:"description,omitempty"`
	Name        *string                             `json:"name,omitempty"`
	Parent      *PutWebLinksIDRequestBodyParent     `json:"parent,omitempty"`
	SharedLink  *PutWebLinksIDRequestBodySharedLink `json:"shared_link,omitempty"`
	URL         *string                             `json:"url,omitempty"`
}

type PutWebLinksIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutWebLinksIDPathParams
	Request    *PutWebLinksIDRequestBody `request:"mediaType=application/json"`
}

type PutWebLinksIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	WebLink     *shared.WebLink
}
