package shared

type MetadataQueryOrderByDirectionEnum string

const (
	MetadataQueryOrderByDirectionEnumAscUpper  MetadataQueryOrderByDirectionEnum = "ASC"
	MetadataQueryOrderByDirectionEnumDescUpper MetadataQueryOrderByDirectionEnum = "DESC"
	MetadataQueryOrderByDirectionEnumAscLower  MetadataQueryOrderByDirectionEnum = "asc"
	MetadataQueryOrderByDirectionEnumDescLower MetadataQueryOrderByDirectionEnum = "desc"
)

// MetadataQueryOrderBy
// An object representing one of the metadata template fields to sort the
// metadata query results by.
type MetadataQueryOrderBy struct {
	Direction *MetadataQueryOrderByDirectionEnum `json:"direction,omitempty"`
	FieldKey  *string                            `json:"field_key,omitempty"`
}

// MetadataQuery
// Create a search using SQL-like syntax to return items that match specific
// metadata.
type MetadataQuery struct {
	AncestorFolderID string                 `json:"ancestor_folder_id"`
	Fields           []string               `json:"fields,omitempty"`
	From             string                 `json:"from"`
	Limit            *int64                 `json:"limit,omitempty"`
	Marker           *string                `json:"marker,omitempty"`
	OrderBy          []MetadataQueryOrderBy `json:"order_by,omitempty"`
	Query            *string                `json:"query,omitempty"`
	QueryParams      map[string]string      `json:"query_params,omitempty"`
}
