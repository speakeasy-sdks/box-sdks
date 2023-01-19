package shared

type UserBaseTypeEnum string

const (
	UserBaseTypeEnumUser UserBaseTypeEnum = "user"
)

// UserBase
// A mini representation of a user, used when
// nested within another resource.
type UserBase struct {
	ID   *string          `json:"id,omitempty"`
	Type UserBaseTypeEnum `json:"type"`
}
