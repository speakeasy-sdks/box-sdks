package shared

import (
	"time"
)

// SignRequestPrefillTag
// Prefill tags are used to prefill placeholders with signer input data. Only
// one value field can be included.
type SignRequestPrefillTag struct {
	CheckboxValue *bool      `json:"checkbox_value,omitempty"`
	DateValue     *time.Time `json:"date_value,omitempty"`
	DocumentTagID *string    `json:"document_tag_id,omitempty"`
	TextValue     *string    `json:"text_value,omitempty"`
}
