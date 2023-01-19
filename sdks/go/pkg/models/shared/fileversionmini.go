package shared

type FileVersionMiniTypeEnum string

const (
	FileVersionMiniTypeEnumFileVersion FileVersionMiniTypeEnum = "file_version"
)

// FileVersionMini
// The bare basic representation of a file version, the minimal
// amount of fields returned when using the `fields` query
// parameter.
type FileVersionMini struct {
	ID   string                  `json:"id"`
	Sha1 *string                 `json:"sha1,omitempty"`
	Type FileVersionMiniTypeEnum `json:"type"`
}
