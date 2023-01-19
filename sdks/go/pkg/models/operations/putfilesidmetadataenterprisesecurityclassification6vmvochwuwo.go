package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnum string

const (
	PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnumReplace PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnum = "replace"
)

type PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnum string

const (
	PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnumRootBoxSecurityClassificationKey PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnum = "/Box__Security__Classification__Key"
)

// PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody
// The operation to perform on the classification
// metadata template instance. In this case, it use
// used to replace the value stored for the
// `Box__Security__Classification__Key` field with a new
// value.
type PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody struct {
	Op    *PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnum   `json:"op,omitempty"`
	Path  *PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnum `json:"path,omitempty"`
	Value *string                                                                           `json:"value,omitempty"`
}

type PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams
	Request    []PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody `request:"mediaType=application/json-patch+json"`
}

type PutFilesIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse struct {
	Classification *shared.Classification
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
}
