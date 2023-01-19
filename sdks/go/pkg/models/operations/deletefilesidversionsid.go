package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFilesIDVersionsIDPathParams struct {
	FileID        string `pathParam:"style=simple,explode=false,name=file_id"`
	FileVersionID string `pathParam:"style=simple,explode=false,name=file_version_id"`
}

type DeleteFilesIDVersionsIDHeaders struct {
	IfMatch *string `header:"style=simple,explode=false,name=if-match"`
}

type DeleteFilesIDVersionsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFilesIDVersionsIDPathParams
	Headers    DeleteFilesIDVersionsIDHeaders
}

type DeleteFilesIDVersionsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
