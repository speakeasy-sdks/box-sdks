package shared

// TermsOfServiceUserStatuses
// A list of terms of service user statuses
type TermsOfServiceUserStatuses struct {
	Entries    []TermsOfServiceUserStatus `json:"entries,omitempty"`
	TotalCount *int64                     `json:"total_count,omitempty"`
}
