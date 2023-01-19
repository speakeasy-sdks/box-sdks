package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFoldersQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PostFoldersRequestBodyFolderUploadEmailAccessEnum string

const (
	PostFoldersRequestBodyFolderUploadEmailAccessEnumOpen          PostFoldersRequestBodyFolderUploadEmailAccessEnum = "open"
	PostFoldersRequestBodyFolderUploadEmailAccessEnumCollaborators PostFoldersRequestBodyFolderUploadEmailAccessEnum = "collaborators"
)

// PostFoldersRequestBodyFolderUploadEmail
// The Write Folder Upload Email object
type PostFoldersRequestBodyFolderUploadEmail struct {
	Access *PostFoldersRequestBodyFolderUploadEmailAccessEnum `json:"access,omitempty"`
}

// PostFoldersRequestBodyParent
// The parent folder to create the new folder within.
type PostFoldersRequestBodyParent struct {
	ID string `json:"id"`
}

type PostFoldersRequestBodySyncStateEnum string

const (
	PostFoldersRequestBodySyncStateEnumSynced          PostFoldersRequestBodySyncStateEnum = "synced"
	PostFoldersRequestBodySyncStateEnumNotSynced       PostFoldersRequestBodySyncStateEnum = "not_synced"
	PostFoldersRequestBodySyncStateEnumPartiallySynced PostFoldersRequestBodySyncStateEnum = "partially_synced"
)

type PostFoldersRequestBody struct {
	FolderUploadEmail *PostFoldersRequestBodyFolderUploadEmail `json:"folder_upload_email,omitempty"`
	Name              string                                   `json:"name"`
	Parent            PostFoldersRequestBodyParent             `json:"parent"`
	SyncState         *PostFoldersRequestBodySyncStateEnum     `json:"sync_state,omitempty"`
}

type PostFoldersRequest struct {
	Retries     *utils.RetryConfig
	QueryParams PostFoldersQueryParams
	Request     *PostFoldersRequestBody `request:"mediaType=application/json"`
}

type PostFoldersResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
