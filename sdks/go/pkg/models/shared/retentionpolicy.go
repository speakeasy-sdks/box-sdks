package shared

import (
	"time"
)

// RetentionPolicyAssignmentCounts
// Counts the retention policy assignments for each item type.
type RetentionPolicyAssignmentCounts struct {
	Enterprise       *int64 `json:"enterprise,omitempty"`
	Folder           *int64 `json:"folder,omitempty"`
	MetadataTemplate *int64 `json:"metadata_template,omitempty"`
}

type RetentionPolicyDispositionActionEnum string

const (
	RetentionPolicyDispositionActionEnumPermanentlyDelete RetentionPolicyDispositionActionEnum = "permanently_delete"
	RetentionPolicyDispositionActionEnumRemoveRetention   RetentionPolicyDispositionActionEnum = "remove_retention"
)

type RetentionPolicyPolicyTypeEnum string

const (
	RetentionPolicyPolicyTypeEnumFinite     RetentionPolicyPolicyTypeEnum = "finite"
	RetentionPolicyPolicyTypeEnumIndefinite RetentionPolicyPolicyTypeEnum = "indefinite"
)

type RetentionPolicyRetentionTypeEnum string

const (
	RetentionPolicyRetentionTypeEnumModifiable    RetentionPolicyRetentionTypeEnum = "modifiable"
	RetentionPolicyRetentionTypeEnumNonModifiable RetentionPolicyRetentionTypeEnum = "non-modifiable"
)

type RetentionPolicyStatusEnum string

const (
	RetentionPolicyStatusEnumActive  RetentionPolicyStatusEnum = "active"
	RetentionPolicyStatusEnumRetired RetentionPolicyStatusEnum = "retired"
)

type RetentionPolicyTypeEnum string

const (
	RetentionPolicyTypeEnumRetentionPolicy RetentionPolicyTypeEnum = "retention_policy"
)

// RetentionPolicy
// A base representation of a retention policy.
type RetentionPolicy struct {
	AreOwnersNotified            *bool                                 `json:"are_owners_notified,omitempty"`
	AssignmentCounts             *RetentionPolicyAssignmentCounts      `json:"assignment_counts,omitempty"`
	CanOwnerExtendRetention      *bool                                 `json:"can_owner_extend_retention,omitempty"`
	CreatedAt                    *time.Time                            `json:"created_at,omitempty"`
	CreatedBy                    *UserMini                             `json:"created_by,omitempty"`
	CustomNotificationRecipients []UserMini                            `json:"custom_notification_recipients,omitempty"`
	Description                  *string                               `json:"description,omitempty"`
	DispositionAction            *RetentionPolicyDispositionActionEnum `json:"disposition_action,omitempty"`
	ID                           string                                `json:"id"`
	ModifiedAt                   *time.Time                            `json:"modified_at,omitempty"`
	PolicyName                   *string                               `json:"policy_name,omitempty"`
	PolicyType                   *RetentionPolicyPolicyTypeEnum        `json:"policy_type,omitempty"`
	RetentionLength              *string                               `json:"retention_length,omitempty"`
	RetentionType                *RetentionPolicyRetentionTypeEnum     `json:"retention_type,omitempty"`
	Status                       *RetentionPolicyStatusEnum            `json:"status,omitempty"`
	Type                         RetentionPolicyTypeEnum               `json:"type"`
}
