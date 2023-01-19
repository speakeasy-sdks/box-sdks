package shared

type UserMiniTypeEnum string

const (
	UserMiniTypeEnumUser UserMiniTypeEnum = "user"
)

// UserMini
// A mini representation of a user, used when
// nested within another resource.
type UserMini struct {
	ID    *string          `json:"id,omitempty"`
	Login string           `json:"login"`
	Name  string           `json:"name"`
	Type  UserMiniTypeEnum `json:"type"`
}
