package shared

import (
	"time"
)

type FileRequestCopyRequestFolderTypeEnum string

const (
	FileRequestCopyRequestFolderTypeEnumFolder FileRequestCopyRequestFolderTypeEnum = "folder"
)

// FileRequestCopyRequestFolder
// The folder to associate the new file request to.
type FileRequestCopyRequestFolder struct {
	ID   string                                `json:"id"`
	Type *FileRequestCopyRequestFolderTypeEnum `json:"type,omitempty"`
}

type FileRequestCopyRequestStatusEnum string

const (
	FileRequestCopyRequestStatusEnumActive   FileRequestCopyRequestStatusEnum = "active"
	FileRequestCopyRequestStatusEnumInactive FileRequestCopyRequestStatusEnum = "inactive"
)

// FileRequestCopyRequest
// The request body to update a file request.
type FileRequestCopyRequest struct {
	Description           *string                           `json:"description,omitempty"`
	ExpiresAt             *time.Time                        `json:"expires_at,omitempty"`
	Folder                FileRequestCopyRequestFolder      `json:"folder"`
	IsDescriptionRequired *bool                             `json:"is_description_required,omitempty"`
	IsEmailRequired       *bool                             `json:"is_email_required,omitempty"`
	Status                *FileRequestCopyRequestStatusEnum `json:"status,omitempty"`
	Title                 *string                           `json:"title,omitempty"`
}
