package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnum string

const (
	PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnumClassification PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnum = "Classification"
)

type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnum string

const (
	PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnumClassification PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnum = "Classification"
)

type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnum string

const (
	PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnumBoxSecurityClassificationKey PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnum = "Box__Security__Classification__Key"
)

// PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification
// Additional information about the classification.
type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification struct {
	ClassificationDefinition *string  `json:"classificationDefinition,omitempty"`
	ColorID                  *float64 `json:"colorID,omitempty"`
}

// PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig
// Additional information about the classification.
type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig struct {
	Classification *PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification `json:"classification,omitempty"`
}

// PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions
// An individual classification.
type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions struct {
	Key          *string                                                                               `json:"key,omitempty"`
	StaticConfig *PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig `json:"staticConfig,omitempty"`
}

type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnum string

const (
	PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnumEnum PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnum = "enum"
)

// PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields
// The `enum` field which holds all the valid classification
// values.
type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields struct {
	DisplayName *PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnum `json:"displayName,omitempty"`
	Hidden      *bool                                                                             `json:"hidden,omitempty"`
	Key         *PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnum         `json:"key,omitempty"`
	Options     []PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions        `json:"options,omitempty"`
	Type        *PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnum        `json:"type,omitempty"`
}

type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnum string

const (
	PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnumEnterprise PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnum = "enterprise"
)

type PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnum string

const (
	PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnumSecurityClassification6VMVochwUWo PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnum = "securityClassification-6VMVochwUWo"
)

type PostMetadataTemplatesSchemaNumberClassificationsRequestBody struct {
	CopyInstanceOnItemCopy *bool                                                                       `json:"copyInstanceOnItemCopy,omitempty"`
	DisplayName            PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnum  `json:"displayName"`
	Fields                 []PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields         `json:"fields,omitempty"`
	Hidden                 *bool                                                                       `json:"hidden,omitempty"`
	Scope                  PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnum        `json:"scope"`
	TemplateKey            *PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnum `json:"templateKey,omitempty"`
}

type PostMetadataTemplatesSchemaNumberClassificationsRequest struct {
	Retries *utils.RetryConfig
	Request *PostMetadataTemplatesSchemaNumberClassificationsRequestBody `request:"mediaType=application/json"`
}

type PostMetadataTemplatesSchemaNumberClassificationsResponse struct {
	ClassificationTemplate *shared.ClassificationTemplate
	ClientError            *shared.ClientError
	ContentType            string
	StatusCode             int64
}
