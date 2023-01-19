package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersIDPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type GetFoldersIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetFoldersIDHeaders struct {
	Boxapi      *string `header:"style=simple,explode=false,name=boxapi"`
	IfNoneMatch *string `header:"style=simple,explode=false,name=if-none-match"`
}

type GetFoldersIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFoldersIDPathParams
	QueryParams GetFoldersIDQueryParams
	Headers     GetFoldersIDHeaders
}

type GetFoldersIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
