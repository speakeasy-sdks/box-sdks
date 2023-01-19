package shared

// Files
// A list of files
type Files struct {
	Entries    []File `json:"entries,omitempty"`
	TotalCount *int64 `json:"total_count,omitempty"`
}
