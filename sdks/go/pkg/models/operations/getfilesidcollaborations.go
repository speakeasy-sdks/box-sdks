package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDCollaborationsPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDCollaborationsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64   `queryParam:"style=form,explode=true,name=limit"`
	Marker *string  `queryParam:"style=form,explode=true,name=marker"`
}

type GetFilesIDCollaborationsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFilesIDCollaborationsPathParams
	QueryParams GetFilesIDCollaborationsQueryParams
}

type GetFilesIDCollaborationsResponse struct {
	ClientError    *shared.ClientError
	Collaborations *shared.Collaborations
	ContentType    string
	StatusCode     int64
}
