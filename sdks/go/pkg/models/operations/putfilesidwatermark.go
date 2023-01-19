package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFilesIDWatermarkPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PutFilesIDWatermarkRequestBodyWatermarkImprintEnum string

const (
	PutFilesIDWatermarkRequestBodyWatermarkImprintEnumDefault PutFilesIDWatermarkRequestBodyWatermarkImprintEnum = "default"
)

// PutFilesIDWatermarkRequestBodyWatermark
// The watermark to imprint on the file
type PutFilesIDWatermarkRequestBodyWatermark struct {
	Imprint PutFilesIDWatermarkRequestBodyWatermarkImprintEnum `json:"imprint"`
}

type PutFilesIDWatermarkRequestBody struct {
	Watermark PutFilesIDWatermarkRequestBodyWatermark `json:"watermark"`
}

type PutFilesIDWatermarkRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutFilesIDWatermarkPathParams
	Request    *PutFilesIDWatermarkRequestBody `request:"mediaType=application/json"`
}

type PutFilesIDWatermarkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Watermark   *shared.Watermark
}
