package shared

type FileConflictTypeEnum string

const (
	FileConflictTypeEnumFile FileConflictTypeEnum = "file"
)

// FileConflict
// The bare basic representation of a file, the minimal
// amount of fields returned when using the `fields` query
// parameter.
type FileConflict struct {
	Etag        *string                `json:"etag,omitempty"`
	FileVersion *FileVersionMini       `json:"file_version,omitempty"`
	ID          string                 `json:"id"`
	Name        *string                `json:"name,omitempty"`
	SequenceID  map[string]interface{} `json:"sequence_id"`
	Sha1        string                 `json:"sha1"`
	Type        FileConflictTypeEnum   `json:"type"`
}
