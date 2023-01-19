package shared

// RetentionPolicyAssignments
// The part of an API response that describes marker
// based pagination
type RetentionPolicyAssignments struct {
	Entries    []RetentionPolicyAssignmentBase `json:"entries,omitempty"`
	Limit      *int64                          `json:"limit,omitempty"`
	NextMarker *string                         `json:"next_marker,omitempty"`
}
