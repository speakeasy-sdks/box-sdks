package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDMetadataPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDMetadataRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFilesIDMetadataPathParams
}

type GetFilesIDMetadataResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Metadatas   *shared.Metadatas
	StatusCode  int64
}
