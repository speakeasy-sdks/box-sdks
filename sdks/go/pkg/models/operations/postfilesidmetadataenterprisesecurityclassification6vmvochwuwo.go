package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody struct {
	BoxSecurityClassificationKey *string `json:"Box__Security__Classification__Key,omitempty"`
}

type PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams
	Request    *PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody `request:"mediaType=application/json"`
}

type PostFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse struct {
	Classification *shared.Classification
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
}
