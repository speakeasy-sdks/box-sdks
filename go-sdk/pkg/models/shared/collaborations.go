package shared

type CollaborationsOrderDirectionEnum string

const (
	CollaborationsOrderDirectionEnumAsc  CollaborationsOrderDirectionEnum = "ASC"
	CollaborationsOrderDirectionEnumDesc CollaborationsOrderDirectionEnum = "DESC"
)

// CollaborationsOrder
// The order in which a pagination is ordered
type CollaborationsOrder struct {
	By        *string                           `json:"by,omitempty"`
	Direction *CollaborationsOrderDirectionEnum `json:"direction,omitempty"`
}

// Collaborations
// The part of an API response that describes pagination
type Collaborations struct {
	Entries    []Collaboration       `json:"entries,omitempty"`
	Limit      *int64                `json:"limit,omitempty"`
	Offset     *int64                `json:"offset,omitempty"`
	Order      []CollaborationsOrder `json:"order,omitempty"`
	TotalCount *int64                `json:"total_count,omitempty"`
}
