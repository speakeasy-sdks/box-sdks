package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFilesIDVersionsCurrentPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PostFilesIDVersionsCurrentQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PostFilesIDVersionsCurrentRequestBodyTypeEnum string

const (
	PostFilesIDVersionsCurrentRequestBodyTypeEnumFileVersion PostFilesIDVersionsCurrentRequestBodyTypeEnum = "file_version"
)

// PostFilesIDVersionsCurrentRequestBody
// The file version to promote
type PostFilesIDVersionsCurrentRequestBody struct {
	ID   *string                                        `json:"id,omitempty"`
	Type *PostFilesIDVersionsCurrentRequestBodyTypeEnum `json:"type,omitempty"`
}

type PostFilesIDVersionsCurrentRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PostFilesIDVersionsCurrentPathParams
	QueryParams PostFilesIDVersionsCurrentQueryParams
	Request     *PostFilesIDVersionsCurrentRequestBody `request:"mediaType=application/json"`
}

type PostFilesIDVersionsCurrentResponse struct {
	ClientError *shared.ClientError
	ContentType string
	FileVersion *shared.FileVersion
	StatusCode  int64
}
