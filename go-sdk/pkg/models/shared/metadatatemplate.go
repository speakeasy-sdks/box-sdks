package shared

// MetadataTemplateMetadataFieldWriteMetadataOptionWrite
// An option for a Metadata Template Field.
//
// Options only need to be provided for fields of type `enum` and `multiSelect`.
// Options represent the value(s) a user can select for the field either through
// the UI or through the API.
type MetadataTemplateMetadataFieldWriteMetadataOptionWrite struct {
	ID  *string `json:"id,omitempty"`
	Key string  `json:"key"`
}

type MetadataTemplateMetadataFieldWriteTypeEnum string

const (
	MetadataTemplateMetadataFieldWriteTypeEnumString      MetadataTemplateMetadataFieldWriteTypeEnum = "string"
	MetadataTemplateMetadataFieldWriteTypeEnumFloat       MetadataTemplateMetadataFieldWriteTypeEnum = "float"
	MetadataTemplateMetadataFieldWriteTypeEnumDate        MetadataTemplateMetadataFieldWriteTypeEnum = "date"
	MetadataTemplateMetadataFieldWriteTypeEnumEnum        MetadataTemplateMetadataFieldWriteTypeEnum = "enum"
	MetadataTemplateMetadataFieldWriteTypeEnumMultiSelect MetadataTemplateMetadataFieldWriteTypeEnum = "multiSelect"
)

// MetadataTemplateMetadataFieldWrite
// A field within a metadata template. Fields can be a basic text, date, or
// number field, or a list of options.
type MetadataTemplateMetadataFieldWrite struct {
	Description *string                                                 `json:"description,omitempty"`
	DisplayName string                                                  `json:"displayName"`
	Hidden      *bool                                                   `json:"hidden,omitempty"`
	ID          *string                                                 `json:"id,omitempty"`
	Key         string                                                  `json:"key"`
	Options     []MetadataTemplateMetadataFieldWriteMetadataOptionWrite `json:"options,omitempty"`
	Type        MetadataTemplateMetadataFieldWriteTypeEnum              `json:"type"`
}

type MetadataTemplateTypeEnum string

const (
	MetadataTemplateTypeEnumMetadataTemplate MetadataTemplateTypeEnum = "metadata_template"
)

// MetadataTemplate
// A template for metadata that can be applied to files and folders
type MetadataTemplate struct {
	CopyInstanceOnItemCopy *bool                                `json:"copyInstanceOnItemCopy,omitempty"`
	DisplayName            *string                              `json:"displayName,omitempty"`
	Fields                 []MetadataTemplateMetadataFieldWrite `json:"fields,omitempty"`
	Hidden                 *bool                                `json:"hidden,omitempty"`
	ID                     *string                              `json:"id,omitempty"`
	Scope                  *string                              `json:"scope,omitempty"`
	TemplateKey            *string                              `json:"templateKey,omitempty"`
	Type                   MetadataTemplateTypeEnum             `json:"type"`
}
