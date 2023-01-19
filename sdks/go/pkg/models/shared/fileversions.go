package shared

type FileVersionsOrderDirectionEnum string

const (
	FileVersionsOrderDirectionEnumAsc  FileVersionsOrderDirectionEnum = "ASC"
	FileVersionsOrderDirectionEnumDesc FileVersionsOrderDirectionEnum = "DESC"
)

// FileVersionsOrder
// The order in which a pagination is ordered
type FileVersionsOrder struct {
	By        *string                         `json:"by,omitempty"`
	Direction *FileVersionsOrderDirectionEnum `json:"direction,omitempty"`
}

// FileVersions
// The part of an API response that describes pagination
type FileVersions struct {
	Entries    []FileVersion       `json:"entries,omitempty"`
	Limit      *int64              `json:"limit,omitempty"`
	Offset     *int64              `json:"offset,omitempty"`
	Order      []FileVersionsOrder `json:"order,omitempty"`
	TotalCount *int64              `json:"total_count,omitempty"`
}
