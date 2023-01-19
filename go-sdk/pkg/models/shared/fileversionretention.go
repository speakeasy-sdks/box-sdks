package shared

import (
	"time"
)

type FileVersionRetentionTypeEnum string

const (
	FileVersionRetentionTypeEnumFileVersionRetention FileVersionRetentionTypeEnum = "file_version_retention"
)

// FileVersionRetention
// A retention policy blocks permanent deletion of content
// for a specified amount of time. Admins can apply policies to
// specified folders, or an entire enterprise. A file version retention
// is a  record for a retained file version. To use this feature,
// you must  have the manage retention policies scope enabled for your
// API key via  your application management console. For more information
// about retention policies, please visit our help documentation
type FileVersionRetention struct {
	AppliedAt              *time.Time                    `json:"applied_at,omitempty"`
	DispositionAt          *time.Time                    `json:"disposition_at,omitempty"`
	File                   *FileMini                     `json:"file,omitempty"`
	FileVersion            *FileVersionMini              `json:"file_version,omitempty"`
	ID                     *string                       `json:"id,omitempty"`
	Type                   *FileVersionRetentionTypeEnum `json:"type,omitempty"`
	WinningRetentionPolicy *RetentionPolicyMini          `json:"winning_retention_policy,omitempty"`
}
