package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnum string

const (
	PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnumReplace PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnum = "replace"
)

type PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnum string

const (
	PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnumRootBoxSecurityClassificationKey PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnum = "/Box__Security__Classification__Key"
)

// PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody
// The operation to perform on the classification
// metadata template instance. In this case, it use
// used to replace the value stored for the
// `Box__Security__Classification__Key` field with a new
// value.
type PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody struct {
	Op    *PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyOpEnum   `json:"op,omitempty"`
	Path  *PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBodyPathEnum `json:"path,omitempty"`
	Value *string                                                                             `json:"value,omitempty"`
}

type PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoPathParams
	Request    []PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoRequestBody `request:"mediaType=application/json-patch+json"`
}

type PutFoldersIDMetadataEnterpriseSecurityClassification6VMVochwUWoResponse struct {
	Classification *shared.Classification
	ClientError    *shared.ClientError
	ContentType    string
	StatusCode     int64
}
