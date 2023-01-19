package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutFilesIDNumberUpdateSharedLinkPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PutFilesIDNumberUpdateSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum string

const (
	PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnumOpen          PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum = "open"
	PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnumCompany       PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum = "company"
	PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnumCollaborators PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum = "collaborators"
)

type PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkPermissions struct {
	CanDownload *bool `json:"can_download,omitempty"`
	CanEdit     *bool `json:"can_edit,omitempty"`
	CanPreview  *bool `json:"can_preview,omitempty"`
}

// PutFilesIDNumberUpdateSharedLinkRequestBodySharedLink
// The settings for the shared link to update.
type PutFilesIDNumberUpdateSharedLinkRequestBodySharedLink struct {
	Access      *PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum  `json:"access,omitempty"`
	Password    *string                                                           `json:"password,omitempty"`
	Permissions *PutFilesIDNumberUpdateSharedLinkRequestBodySharedLinkPermissions `json:"permissions,omitempty"`
	UnsharedAt  *time.Time                                                        `json:"unshared_at,omitempty"`
	VanityName  *string                                                           `json:"vanity_name,omitempty"`
}

type PutFilesIDNumberUpdateSharedLinkRequestBody struct {
	SharedLink *PutFilesIDNumberUpdateSharedLinkRequestBodySharedLink `json:"shared_link,omitempty"`
}

type PutFilesIDNumberUpdateSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutFilesIDNumberUpdateSharedLinkPathParams
	QueryParams PutFilesIDNumberUpdateSharedLinkQueryParams
	Request     *PutFilesIDNumberUpdateSharedLinkRequestBody `request:"mediaType=application/json"`
}

type PutFilesIDNumberUpdateSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	File        *shared.File
	StatusCode  int64
}
