package shared

import (
	"time"
)

type WatermarkWatermark struct {
	CreatedAt  *time.Time `json:"created_at,omitempty"`
	ModifiedAt *time.Time `json:"modified_at,omitempty"`
}

// Watermark
// A watermark is a semi-transparent overlay on an embedded file
// preview that displays a viewer's email address or user ID
// and the time of access over a file's content
type Watermark struct {
	Watermark *WatermarkWatermark `json:"watermark,omitempty"`
}
