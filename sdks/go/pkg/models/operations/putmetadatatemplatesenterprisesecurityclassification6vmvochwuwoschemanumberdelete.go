package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

// PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteRequestBody
// A single classification to remove.
type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteRequestBody struct {
	EnumOptionKey string `json:"enumOptionKey"`
	FieldKey      string `json:"fieldKey"`
	Op            string `json:"op"`
}

type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteRequest struct {
	Retries *utils.RetryConfig
	Request []PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteRequestBody `request:"mediaType=application/json-patch+json"`
}

type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberDeleteResponse struct {
	ClassificationTemplate *shared.ClassificationTemplate
	ClientError            *shared.ClientError
	ContentType            string
	StatusCode             int64
}
