package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFoldersIDPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type PostFoldersIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

// PostFoldersIDRequestBodyParent
// The parent for this item
type PostFoldersIDRequestBodyParent struct {
	ID *string `json:"id,omitempty"`
}

type PostFoldersIDRequestBody struct {
	Name   *string                         `json:"name,omitempty"`
	Parent *PostFoldersIDRequestBodyParent `json:"parent,omitempty"`
}

type PostFoldersIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PostFoldersIDPathParams
	QueryParams PostFoldersIDQueryParams
	Request     *PostFoldersIDRequestBody `request:"mediaType=application/json"`
}

type PostFoldersIDResponse struct {
	ClientError         *shared.ClientError
	ContentType         string
	StatusCode          int64
	TrashFolderRestored *shared.TrashFolderRestored
}
