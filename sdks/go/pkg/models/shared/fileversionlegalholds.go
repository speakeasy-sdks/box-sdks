package shared

// FileVersionLegalHolds
// The part of an API response that describes marker
// based pagination
type FileVersionLegalHolds struct {
	Entries    []FileVersionLegalHold `json:"entries,omitempty"`
	Limit      *int64                 `json:"limit,omitempty"`
	NextMarker *int64                 `json:"next_marker,omitempty"`
	PrevMarker *int64                 `json:"prev_marker,omitempty"`
}
