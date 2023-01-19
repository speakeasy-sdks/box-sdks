package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFoldersIDNumberRemoveSharedLinkPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type PutFoldersIDNumberRemoveSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type PutFoldersIDNumberRemoveSharedLinkRequestBody struct {
	SharedLink map[string]interface{} `json:"shared_link,omitempty"`
}

type PutFoldersIDNumberRemoveSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutFoldersIDNumberRemoveSharedLinkPathParams
	QueryParams PutFoldersIDNumberRemoveSharedLinkQueryParams
	Request     *PutFoldersIDNumberRemoveSharedLinkRequestBody `request:"mediaType=application/json"`
}

type PutFoldersIDNumberRemoveSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
