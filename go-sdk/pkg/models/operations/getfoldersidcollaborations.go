package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersIDCollaborationsPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type GetFoldersIDCollaborationsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetFoldersIDCollaborationsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFoldersIDCollaborationsPathParams
	QueryParams GetFoldersIDCollaborationsQueryParams
}

type GetFoldersIDCollaborationsResponse struct {
	ClientError    *shared.ClientError
	Collaborations *shared.Collaborations
	ContentType    string
	StatusCode     int64
}
