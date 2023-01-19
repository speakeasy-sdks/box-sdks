package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFilesIDMetadataGlobalBoxSkillsCardsPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PutFilesIDMetadataGlobalBoxSkillsCardsRequestBodyOpEnum string

const (
	PutFilesIDMetadataGlobalBoxSkillsCardsRequestBodyOpEnumReplace PutFilesIDMetadataGlobalBoxSkillsCardsRequestBodyOpEnum = "replace"
)

// PutFilesIDMetadataGlobalBoxSkillsCardsRequestBody
// An operation that replaces an existing card.
type PutFilesIDMetadataGlobalBoxSkillsCardsRequestBody struct {
	Op    *PutFilesIDMetadataGlobalBoxSkillsCardsRequestBodyOpEnum `json:"op,omitempty"`
	Path  *string                                                  `json:"path,omitempty"`
	Value *interface{}                                             `json:"value,omitempty"`
}

type PutFilesIDMetadataGlobalBoxSkillsCardsRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutFilesIDMetadataGlobalBoxSkillsCardsPathParams
	Request    []PutFilesIDMetadataGlobalBoxSkillsCardsRequestBody `request:"mediaType=application/json-patch+json"`
}

type PutFilesIDMetadataGlobalBoxSkillsCardsResponse struct {
	ClientError        *shared.ClientError
	ContentType        string
	SkillCardsMetadata *shared.SkillCardsMetadata
	StatusCode         int64
}
