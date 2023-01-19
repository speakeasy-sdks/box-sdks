package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFoldersIDPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type DeleteFoldersIDQueryParams struct {
	Recursive *bool `queryParam:"style=form,explode=true,name=recursive"`
}

type DeleteFoldersIDHeaders struct {
	IfMatch *string `header:"style=simple,explode=false,name=if-match"`
}

type DeleteFoldersIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  DeleteFoldersIDPathParams
	QueryParams DeleteFoldersIDQueryParams
	Headers     DeleteFoldersIDHeaders
}

type DeleteFoldersIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
