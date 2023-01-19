package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutFilesIDNumberAddSharedLinkPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PutFilesIDNumberAddSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum string

const (
	PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnumOpen          PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum = "open"
	PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnumCompany       PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum = "company"
	PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnumCollaborators PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum = "collaborators"
)

type PutFilesIDNumberAddSharedLinkRequestBodySharedLinkPermissions struct {
	CanDownload *bool `json:"can_download,omitempty"`
	CanEdit     *bool `json:"can_edit,omitempty"`
	CanPreview  *bool `json:"can_preview,omitempty"`
}

// PutFilesIDNumberAddSharedLinkRequestBodySharedLink
// The settings for the shared link to create on the file.
// Use an empty object (`{}`) to use the default settings for shared
// links.
type PutFilesIDNumberAddSharedLinkRequestBodySharedLink struct {
	Access      *PutFilesIDNumberAddSharedLinkRequestBodySharedLinkAccessEnum  `json:"access,omitempty"`
	Password    *string                                                        `json:"password,omitempty"`
	Permissions *PutFilesIDNumberAddSharedLinkRequestBodySharedLinkPermissions `json:"permissions,omitempty"`
	UnsharedAt  *time.Time                                                     `json:"unshared_at,omitempty"`
	VanityName  *string                                                        `json:"vanity_name,omitempty"`
}

type PutFilesIDNumberAddSharedLinkRequestBody struct {
	SharedLink *PutFilesIDNumberAddSharedLinkRequestBodySharedLink `json:"shared_link,omitempty"`
}

type PutFilesIDNumberAddSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutFilesIDNumberAddSharedLinkPathParams
	QueryParams PutFilesIDNumberAddSharedLinkQueryParams
	Request     *PutFilesIDNumberAddSharedLinkRequestBody `request:"mediaType=application/json"`
}

type PutFilesIDNumberAddSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	File        *shared.File
	StatusCode  int64
}
