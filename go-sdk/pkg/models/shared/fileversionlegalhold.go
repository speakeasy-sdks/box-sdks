package shared

import (
	"time"
)

type FileVersionLegalHoldTypeEnum string

const (
	FileVersionLegalHoldTypeEnumFileVersionLegalHold FileVersionLegalHoldTypeEnum = "file_version_legal_hold"
)

// FileVersionLegalHold
// File-Version-Legal-Hold is an entity representing all
// holds on a File Version.
type FileVersionLegalHold struct {
	DeletedAt                  *time.Time                    `json:"deleted_at,omitempty"`
	File                       *FileMini                     `json:"file,omitempty"`
	FileVersion                *FileVersionMini              `json:"file_version,omitempty"`
	ID                         *string                       `json:"id,omitempty"`
	LegalHoldPolicyAssignments []LegalHoldPolicyAssignment   `json:"legal_hold_policy_assignments,omitempty"`
	Type                       *FileVersionLegalHoldTypeEnum `json:"type,omitempty"`
}
