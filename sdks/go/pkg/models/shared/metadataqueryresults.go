package shared

// MetadataQueryResults
// A page of files and folders that matched the metadata query.
type MetadataQueryResults struct {
	Entries    []interface{} `json:"entries,omitempty"`
	Limit      *int64        `json:"limit,omitempty"`
	NextMarker *string       `json:"next_marker,omitempty"`
}
