package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams
}

type GetFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse struct {
	Classification *shared.Classification
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
}
