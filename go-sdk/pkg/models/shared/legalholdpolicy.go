package shared

import (
	"time"
)

// LegalHoldPolicyAssignmentCounts
// Counts of assignments within this a legal hold policy by item type
type LegalHoldPolicyAssignmentCounts struct {
	File        *int64 `json:"file,omitempty"`
	FileVersion *int64 `json:"file_version,omitempty"`
	Folder      *int64 `json:"folder,omitempty"`
	User        *int64 `json:"user,omitempty"`
}

type LegalHoldPolicyStatusEnum string

const (
	LegalHoldPolicyStatusEnumActive    LegalHoldPolicyStatusEnum = "active"
	LegalHoldPolicyStatusEnumApplying  LegalHoldPolicyStatusEnum = "applying"
	LegalHoldPolicyStatusEnumReleasing LegalHoldPolicyStatusEnum = "releasing"
	LegalHoldPolicyStatusEnumReleased  LegalHoldPolicyStatusEnum = "released"
)

type LegalHoldPolicyTypeEnum string

const (
	LegalHoldPolicyTypeEnumLegalHoldPolicy LegalHoldPolicyTypeEnum = "legal_hold_policy"
)

// LegalHoldPolicy
// A mini legal hold policy
type LegalHoldPolicy struct {
	AssignmentCounts *LegalHoldPolicyAssignmentCounts `json:"assignment_counts,omitempty"`
	CreatedAt        *time.Time                       `json:"created_at,omitempty"`
	CreatedBy        *UserMini                        `json:"created_by,omitempty"`
	DeletedAt        *time.Time                       `json:"deleted_at,omitempty"`
	Description      *string                          `json:"description,omitempty"`
	FilterEndedAt    *time.Time                       `json:"filter_ended_at,omitempty"`
	FilterStartedAt  *time.Time                       `json:"filter_started_at,omitempty"`
	ID               *string                          `json:"id,omitempty"`
	ModifiedAt       *time.Time                       `json:"modified_at,omitempty"`
	PolicyName       *string                          `json:"policy_name,omitempty"`
	ReleaseNotes     *string                          `json:"release_notes,omitempty"`
	Status           *LegalHoldPolicyStatusEnum       `json:"status,omitempty"`
	Type             *LegalHoldPolicyTypeEnum         `json:"type,omitempty"`
}
