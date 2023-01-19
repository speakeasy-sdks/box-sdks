package shared

import (
	"time"
)

type FileRequestUpdateRequestStatusEnum string

const (
	FileRequestUpdateRequestStatusEnumActive   FileRequestUpdateRequestStatusEnum = "active"
	FileRequestUpdateRequestStatusEnumInactive FileRequestUpdateRequestStatusEnum = "inactive"
)

// FileRequestUpdateRequest
// The request body to update a file request.
type FileRequestUpdateRequest struct {
	Description           *string                             `json:"description,omitempty"`
	ExpiresAt             *time.Time                          `json:"expires_at,omitempty"`
	IsDescriptionRequired *bool                               `json:"is_description_required,omitempty"`
	IsEmailRequired       *bool                               `json:"is_email_required,omitempty"`
	Status                *FileRequestUpdateRequestStatusEnum `json:"status,omitempty"`
	Title                 *string                             `json:"title,omitempty"`
}
