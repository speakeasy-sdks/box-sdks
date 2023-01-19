package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFoldersIDMetadataIDIDScopeEnum string

const (
	PutFoldersIDMetadataIDIDScopeEnumGlobal     PutFoldersIDMetadataIDIDScopeEnum = "global"
	PutFoldersIDMetadataIDIDScopeEnumEnterprise PutFoldersIDMetadataIDIDScopeEnum = "enterprise"
)

type PutFoldersIDMetadataIDIDPathParams struct {
	FolderID    string                            `pathParam:"style=simple,explode=false,name=folder_id"`
	Scope       PutFoldersIDMetadataIDIDScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                            `pathParam:"style=simple,explode=false,name=template_key"`
}

type PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum string

const (
	PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumAdd     PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "add"
	PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumReplace PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "replace"
	PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumRemove  PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "remove"
	PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumTest    PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "test"
	PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumMove    PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "move"
	PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnumCopy    PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum = "copy"
)

// PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperation
// A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
// change to make to the metadata instance.
type PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperation struct {
	From  *string                                                         `json:"from,omitempty"`
	Op    *PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperationOpEnum `json:"op,omitempty"`
	Path  *string                                                         `json:"path,omitempty"`
	Value *string                                                         `json:"value,omitempty"`
}

type PutFoldersIDMetadataIDIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutFoldersIDMetadataIDIDPathParams
	Request    []PutFoldersIDMetadataIDIDAMetadataInstanceUpdateOperation `request:"mediaType=application/json-patch+json"`
}

type PutFoldersIDMetadataIDIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Metadata    *shared.Metadata
	StatusCode  int64
}
