package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody struct {
	BoxSecurityClassificationKey *string `json:"Box__Security__Classification__Key,omitempty"`
}

type PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams
	Request    *PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody `request:"mediaType=application/json"`
}

type PostFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse struct {
	Classification *shared.Classification
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
}
