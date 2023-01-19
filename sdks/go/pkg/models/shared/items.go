package shared

type ItemsOrderDirectionEnum string

const (
	ItemsOrderDirectionEnumAsc  ItemsOrderDirectionEnum = "ASC"
	ItemsOrderDirectionEnumDesc ItemsOrderDirectionEnum = "DESC"
)

// ItemsOrder
// The order in which a pagination is ordered
type ItemsOrder struct {
	By        *string                  `json:"by,omitempty"`
	Direction *ItemsOrderDirectionEnum `json:"direction,omitempty"`
}

// Items
// The part of an API response that describes pagination
type Items struct {
	Entries    []interface{} `json:"entries,omitempty"`
	Limit      *int64        `json:"limit,omitempty"`
	Offset     *int64        `json:"offset,omitempty"`
	Order      []ItemsOrder  `json:"order,omitempty"`
	TotalCount *int64        `json:"total_count,omitempty"`
}
