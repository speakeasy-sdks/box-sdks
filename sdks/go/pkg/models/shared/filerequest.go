package shared

import (
	"time"
)

type FileRequestFolderBaseTypeEnum string

const (
	FileRequestFolderBaseTypeEnumFolder FileRequestFolderBaseTypeEnum = "folder"
)

// FileRequestFolderBase
// The folder that this file request is associated with.
//
// Files submitted through the file request form will be
// uploaded to this folder.
type FileRequestFolderBase struct {
	Etag       *string                       `json:"etag,omitempty"`
	ID         string                        `json:"id"`
	Name       *string                       `json:"name,omitempty"`
	SequenceID map[string]interface{}        `json:"sequence_id,omitempty"`
	Type       FileRequestFolderBaseTypeEnum `json:"type"`
}

type FileRequestStatusEnum string

const (
	FileRequestStatusEnumActive   FileRequestStatusEnum = "active"
	FileRequestStatusEnumInactive FileRequestStatusEnum = "inactive"
)

type FileRequestTypeEnum string

const (
	FileRequestTypeEnumFileRequest FileRequestTypeEnum = "file_request"
)

type FileRequestUserBaseTypeEnum string

const (
	FileRequestUserBaseTypeEnumUser FileRequestUserBaseTypeEnum = "user"
)

// FileRequestUserBase
// The user who last modified this file request.
type FileRequestUserBase struct {
	ID    *string                     `json:"id,omitempty"`
	Login string                      `json:"login"`
	Name  string                      `json:"name"`
	Type  FileRequestUserBaseTypeEnum `json:"type"`
}

// FileRequest
// A standard representation of a file request, as returned
// from any file request API endpoints by default.
type FileRequest struct {
	CreatedAt             time.Time              `json:"created_at"`
	CreatedBy             *UserMini              `json:"created_by,omitempty"`
	Description           *string                `json:"description,omitempty"`
	Etag                  *string                `json:"etag,omitempty"`
	ExpiresAt             *time.Time             `json:"expires_at,omitempty"`
	Folder                FileRequestFolderBase  `json:"folder"`
	ID                    *string                `json:"id,omitempty"`
	IsDescriptionRequired *bool                  `json:"is_description_required,omitempty"`
	IsEmailRequired       *bool                  `json:"is_email_required,omitempty"`
	Status                *FileRequestStatusEnum `json:"status,omitempty"`
	Title                 *string                `json:"title,omitempty"`
	Type                  *FileRequestTypeEnum   `json:"type,omitempty"`
	UpdatedAt             time.Time              `json:"updated_at"`
	UpdatedBy             *FileRequestUserBase   `json:"updated_by,omitempty"`
	URL                   *string                `json:"url,omitempty"`
}
