package shared

// RealtimeServer
// A real-time server that can be used for
// long polling user events
type RealtimeServer struct {
	MaxRetries   *int64  `json:"max_retries,omitempty"`
	RetryTimeout *int64  `json:"retry_timeout,omitempty"`
	TTL          *int64  `json:"ttl,omitempty"`
	Type         *string `json:"type,omitempty"`
	URL          *string `json:"url,omitempty"`
}
