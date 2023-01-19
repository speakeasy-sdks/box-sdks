package shared

// UploadPart
// The basic representation of an upload
// session chunk.
type UploadPart struct {
	Offset *int64  `json:"offset,omitempty"`
	PartID *string `json:"part_id,omitempty"`
	Sha1   *string `json:"sha1,omitempty"`
	Size   *int64  `json:"size,omitempty"`
}
