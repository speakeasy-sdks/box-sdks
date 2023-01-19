package shared

type GroupsOrderDirectionEnum string

const (
	GroupsOrderDirectionEnumAsc  GroupsOrderDirectionEnum = "ASC"
	GroupsOrderDirectionEnumDesc GroupsOrderDirectionEnum = "DESC"
)

// GroupsOrder
// The order in which a pagination is ordered
type GroupsOrder struct {
	By        *string                   `json:"by,omitempty"`
	Direction *GroupsOrderDirectionEnum `json:"direction,omitempty"`
}

// Groups
// The part of an API response that describes pagination
type Groups struct {
	Entries    []GroupMini   `json:"entries,omitempty"`
	Limit      *int64        `json:"limit,omitempty"`
	Offset     *int64        `json:"offset,omitempty"`
	Order      []GroupsOrder `json:"order,omitempty"`
	TotalCount *int64        `json:"total_count,omitempty"`
}
