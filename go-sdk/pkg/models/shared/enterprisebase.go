package shared

type EnterpriseBaseTypeEnum string

const (
	EnterpriseBaseTypeEnumEnterprise EnterpriseBaseTypeEnum = "enterprise"
)

// EnterpriseBase
// A mini representation of a enterprise, used when
// nested within another resource.
type EnterpriseBase struct {
	ID   *string                 `json:"id,omitempty"`
	Type *EnterpriseBaseTypeEnum `json:"type,omitempty"`
}
