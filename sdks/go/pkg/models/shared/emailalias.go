package shared

type EmailAliasTypeEnum string

const (
	EmailAliasTypeEnumEmailAlias EmailAliasTypeEnum = "email_alias"
)

// EmailAlias
// An email alias for a user.
type EmailAlias struct {
	Email       *string             `json:"email,omitempty"`
	ID          *string             `json:"id,omitempty"`
	IsConfirmed *bool               `json:"is_confirmed,omitempty"`
	Type        *EmailAliasTypeEnum `json:"type,omitempty"`
}
