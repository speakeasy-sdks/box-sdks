package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PutFilesIDPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PutFilesIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PutFilesIDHeaders struct {
	IfMatch *string `header:"style=simple,explode=false,name=if-match"`
}

type PutFilesIDRequestBodyLockAccessEnum string

const (
	PutFilesIDRequestBodyLockAccessEnumLock PutFilesIDRequestBodyLockAccessEnum = "lock"
)

// PutFilesIDRequestBodyLock
// Defines a lock on an item. This prevents the item from being
// moved, renamed, or otherwise changed by anyone other than the user
// who created the lock.
//
// Set this to `null` to remove the lock.
type PutFilesIDRequestBodyLock struct {
	Access              *PutFilesIDRequestBodyLockAccessEnum `json:"access,omitempty"`
	ExpiresAt           *time.Time                           `json:"expires_at,omitempty"`
	IsDownloadPrevented *bool                                `json:"is_download_prevented,omitempty"`
}

// PutFilesIDRequestBodyParent
// The parent for this item
type PutFilesIDRequestBodyParent struct {
	ID *string `json:"id,omitempty"`
}

type PutFilesIDRequestBodyPermissionsCanDownloadEnum string

const (
	PutFilesIDRequestBodyPermissionsCanDownloadEnumOpen    PutFilesIDRequestBodyPermissionsCanDownloadEnum = "open"
	PutFilesIDRequestBodyPermissionsCanDownloadEnumCompany PutFilesIDRequestBodyPermissionsCanDownloadEnum = "company"
)

// PutFilesIDRequestBodyPermissions
// Defines who can download a file.
type PutFilesIDRequestBodyPermissions struct {
	CanDownload *PutFilesIDRequestBodyPermissionsCanDownloadEnum `json:"can_download,omitempty"`
}

type PutFilesIDRequestBodySharedLinkAccessEnum string

const (
	PutFilesIDRequestBodySharedLinkAccessEnumOpen          PutFilesIDRequestBodySharedLinkAccessEnum = "open"
	PutFilesIDRequestBodySharedLinkAccessEnumCompany       PutFilesIDRequestBodySharedLinkAccessEnum = "company"
	PutFilesIDRequestBodySharedLinkAccessEnumCollaborators PutFilesIDRequestBodySharedLinkAccessEnum = "collaborators"
)

type PutFilesIDRequestBodySharedLinkPermissions struct {
	CanDownload *bool `json:"can_download,omitempty"`
}

// PutFilesIDRequestBodySharedLink
// Defines a shared link for an item. Set this to `null` to remove
// the shared link.
type PutFilesIDRequestBodySharedLink struct {
	Access      *PutFilesIDRequestBodySharedLinkAccessEnum  `json:"access,omitempty"`
	Password    *string                                     `json:"password,omitempty"`
	Permissions *PutFilesIDRequestBodySharedLinkPermissions `json:"permissions,omitempty"`
	UnsharedAt  *time.Time                                  `json:"unshared_at,omitempty"`
	VanityName  *string                                     `json:"vanity_name,omitempty"`
}

type PutFilesIDRequestBody struct {
	Description   *string                           `json:"description,omitempty"`
	DispositionAt *time.Time                        `json:"disposition_at,omitempty"`
	Lock          *PutFilesIDRequestBodyLock        `json:"lock,omitempty"`
	Name          *string                           `json:"name,omitempty"`
	Parent        *PutFilesIDRequestBodyParent      `json:"parent,omitempty"`
	Permissions   *PutFilesIDRequestBodyPermissions `json:"permissions,omitempty"`
	SharedLink    *PutFilesIDRequestBodySharedLink  `json:"shared_link,omitempty"`
	Tags          []string                          `json:"tags,omitempty"`
}

type PutFilesIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutFilesIDPathParams
	QueryParams PutFilesIDQueryParams
	Headers     PutFilesIDHeaders
	Request     *PutFilesIDRequestBody `request:"mediaType=application/json"`
}

type PutFilesIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	File        *shared.File
	StatusCode  int64
}
