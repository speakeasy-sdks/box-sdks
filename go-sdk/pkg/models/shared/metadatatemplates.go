package shared

// MetadataTemplates
// The part of an API response that describes marker
// based pagination
type MetadataTemplates struct {
	Entries    []MetadataTemplate `json:"entries,omitempty"`
	Limit      *int64             `json:"limit,omitempty"`
	NextMarker *int64             `json:"next_marker,omitempty"`
	PrevMarker *int64             `json:"prev_marker,omitempty"`
}
