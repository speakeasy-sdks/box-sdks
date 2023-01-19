package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PostCollaborationsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Notify *bool    `queryParam:"style=form,explode=true,name=notify"`
}

type PostCollaborationsRequestBodyAccessibleByTypeEnum string

const (
	PostCollaborationsRequestBodyAccessibleByTypeEnumUser  PostCollaborationsRequestBodyAccessibleByTypeEnum = "user"
	PostCollaborationsRequestBodyAccessibleByTypeEnumGroup PostCollaborationsRequestBodyAccessibleByTypeEnum = "group"
)

// PostCollaborationsRequestBodyAccessibleBy
// The user or group to give access to the item.
type PostCollaborationsRequestBodyAccessibleBy struct {
	ID    *string                                           `json:"id,omitempty"`
	Login *string                                           `json:"login,omitempty"`
	Type  PostCollaborationsRequestBodyAccessibleByTypeEnum `json:"type"`
}

type PostCollaborationsRequestBodyItemTypeEnum string

const (
	PostCollaborationsRequestBodyItemTypeEnumFile   PostCollaborationsRequestBodyItemTypeEnum = "file"
	PostCollaborationsRequestBodyItemTypeEnumFolder PostCollaborationsRequestBodyItemTypeEnum = "folder"
)

// PostCollaborationsRequestBodyItem
// The item to attach the comment to.
type PostCollaborationsRequestBodyItem struct {
	ID   string                                    `json:"id"`
	Type PostCollaborationsRequestBodyItemTypeEnum `json:"type"`
}

type PostCollaborationsRequestBodyRoleEnum string

const (
	PostCollaborationsRequestBodyRoleEnumEditor            PostCollaborationsRequestBodyRoleEnum = "editor"
	PostCollaborationsRequestBodyRoleEnumViewer            PostCollaborationsRequestBodyRoleEnum = "viewer"
	PostCollaborationsRequestBodyRoleEnumPreviewer         PostCollaborationsRequestBodyRoleEnum = "previewer"
	PostCollaborationsRequestBodyRoleEnumUploader          PostCollaborationsRequestBodyRoleEnum = "uploader"
	PostCollaborationsRequestBodyRoleEnumPreviewerUploader PostCollaborationsRequestBodyRoleEnum = "previewer uploader"
	PostCollaborationsRequestBodyRoleEnumViewerUploader    PostCollaborationsRequestBodyRoleEnum = "viewer uploader"
	PostCollaborationsRequestBodyRoleEnumCoOwner           PostCollaborationsRequestBodyRoleEnum = "co-owner"
)

type PostCollaborationsRequestBody struct {
	AccessibleBy PostCollaborationsRequestBodyAccessibleBy `json:"accessible_by"`
	CanViewPath  *bool                                     `json:"can_view_path,omitempty"`
	ExpiresAt    *time.Time                                `json:"expires_at,omitempty"`
	Item         PostCollaborationsRequestBodyItem         `json:"item"`
	Role         PostCollaborationsRequestBodyRoleEnum     `json:"role"`
}

type PostCollaborationsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams PostCollaborationsQueryParams
	Request     *PostCollaborationsRequestBody `request:"mediaType=application/json"`
}

type PostCollaborationsResponse struct {
	ClientError   *shared.ClientError
	Collaboration *shared.Collaboration
	ContentType   string
	StatusCode    int64
}
