package shared

// RealtimeServers
// A list of real-time servers that can
// be used for long-polling.
type RealtimeServers struct {
	ChunkSize *int64           `json:"chunk_size,omitempty"`
	Entries   []RealtimeServer `json:"entries,omitempty"`
}
