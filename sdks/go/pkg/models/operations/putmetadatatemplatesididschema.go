package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutMetadataTemplatesIDIDSchemaScopeEnum string

const (
	PutMetadataTemplatesIDIDSchemaScopeEnumGlobal     PutMetadataTemplatesIDIDSchemaScopeEnum = "global"
	PutMetadataTemplatesIDIDSchemaScopeEnumEnterprise PutMetadataTemplatesIDIDSchemaScopeEnum = "enterprise"
)

type PutMetadataTemplatesIDIDSchemaPathParams struct {
	Scope       PutMetadataTemplatesIDIDSchemaScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                                  `pathParam:"style=simple,explode=false,name=template_key"`
}

type PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum string

const (
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumEditTemplate              PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "editTemplate"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumAddField                  PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "addField"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumReorderFields             PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "reorderFields"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumAddEnumOption             PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "addEnumOption"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumReorderEnumOptions        PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "reorderEnumOptions"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumReorderMultiSelectOptions PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "reorderMultiSelectOptions"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumAddMultiSelectOption      PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "addMultiSelectOption"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumEditField                 PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "editField"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumRemoveField               PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "removeField"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumEditEnumOption            PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "editEnumOption"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumRemoveEnumOption          PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "removeEnumOption"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumEditMultiSelectOption     PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "editMultiSelectOption"
	PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnumRemoveMultiSelectOption   PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum = "removeMultiSelectOption"
)

// PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperation
// A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
// change to make to the metadata instance.
type PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperation struct {
	Data                  map[string]string                                                    `json:"data,omitempty"`
	EnumOptionKey         *string                                                              `json:"enumOptionKey,omitempty"`
	EnumOptionKeys        []string                                                             `json:"enumOptionKeys,omitempty"`
	FieldKey              *string                                                              `json:"fieldKey,omitempty"`
	FieldKeys             []string                                                             `json:"fieldKeys,omitempty"`
	MultiSelectOptionKey  *string                                                              `json:"multiSelectOptionKey,omitempty"`
	MultiSelectOptionKeys []string                                                             `json:"multiSelectOptionKeys,omitempty"`
	Op                    PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperationOpEnum `json:"op"`
}

type PutMetadataTemplatesIDIDSchemaRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutMetadataTemplatesIDIDSchemaPathParams
	Request    []PutMetadataTemplatesIDIDSchemaAMetadataTemplateUpdateOperation `request:"mediaType=application/json-patch+json"`
}

type PutMetadataTemplatesIDIDSchemaResponse struct {
	ClientError      *shared.ClientError
	ContentType      string
	MetadataTemplate *shared.MetadataTemplate
	StatusCode       int64
}
