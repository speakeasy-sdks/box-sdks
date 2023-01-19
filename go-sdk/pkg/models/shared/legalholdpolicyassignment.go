package shared

import (
	"time"
)

type LegalHoldPolicyAssignmentTypeEnum string

const (
	LegalHoldPolicyAssignmentTypeEnumLegalHoldPolicyAssignment LegalHoldPolicyAssignmentTypeEnum = "legal_hold_policy_assignment"
)

// LegalHoldPolicyAssignment
// Legal Hold Assignments are used to assign Legal Hold
// Policies to Users, Folders, Files, or File Versions.
//
// Creating a Legal Hold Assignment puts a hold
// on the File-Versions that belong to the Assignment's
// 'apply-to' entity.
type LegalHoldPolicyAssignment struct {
	AssignedAt      *time.Time                         `json:"assigned_at,omitempty"`
	AssignedBy      *UserMini                          `json:"assigned_by,omitempty"`
	AssignedTo      *interface{}                       `json:"assigned_to,omitempty"`
	DeletedAt       *time.Time                         `json:"deleted_at,omitempty"`
	ID              *string                            `json:"id,omitempty"`
	LegalHoldPolicy *LegalHoldPolicyMini               `json:"legal_hold_policy,omitempty"`
	Type            *LegalHoldPolicyAssignmentTypeEnum `json:"type,omitempty"`
}
