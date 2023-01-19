package shared

// TaskAssignments
// A list of task assignments
type TaskAssignments struct {
	Entries    []TaskAssignment `json:"entries,omitempty"`
	TotalCount *int64           `json:"total_count,omitempty"`
}
