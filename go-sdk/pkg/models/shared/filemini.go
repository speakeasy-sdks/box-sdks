package shared

type FileMiniTypeEnum string

const (
	FileMiniTypeEnumFile FileMiniTypeEnum = "file"
)

// FileMini
// The bare basic representation of a file, the minimal
// amount of fields returned when using the `fields` query
// parameter.
type FileMini struct {
	Etag        *string                `json:"etag,omitempty"`
	FileVersion *FileVersionMini       `json:"file_version,omitempty"`
	ID          string                 `json:"id"`
	Name        *string                `json:"name,omitempty"`
	SequenceID  map[string]interface{} `json:"sequence_id"`
	Sha1        string                 `json:"sha1"`
	Type        FileMiniTypeEnum       `json:"type"`
}
