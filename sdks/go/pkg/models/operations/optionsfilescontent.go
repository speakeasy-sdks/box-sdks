package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

// OptionsFilesContentRequestBodyParent
// The parent for this item
type OptionsFilesContentRequestBodyParent struct {
	ID *string `json:"id,omitempty"`
}

type OptionsFilesContentRequestBody struct {
	Name   *string                               `json:"name,omitempty"`
	Parent *OptionsFilesContentRequestBodyParent `json:"parent,omitempty"`
	Size   *int32                                `json:"size,omitempty"`
}

type OptionsFilesContentRequest struct {
	Retries *utils.RetryConfig
	Request *OptionsFilesContentRequestBody `request:"mediaType=application/json"`
}

type OptionsFilesContentResponse struct {
	ClientError   *shared.ClientError
	ConflictError *shared.ConflictError
	ContentType   string
	StatusCode    int64
	UploadURL     *shared.UploadURL
}
