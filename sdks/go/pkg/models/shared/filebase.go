package shared

type FileBaseTypeEnum string

const (
	FileBaseTypeEnumFile FileBaseTypeEnum = "file"
)

// FileBase
// The bare basic representation of a file, the minimal
// amount of fields returned when using the `fields` query
// parameter.
type FileBase struct {
	Etag *string          `json:"etag,omitempty"`
	ID   string           `json:"id"`
	Type FileBaseTypeEnum `json:"type"`
}
