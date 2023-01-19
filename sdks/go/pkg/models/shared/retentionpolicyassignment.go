package shared

import (
	"time"
)

type RetentionPolicyAssignmentAssignedToTypeEnum string

const (
	RetentionPolicyAssignmentAssignedToTypeEnumFolder           RetentionPolicyAssignmentAssignedToTypeEnum = "folder"
	RetentionPolicyAssignmentAssignedToTypeEnumEnterprise       RetentionPolicyAssignmentAssignedToTypeEnum = "enterprise"
	RetentionPolicyAssignmentAssignedToTypeEnumMetadataTemplate RetentionPolicyAssignmentAssignedToTypeEnum = "metadata_template"
)

// RetentionPolicyAssignmentAssignedTo
// The `type` and `id` of the content that is under
// retention. The `type` can either be `folder`
// `enterprise`, or `metadata_template`.
type RetentionPolicyAssignmentAssignedTo struct {
	ID   *string                                      `json:"id,omitempty"`
	Type *RetentionPolicyAssignmentAssignedToTypeEnum `json:"type,omitempty"`
}

type RetentionPolicyAssignmentFilterFields struct {
	Field *string `json:"field,omitempty"`
	Value *string `json:"value,omitempty"`
}

type RetentionPolicyAssignmentTypeEnum string

const (
	RetentionPolicyAssignmentTypeEnumRetentionPolicyAssignment RetentionPolicyAssignmentTypeEnum = "retention_policy_assignment"
)

// RetentionPolicyAssignment
// A retention assignment represents a rule specifying
// the files a retention policy retains.
// Assignments can retain files based on their folder or metadata,
// or hold all files in the enterprise.
type RetentionPolicyAssignment struct {
	AssignedAt      *time.Time                              `json:"assigned_at,omitempty"`
	AssignedBy      *UserMini                               `json:"assigned_by,omitempty"`
	AssignedTo      *RetentionPolicyAssignmentAssignedTo    `json:"assigned_to,omitempty"`
	FilterFields    []RetentionPolicyAssignmentFilterFields `json:"filter_fields,omitempty"`
	ID              *string                                 `json:"id,omitempty"`
	RetentionPolicy *RetentionPolicyMini                    `json:"retention_policy,omitempty"`
	StartDateField  *string                                 `json:"start_date_field,omitempty"`
	Type            *RetentionPolicyAssignmentTypeEnum      `json:"type,omitempty"`
}
