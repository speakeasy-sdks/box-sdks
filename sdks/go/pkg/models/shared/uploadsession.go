package shared

import (
	"time"
)

// UploadSessionSessionEndpoints
// A list of endpoints for a chunked upload session.
type UploadSessionSessionEndpoints struct {
	Abort      *string `json:"abort,omitempty"`
	Commit     *string `json:"commit,omitempty"`
	ListParts  *string `json:"list_parts,omitempty"`
	LogEvent   *string `json:"log_event,omitempty"`
	Status     *string `json:"status,omitempty"`
	UploadPart *string `json:"upload_part,omitempty"`
}

type UploadSessionTypeEnum string

const (
	UploadSessionTypeEnumUploadSession UploadSessionTypeEnum = "upload_session"
)

// UploadSession
// An upload session for chunk uploading a file.
type UploadSession struct {
	ID                *string                        `json:"id,omitempty"`
	NumPartsProcessed *int32                         `json:"num_parts_processed,omitempty"`
	PartSize          *int64                         `json:"part_size,omitempty"`
	SessionEndpoints  *UploadSessionSessionEndpoints `json:"session_endpoints,omitempty"`
	SessionExpiresAt  *time.Time                     `json:"session_expires_at,omitempty"`
	TotalParts        *int32                         `json:"total_parts,omitempty"`
	Type              *UploadSessionTypeEnum         `json:"type,omitempty"`
}
