package shared

// SessionTerminationMessage
// A message informing about the
// termination job status
type SessionTerminationMessage struct {
	Message *string `json:"message,omitempty"`
}
