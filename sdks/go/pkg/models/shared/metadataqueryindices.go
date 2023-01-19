package shared

// MetadataQueryIndices
// A collection of metadata query indices.
type MetadataQueryIndices struct {
	Entries    []MetadataQueryIndex `json:"entries,omitempty"`
	Limit      *int64               `json:"limit,omitempty"`
	NextMarker *string              `json:"next_marker,omitempty"`
}
