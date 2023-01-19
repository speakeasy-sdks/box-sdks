package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFilesIDCopyPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PostFilesIDCopyQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

// PostFilesIDCopyRequestBodyParent
// The destination folder to copy the file to.
type PostFilesIDCopyRequestBodyParent struct {
	ID string `json:"id"`
}

type PostFilesIDCopyRequestBody struct {
	Name    *string                          `json:"name,omitempty"`
	Parent  PostFilesIDCopyRequestBodyParent `json:"parent"`
	Version *string                          `json:"version,omitempty"`
}

type PostFilesIDCopyRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PostFilesIDCopyPathParams
	QueryParams PostFilesIDCopyQueryParams
	Request     *PostFilesIDCopyRequestBody `request:"mediaType=application/json"`
}

type PostFilesIDCopyResponse struct {
	ClientError *shared.ClientError
	ContentType string
	File        *shared.File
	StatusCode  int64
}
