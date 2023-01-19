package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFoldersIDWatermarkPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type PutFoldersIDWatermarkRequestBodyWatermarkImprintEnum string

const (
	PutFoldersIDWatermarkRequestBodyWatermarkImprintEnumDefault PutFoldersIDWatermarkRequestBodyWatermarkImprintEnum = "default"
)

// PutFoldersIDWatermarkRequestBodyWatermark
// The watermark to imprint on the folder
type PutFoldersIDWatermarkRequestBodyWatermark struct {
	Imprint PutFoldersIDWatermarkRequestBodyWatermarkImprintEnum `json:"imprint"`
}

type PutFoldersIDWatermarkRequestBody struct {
	Watermark PutFoldersIDWatermarkRequestBodyWatermark `json:"watermark"`
}

type PutFoldersIDWatermarkRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutFoldersIDWatermarkPathParams
	Request    *PutFoldersIDWatermarkRequestBody `request:"mediaType=application/json"`
}

type PutFoldersIDWatermarkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Watermark   *shared.Watermark
}
