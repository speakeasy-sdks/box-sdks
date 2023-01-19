package shared

type GroupMiniGroupTypeEnum string

const (
	GroupMiniGroupTypeEnumManagedGroup  GroupMiniGroupTypeEnum = "managed_group"
	GroupMiniGroupTypeEnumAllUsersGroup GroupMiniGroupTypeEnum = "all_users_group"
)

type GroupMiniTypeEnum string

const (
	GroupMiniTypeEnumGroup GroupMiniTypeEnum = "group"
)

// GroupMini
// A base representation of a group.
type GroupMini struct {
	GroupType *GroupMiniGroupTypeEnum `json:"group_type,omitempty"`
	ID        *string                 `json:"id,omitempty"`
	Name      *string                 `json:"name,omitempty"`
	Type      *GroupMiniTypeEnum      `json:"type,omitempty"`
}
