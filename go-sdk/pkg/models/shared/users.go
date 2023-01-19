package shared

type UsersOrderDirectionEnum string

const (
	UsersOrderDirectionEnumAsc  UsersOrderDirectionEnum = "ASC"
	UsersOrderDirectionEnumDesc UsersOrderDirectionEnum = "DESC"
)

// UsersOrder
// The order in which a pagination is ordered
type UsersOrder struct {
	By        *string                  `json:"by,omitempty"`
	Direction *UsersOrderDirectionEnum `json:"direction,omitempty"`
}

// Users
// The part of an API response that describes pagination
type Users struct {
	Entries    []User       `json:"entries,omitempty"`
	Limit      *int64       `json:"limit,omitempty"`
	Offset     *int64       `json:"offset,omitempty"`
	Order      []UsersOrder `json:"order,omitempty"`
	TotalCount *int64       `json:"total_count,omitempty"`
}
