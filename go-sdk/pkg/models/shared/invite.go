package shared

import (
	"time"
)

type InviteEnterpriseTypeEnum string

const (
	InviteEnterpriseTypeEnumEnterprise InviteEnterpriseTypeEnum = "enterprise"
)

// InviteEnterprise
// A representation of a Box enterprise
type InviteEnterprise struct {
	ID   *string                   `json:"id,omitempty"`
	Name *string                   `json:"name,omitempty"`
	Type *InviteEnterpriseTypeEnum `json:"type,omitempty"`
}

type InviteTypeEnum string

const (
	InviteTypeEnumInvite InviteTypeEnum = "invite"
)

// Invite
// An invite for a user to an enterprise.
type Invite struct {
	ActionableBy *UserMini         `json:"actionable_by,omitempty"`
	CreatedAt    *time.Time        `json:"created_at,omitempty"`
	ID           *string           `json:"id,omitempty"`
	InvitedBy    *UserMini         `json:"invited_by,omitempty"`
	InvitedTo    *InviteEnterprise `json:"invited_to,omitempty"`
	ModifiedAt   *time.Time        `json:"modified_at,omitempty"`
	Status       *string           `json:"status,omitempty"`
	Type         *InviteTypeEnum   `json:"type,omitempty"`
}
