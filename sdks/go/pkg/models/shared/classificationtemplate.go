package shared

type ClassificationTemplateDisplayNameEnum string

const (
	ClassificationTemplateDisplayNameEnumClassification ClassificationTemplateDisplayNameEnum = "Classification"
)

type ClassificationTemplateFieldsDisplayNameEnum string

const (
	ClassificationTemplateFieldsDisplayNameEnumClassification ClassificationTemplateFieldsDisplayNameEnum = "Classification"
)

type ClassificationTemplateFieldsKeyEnum string

const (
	ClassificationTemplateFieldsKeyEnumBoxSecurityClassificationKey ClassificationTemplateFieldsKeyEnum = "Box__Security__Classification__Key"
)

// ClassificationTemplateFieldsOptionsStaticConfigClassification
// Additional information about the classification.
//
// This is not an exclusive list of properties, and
// more object fields might be returned. These fields
// are used for internal Box Shield and Box Governance
// purposes and no additional value must be derived from
// these fields.
type ClassificationTemplateFieldsOptionsStaticConfigClassification struct {
	ClassificationDefinition *string  `json:"classificationDefinition,omitempty"`
	ColorID                  *float64 `json:"colorID,omitempty"`
}

// ClassificationTemplateFieldsOptionsStaticConfig
// Additional information about the classification.
type ClassificationTemplateFieldsOptionsStaticConfig struct {
	Classification *ClassificationTemplateFieldsOptionsStaticConfigClassification `json:"classification,omitempty"`
}

// ClassificationTemplateFieldsOptions
// A single classification available in this enterprise.
type ClassificationTemplateFieldsOptions struct {
	ID           *string                                          `json:"id,omitempty"`
	Key          *string                                          `json:"key,omitempty"`
	StaticConfig *ClassificationTemplateFieldsOptionsStaticConfig `json:"staticConfig,omitempty"`
}

type ClassificationTemplateFieldsTypeEnum string

const (
	ClassificationTemplateFieldsTypeEnumEnum ClassificationTemplateFieldsTypeEnum = "enum"
)

// ClassificationTemplateFields
// The metadata template field that represents the available
// classifications.
type ClassificationTemplateFields struct {
	DisplayName *ClassificationTemplateFieldsDisplayNameEnum `json:"displayName,omitempty"`
	Hidden      *bool                                        `json:"hidden,omitempty"`
	ID          *string                                      `json:"id,omitempty"`
	Key         *ClassificationTemplateFieldsKeyEnum         `json:"key,omitempty"`
	Options     []ClassificationTemplateFieldsOptions        `json:"options,omitempty"`
	Type        *ClassificationTemplateFieldsTypeEnum        `json:"type,omitempty"`
}

type ClassificationTemplateTemplateKeyEnum string

const (
	ClassificationTemplateTemplateKeyEnumSecurityClassification6VMVochwUWo ClassificationTemplateTemplateKeyEnum = "securityClassification-6VMVochwUWo"
)

type ClassificationTemplateTypeEnum string

const (
	ClassificationTemplateTypeEnumMetadataTemplate ClassificationTemplateTypeEnum = "metadata_template"
)

// ClassificationTemplate
// A metadata template that holds the security classifications
// defined by an enterprise.
type ClassificationTemplate struct {
	CopyInstanceOnItemCopy *bool                                  `json:"copyInstanceOnItemCopy,omitempty"`
	DisplayName            *ClassificationTemplateDisplayNameEnum `json:"displayName,omitempty"`
	Fields                 []ClassificationTemplateFields         `json:"fields,omitempty"`
	Hidden                 *bool                                  `json:"hidden,omitempty"`
	ID                     *string                                `json:"id,omitempty"`
	Scope                  *string                                `json:"scope,omitempty"`
	TemplateKey            *ClassificationTemplateTemplateKeyEnum `json:"templateKey,omitempty"`
	Type                   ClassificationTemplateTypeEnum         `json:"type"`
}
