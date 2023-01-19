package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFilesIDMetadataIDIDScopeEnum string

const (
	PutFilesIDMetadataIDIDScopeEnumGlobal     PutFilesIDMetadataIDIDScopeEnum = "global"
	PutFilesIDMetadataIDIDScopeEnumEnterprise PutFilesIDMetadataIDIDScopeEnum = "enterprise"
)

type PutFilesIDMetadataIDIDPathParams struct {
	FileID      string                          `pathParam:"style=simple,explode=false,name=file_id"`
	Scope       PutFilesIDMetadataIDIDScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                          `pathParam:"style=simple,explode=false,name=template_key"`
}

type PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum string

const (
	PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumAdd     PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "add"
	PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumReplace PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "replace"
	PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumRemove  PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "remove"
	PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumTest    PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "test"
	PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumMove    PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "move"
	PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumCopy    PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "copy"
)

// PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperation
// A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
// change to make to the metadata instance.
type PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperation struct {
	From  *string                                                       `json:"from,omitempty"`
	Op    *PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum `json:"op,omitempty"`
	Path  *string                                                       `json:"path,omitempty"`
	Value *string                                                       `json:"value,omitempty"`
}

type PutFilesIDMetadataIDIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutFilesIDMetadataIDIDPathParams
	Request    []PutFilesIDMetadataIDIDAMetadataInstanceUpdateOperation `request:"mediaType=application/json-patch+json"`
}

type PutFilesIDMetadataIDIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Metadata    *shared.Metadata
	StatusCode  int64
}
