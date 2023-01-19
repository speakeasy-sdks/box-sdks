package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFilesIDPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type DeleteFilesIDHeaders struct {
	IfMatch *string `header:"style=simple,explode=false,name=if-match"`
}

type DeleteFilesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFilesIDPathParams
	Headers    DeleteFilesIDHeaders
}

type DeleteFilesIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
