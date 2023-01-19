package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDThumbnailIDExtensionEnum string

const (
	GetFilesIDThumbnailIDExtensionEnumPng GetFilesIDThumbnailIDExtensionEnum = "png"
	GetFilesIDThumbnailIDExtensionEnumJpg GetFilesIDThumbnailIDExtensionEnum = "jpg"
)

type GetFilesIDThumbnailIDPathParams struct {
	Extension GetFilesIDThumbnailIDExtensionEnum `pathParam:"style=simple,explode=false,name=extension"`
	FileID    string                             `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDThumbnailIDQueryParams struct {
	MaxHeight *int64 `queryParam:"style=form,explode=true,name=max_height"`
	MaxWidth  *int64 `queryParam:"style=form,explode=true,name=max_width"`
	MinHeight *int64 `queryParam:"style=form,explode=true,name=min_height"`
	MinWidth  *int64 `queryParam:"style=form,explode=true,name=min_width"`
}

type GetFilesIDThumbnailIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFilesIDThumbnailIDPathParams
	QueryParams GetFilesIDThumbnailIDQueryParams
}

type GetFilesIDThumbnailIDResponse struct {
	ClientError                                  *shared.ClientError
	ContentType                                  string
	Headers                                      map[string][]string
	StatusCode                                   int64
	GetFilesIDThumbnailID200ImageJpgBinaryString []byte
	GetFilesIDThumbnailID200ImagePngBinaryString []byte
}
