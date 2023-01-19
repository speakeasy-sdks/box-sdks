package shared

type DevicePinnersOrderByEnum string

const (
	DevicePinnersOrderByEnumID DevicePinnersOrderByEnum = "id"
)

type DevicePinnersOrderDirectionEnum string

const (
	DevicePinnersOrderDirectionEnumAsc  DevicePinnersOrderDirectionEnum = "asc"
	DevicePinnersOrderDirectionEnumDesc DevicePinnersOrderDirectionEnum = "desc"
)

// DevicePinnersOrder
// The order in which a pagination is ordered
type DevicePinnersOrder struct {
	By        *DevicePinnersOrderByEnum        `json:"by,omitempty"`
	Direction *DevicePinnersOrderDirectionEnum `json:"direction,omitempty"`
}

// DevicePinners
// A list of device pins
type DevicePinners struct {
	Entries    []DevicePinner       `json:"entries,omitempty"`
	Limit      *int64               `json:"limit,omitempty"`
	NextMarker *int64               `json:"next_marker,omitempty"`
	Order      []DevicePinnersOrder `json:"order,omitempty"`
}
