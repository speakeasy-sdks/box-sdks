package shared

type MetadataQueryIndexFieldsSortDirectionEnum string

const (
	MetadataQueryIndexFieldsSortDirectionEnumAsc  MetadataQueryIndexFieldsSortDirectionEnum = "asc"
	MetadataQueryIndexFieldsSortDirectionEnumDesc MetadataQueryIndexFieldsSortDirectionEnum = "desc"
)

// MetadataQueryIndexFields
// The field which makes up the index.
type MetadataQueryIndexFields struct {
	Key           *string                                    `json:"key,omitempty"`
	SortDirection *MetadataQueryIndexFieldsSortDirectionEnum `json:"sort_direction,omitempty"`
}

type MetadataQueryIndexStatusEnum string

const (
	MetadataQueryIndexStatusEnumBuilding MetadataQueryIndexStatusEnum = "building"
	MetadataQueryIndexStatusEnumActive   MetadataQueryIndexStatusEnum = "active"
	MetadataQueryIndexStatusEnumDisabled MetadataQueryIndexStatusEnum = "disabled"
)

// MetadataQueryIndex
// A metadata query index
type MetadataQueryIndex struct {
	Fields []MetadataQueryIndexFields   `json:"fields,omitempty"`
	ID     *string                      `json:"id,omitempty"`
	Status MetadataQueryIndexStatusEnum `json:"status"`
	Type   string                       `json:"type"`
}
