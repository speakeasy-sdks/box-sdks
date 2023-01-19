package shared

// RetentionPolicies
// The part of an API response that describes marker
// based pagination
type RetentionPolicies struct {
	Entries    []RetentionPolicyMini `json:"entries,omitempty"`
	Limit      *int64                `json:"limit,omitempty"`
	NextMarker *string               `json:"next_marker,omitempty"`
}
