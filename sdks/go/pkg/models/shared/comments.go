package shared

type CommentsOrderDirectionEnum string

const (
	CommentsOrderDirectionEnumAsc  CommentsOrderDirectionEnum = "ASC"
	CommentsOrderDirectionEnumDesc CommentsOrderDirectionEnum = "DESC"
)

// CommentsOrder
// The order in which a pagination is ordered
type CommentsOrder struct {
	By        *string                     `json:"by,omitempty"`
	Direction *CommentsOrderDirectionEnum `json:"direction,omitempty"`
}

// Comments
// The part of an API response that describes pagination
type Comments struct {
	Entries    []Comment       `json:"entries,omitempty"`
	Limit      *int64          `json:"limit,omitempty"`
	Offset     *int64          `json:"offset,omitempty"`
	Order      []CommentsOrder `json:"order,omitempty"`
	TotalCount *int64          `json:"total_count,omitempty"`
}
