package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFilesIDVersionsIDPathParams struct {
	FileID        string `pathParam:"style=simple,explode=false,name=file_id"`
	FileVersionID string `pathParam:"style=simple,explode=false,name=file_version_id"`
}

// PutFilesIDVersionsIDRequestBody
// The file version to be
// restored
type PutFilesIDVersionsIDRequestBody struct {
	TrashedAt *string `json:"trashed_at,omitempty"`
}

type PutFilesIDVersionsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutFilesIDVersionsIDPathParams
	Request    *PutFilesIDVersionsIDRequestBody `request:"mediaType=application/json"`
}

type PutFilesIDVersionsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	FileVersion *shared.FileVersion
	StatusCode  int64
}
