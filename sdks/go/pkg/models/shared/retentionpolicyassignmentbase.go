package shared

type RetentionPolicyAssignmentBaseTypeEnum string

const (
	RetentionPolicyAssignmentBaseTypeEnumRetentionPolicyAssignment RetentionPolicyAssignmentBaseTypeEnum = "retention_policy_assignment"
)

// RetentionPolicyAssignmentBase
// A base representation of a retention policy assignment.
type RetentionPolicyAssignmentBase struct {
	ID   string                                `json:"id"`
	Type RetentionPolicyAssignmentBaseTypeEnum `json:"type"`
}
