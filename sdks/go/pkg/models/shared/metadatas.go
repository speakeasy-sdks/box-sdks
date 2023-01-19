package shared

// Metadatas
// A list of metadata instances that have been applied to a file or folder.
type Metadatas struct {
	Entries []Metadata `json:"entries,omitempty"`
	Limit   *int64     `json:"limit,omitempty"`
}
