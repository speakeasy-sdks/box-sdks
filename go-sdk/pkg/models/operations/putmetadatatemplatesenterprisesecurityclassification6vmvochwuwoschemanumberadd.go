package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

// PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyDataClassification
// Additional details for the classification.
type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyDataClassification struct {
	ClassificationDefinition *string  `json:"classificationDefinition,omitempty"`
	ColorID                  *float64 `json:"colorID,omitempty"`
}

// PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyData
// The details of the classification to add.
type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyData struct {
	Classification *PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyDataClassification `json:"classification,omitempty"`
	Key            string                                                                                                       `json:"key"`
}

// PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBody
// A single classification to add to the enterprise.
type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBody struct {
	Data     PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBodyData `json:"data"`
	FieldKey string                                                                                        `json:"fieldKey"`
	Op       string                                                                                        `json:"op"`
}

type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequest struct {
	Retries *utils.RetryConfig
	Request []PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddRequestBody `request:"mediaType=application/json-patch+json"`
}

type PutMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaNumberAddResponse struct {
	ClassificationTemplate *shared.ClassificationTemplate
	ClientError            *shared.ClientError
	ContentType            string
	StatusCode             int64
}
