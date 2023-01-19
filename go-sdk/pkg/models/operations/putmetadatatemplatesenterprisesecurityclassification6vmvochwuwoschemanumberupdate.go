package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

// PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyDataClassification
// Additional details for the classification.
type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyDataClassification struct {
	ClassificationDefinition *string  `json:"classificationDefinition,omitempty"`
	ColorID                  *float64 `json:"colorID,omitempty"`
}

// PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyData
// The details of the updated classification.
type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyData struct {
	Classification *PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyDataClassification `json:"classification,omitempty"`
	Key            string                                                                                                          `json:"key"`
}

// PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBody
// A single classification to update.
type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBody struct {
	Data          PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBodyData `json:"data"`
	EnumOptionKey string                                                                                           `json:"enumOptionKey"`
	FieldKey      string                                                                                           `json:"fieldKey"`
	Op            string                                                                                           `json:"op"`
}

type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequest struct {
	Retries *utils.RetryConfig
	Request []PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateRequestBody `request:"mediaType=application/json-patch+json"`
}

type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberUpdateResponse struct {
	ClassificationTemplate *shared.ClassificationTemplate
	ClientError            *shared.ClientError
	ContentType            string
	StatusCode             int64
}
