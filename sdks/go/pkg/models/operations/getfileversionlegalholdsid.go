package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFileVersionLegalHoldsIDPathParams struct {
	FileVersionLegalHoldID string `pathParam:"style=simple,explode=false,name=file_version_legal_hold_id"`
}

type GetFileVersionLegalHoldsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFileVersionLegalHoldsIDPathParams
}

type GetFileVersionLegalHoldsIDResponse struct {
	ClientError          *shared.ClientError
	ContentType          string
	FileVersionLegalHold *shared.FileVersionLegalHold
	StatusCode           int64
}
