package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFilesIDPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PostFilesIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

// PostFilesIDRequestBodyParent
// The parent for this item
type PostFilesIDRequestBodyParent struct {
	ID *string `json:"id,omitempty"`
}

type PostFilesIDRequestBody struct {
	Name   *string                       `json:"name,omitempty"`
	Parent *PostFilesIDRequestBodyParent `json:"parent,omitempty"`
}

type PostFilesIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PostFilesIDPathParams
	QueryParams PostFilesIDQueryParams
	Request     *PostFilesIDRequestBody `request:"mediaType=application/json"`
}

type PostFilesIDResponse struct {
	ClientError       *shared.ClientError
	ContentType       string
	StatusCode        int64
	TrashFileRestored *shared.TrashFileRestored
}
