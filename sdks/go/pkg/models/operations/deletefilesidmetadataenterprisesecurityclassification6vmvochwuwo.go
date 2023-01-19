package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type DeleteFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams
}

type DeleteFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
