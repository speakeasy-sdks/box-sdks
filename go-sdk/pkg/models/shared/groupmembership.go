package shared

import (
	"time"
)

type GroupMembershipRoleEnum string

const (
	GroupMembershipRoleEnumMember GroupMembershipRoleEnum = "member"
	GroupMembershipRoleEnumAdmin  GroupMembershipRoleEnum = "admin"
)

type GroupMembershipTypeEnum string

const (
	GroupMembershipTypeEnumGroupMembership GroupMembershipTypeEnum = "group_membership"
)

// GroupMembership
// Membership is used to signify that a user is part of a
// group.
type GroupMembership struct {
	CreatedAt  *time.Time               `json:"created_at,omitempty"`
	Group      *GroupMini               `json:"group,omitempty"`
	ID         *string                  `json:"id,omitempty"`
	ModifiedAt *time.Time               `json:"modified_at,omitempty"`
	Role       *GroupMembershipRoleEnum `json:"role,omitempty"`
	Type       *GroupMembershipTypeEnum `json:"type,omitempty"`
	User       *UserMini                `json:"user,omitempty"`
}
