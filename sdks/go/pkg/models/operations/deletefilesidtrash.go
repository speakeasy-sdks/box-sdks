package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFilesIDTrashPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type DeleteFilesIDTrashRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFilesIDTrashPathParams
}

type DeleteFilesIDTrashResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
