package shared

import (
	"time"
)

type GroupGroupTypeEnum string

const (
	GroupGroupTypeEnumManagedGroup  GroupGroupTypeEnum = "managed_group"
	GroupGroupTypeEnumAllUsersGroup GroupGroupTypeEnum = "all_users_group"
)

type GroupTypeEnum string

const (
	GroupTypeEnumGroup GroupTypeEnum = "group"
)

// Group
// A base representation of a group.
type Group struct {
	CreatedAt  *time.Time          `json:"created_at,omitempty"`
	GroupType  *GroupGroupTypeEnum `json:"group_type,omitempty"`
	ID         *string             `json:"id,omitempty"`
	ModifiedAt *time.Time          `json:"modified_at,omitempty"`
	Name       *string             `json:"name,omitempty"`
	Type       *GroupTypeEnum      `json:"type,omitempty"`
}
