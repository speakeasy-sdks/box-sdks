package shared

// EmailAliases
// A list of email aliases
type EmailAliases struct {
	Entries    []EmailAlias `json:"entries,omitempty"`
	TotalCount *int64       `json:"total_count,omitempty"`
}
