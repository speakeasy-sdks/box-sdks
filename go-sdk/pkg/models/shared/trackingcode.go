package shared

type TrackingCodeTypeEnum string

const (
	TrackingCodeTypeEnumTrackingCode TrackingCodeTypeEnum = "tracking_code"
)

// TrackingCode
// Tracking codes allow an admin to generate reports from the admin console
// and assign an attribute to a specific group of users.
// This setting must be enabled for an enterprise before it can be used.
type TrackingCode struct {
	Name  *string               `json:"name,omitempty"`
	Type  *TrackingCodeTypeEnum `json:"type,omitempty"`
	Value *string               `json:"value,omitempty"`
}
