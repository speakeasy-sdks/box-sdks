package shared

type CollectionsOrderDirectionEnum string

const (
	CollectionsOrderDirectionEnumAsc  CollectionsOrderDirectionEnum = "ASC"
	CollectionsOrderDirectionEnumDesc CollectionsOrderDirectionEnum = "DESC"
)

// CollectionsOrder
// The order in which a pagination is ordered
type CollectionsOrder struct {
	By        *string                        `json:"by,omitempty"`
	Direction *CollectionsOrderDirectionEnum `json:"direction,omitempty"`
}

// Collections
// The part of an API response that describes pagination
type Collections struct {
	Entries    []Collection       `json:"entries,omitempty"`
	Limit      *int64             `json:"limit,omitempty"`
	Offset     *int64             `json:"offset,omitempty"`
	Order      []CollectionsOrder `json:"order,omitempty"`
	TotalCount *int64             `json:"total_count,omitempty"`
}
