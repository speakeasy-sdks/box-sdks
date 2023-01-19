package shared

type DevicePinnerTypeEnum string

const (
	DevicePinnerTypeEnumDevicePinner DevicePinnerTypeEnum = "device_pinner"
)

// DevicePinner
// Device pins allow enterprises to control what devices can
// use native Box applications.
type DevicePinner struct {
	ID          *string               `json:"id,omitempty"`
	OwnedBy     *UserMini             `json:"owned_by,omitempty"`
	ProductName *string               `json:"product_name,omitempty"`
	Type        *DevicePinnerTypeEnum `json:"type,omitempty"`
}
