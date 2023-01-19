package shared

// TermsOfServices
// A list of terms of services
type TermsOfServices struct {
	Entries    []TermsOfService `json:"entries,omitempty"`
	TotalCount *int64           `json:"total_count,omitempty"`
}
