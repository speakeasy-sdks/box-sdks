package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

// PostWebLinksRequestBodyParent
// The parent folder to create the web link within.
type PostWebLinksRequestBodyParent struct {
	ID string `json:"id"`
}

type PostWebLinksRequestBodySharedLinkAccessEnum string

const (
	PostWebLinksRequestBodySharedLinkAccessEnumOpen          PostWebLinksRequestBodySharedLinkAccessEnum = "open"
	PostWebLinksRequestBodySharedLinkAccessEnumCompany       PostWebLinksRequestBodySharedLinkAccessEnum = "company"
	PostWebLinksRequestBodySharedLinkAccessEnumCollaborators PostWebLinksRequestBodySharedLinkAccessEnum = "collaborators"
)

// PostWebLinksRequestBodySharedLink
// The settings for the shared link to update.
type PostWebLinksRequestBodySharedLink struct {
	Access     *PostWebLinksRequestBodySharedLinkAccessEnum `json:"access,omitempty"`
	Password   *string                                      `json:"password,omitempty"`
	UnsharedAt *time.Time                                   `json:"unshared_at,omitempty"`
	VanityName *string                                      `json:"vanity_name,omitempty"`
}

type PostWebLinksRequestBody struct {
	Description *string                            `json:"description,omitempty"`
	Name        *string                            `json:"name,omitempty"`
	Parent      PostWebLinksRequestBodyParent      `json:"parent"`
	SharedLink  *PostWebLinksRequestBodySharedLink `json:"shared_link,omitempty"`
	URL         string                             `json:"url"`
}

type PostWebLinksRequest struct {
	Retries *utils.RetryConfig
	Request *PostWebLinksRequestBody `request:"mediaType=application/json"`
}

type PostWebLinksResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	WebLink     *shared.WebLink
}
