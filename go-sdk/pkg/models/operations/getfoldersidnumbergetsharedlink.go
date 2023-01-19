package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersIDNumberGetSharedLinkPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type GetFoldersIDNumberGetSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type GetFoldersIDNumberGetSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFoldersIDNumberGetSharedLinkPathParams
	QueryParams GetFoldersIDNumberGetSharedLinkQueryParams
}

type GetFoldersIDNumberGetSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
