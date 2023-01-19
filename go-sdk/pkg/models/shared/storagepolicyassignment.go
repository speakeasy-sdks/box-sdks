package shared

// StoragePolicyAssignmentReference
// The bare basic reference for an object
type StoragePolicyAssignmentReference struct {
	ID   *string `json:"id,omitempty"`
	Type *string `json:"type,omitempty"`
}

// StoragePolicyAssignment
// The assignment of a storage policy to a user or enterprise
type StoragePolicyAssignment struct {
	AssignedTo    *StoragePolicyAssignmentReference `json:"assigned_to,omitempty"`
	StoragePolicy *StoragePolicyMini                `json:"storage_policy,omitempty"`
}
