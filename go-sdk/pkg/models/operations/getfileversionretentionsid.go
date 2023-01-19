package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFileVersionRetentionsIDPathParams struct {
	FileVersionRetentionID string `pathParam:"style=simple,explode=false,name=file_version_retention_id"`
}

type GetFileVersionRetentionsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFileVersionRetentionsIDPathParams
}

type GetFileVersionRetentionsIDResponse struct {
	ClientError          *shared.ClientError
	ContentType          string
	FileVersionRetention *shared.FileVersionRetention
	StatusCode           int64
}
