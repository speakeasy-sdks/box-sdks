package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersIDMetadataPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type GetFoldersIDMetadataRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFoldersIDMetadataPathParams
}

type GetFoldersIDMetadataResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Metadatas   *shared.Metadatas
	StatusCode  int64
}
