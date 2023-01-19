package shared

type LegalHoldPolicyAssignmentBaseTypeEnum string

const (
	LegalHoldPolicyAssignmentBaseTypeEnumLegalHoldPolicyAssignment LegalHoldPolicyAssignmentBaseTypeEnum = "legal_hold_policy_assignment"
)

// LegalHoldPolicyAssignmentBase
// Legal Hold Assignments are used to assign Legal Hold
// Policies to Users, Folders, Files, or File Versions.
//
// Creating a Legal Hold Assignment puts a hold
// on the File-Versions that belong to the Assignment's
// 'apply-to' entity.
type LegalHoldPolicyAssignmentBase struct {
	ID   *string                                `json:"id,omitempty"`
	Type *LegalHoldPolicyAssignmentBaseTypeEnum `json:"type,omitempty"`
}
