package shared

// Events
// A list of event objects
type Events struct {
	ChunkSize          *int64  `json:"chunk_size,omitempty"`
	Entries            []Event `json:"entries,omitempty"`
	NextStreamPosition *string `json:"next_stream_position,omitempty"`
}
