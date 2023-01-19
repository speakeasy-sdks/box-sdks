package shared

type GroupMembershipsOrderDirectionEnum string

const (
	GroupMembershipsOrderDirectionEnumAsc  GroupMembershipsOrderDirectionEnum = "ASC"
	GroupMembershipsOrderDirectionEnumDesc GroupMembershipsOrderDirectionEnum = "DESC"
)

// GroupMembershipsOrder
// The order in which a pagination is ordered
type GroupMembershipsOrder struct {
	By        *string                             `json:"by,omitempty"`
	Direction *GroupMembershipsOrderDirectionEnum `json:"direction,omitempty"`
}

// GroupMemberships
// The part of an API response that describes pagination
type GroupMemberships struct {
	Entries    []GroupMembership       `json:"entries,omitempty"`
	Limit      *int64                  `json:"limit,omitempty"`
	Offset     *int64                  `json:"offset,omitempty"`
	Order      []GroupMembershipsOrder `json:"order,omitempty"`
	TotalCount *int64                  `json:"total_count,omitempty"`
}
