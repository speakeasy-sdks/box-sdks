package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFoldersIDCopyPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type PostFoldersIDCopyQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

// PostFoldersIDCopyRequestBodyParent
// The destination folder to copy the folder to.
type PostFoldersIDCopyRequestBodyParent struct {
	ID string `json:"id"`
}

type PostFoldersIDCopyRequestBody struct {
	Name   *string                            `json:"name,omitempty"`
	Parent PostFoldersIDCopyRequestBodyParent `json:"parent"`
}

type PostFoldersIDCopyRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PostFoldersIDCopyPathParams
	QueryParams PostFoldersIDCopyQueryParams
	Request     *PostFoldersIDCopyRequestBody `request:"mediaType=application/json"`
}

type PostFoldersIDCopyResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
