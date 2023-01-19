package shared

type FolderMiniTypeEnum string

const (
	FolderMiniTypeEnumFolder FolderMiniTypeEnum = "folder"
)

// FolderMini
// The bare basic representation of a folder, the minimal
// amount of fields returned when using the `fields` query
// parameter.
type FolderMini struct {
	Etag       *string                `json:"etag,omitempty"`
	ID         string                 `json:"id"`
	Name       *string                `json:"name,omitempty"`
	SequenceID map[string]interface{} `json:"sequence_id,omitempty"`
	Type       FolderMiniTypeEnum     `json:"type"`
}
