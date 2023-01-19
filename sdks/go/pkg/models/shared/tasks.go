package shared

// Tasks
// A list of tasks
type Tasks struct {
	Entries    []Task `json:"entries,omitempty"`
	TotalCount *int64 `json:"total_count,omitempty"`
}
