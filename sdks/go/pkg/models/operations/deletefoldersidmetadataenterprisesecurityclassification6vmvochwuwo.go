package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams
}

type DeleteFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
