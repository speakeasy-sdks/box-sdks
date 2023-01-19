package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostMetadataQueriesExecuteReadRequest struct {
	Retries *utils.RetryConfig
	Request *shared.MetadataQuery `request:"mediaType=application/json"`
}

type PostMetadataQueriesExecuteReadResponse struct {
	ClientError          *shared.ClientError
	ContentType          string
	MetadataQueryResults *shared.MetadataQueryResults
	StatusCode           int64
}
