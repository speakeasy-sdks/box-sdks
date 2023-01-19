package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

// PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite
// An option for a Metadata Template Field.
//
// Options only need to be provided for fields of type `enum` and `multiSelect`.
// Options represent the value(s) a user can select for the field either through
// the UI or through the API.
type PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite struct {
	Key string `json:"key"`
}

type PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum string

const (
	PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnumString      PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum = "string"
	PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnumFloat       PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum = "float"
	PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnumDate        PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum = "date"
	PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnumEnum        PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum = "enum"
	PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnumMultiSelect PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum = "multiSelect"
)

// PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite
// A field within a metadata template. Fields can be a basic text, date, or
// number field, or a list of options.
type PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite struct {
	Description *string                                                                       `json:"description,omitempty"`
	DisplayName string                                                                        `json:"displayName"`
	Hidden      *bool                                                                         `json:"hidden,omitempty"`
	Key         string                                                                        `json:"key"`
	Options     []PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite `json:"options,omitempty"`
	Type        PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum              `json:"type"`
}

type PostMetadataTemplatesSchemaRequestBody struct {
	CopyInstanceOnItemCopy *bool                                                      `json:"copyInstanceOnItemCopy,omitempty"`
	DisplayName            string                                                     `json:"displayName"`
	Fields                 []PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite `json:"fields,omitempty"`
	Hidden                 *bool                                                      `json:"hidden,omitempty"`
	Scope                  string                                                     `json:"scope"`
	TemplateKey            *string                                                    `json:"templateKey,omitempty"`
}

type PostMetadataTemplatesSchemaRequest struct {
	Retries *utils.RetryConfig
	Request *PostMetadataTemplatesSchemaRequestBody `request:"mediaType=application/json"`
}

type PostMetadataTemplatesSchemaResponse struct {
	ClientError      *shared.ClientError
	ContentType      string
	MetadataTemplate *shared.MetadataTemplate
	StatusCode       int64
}
