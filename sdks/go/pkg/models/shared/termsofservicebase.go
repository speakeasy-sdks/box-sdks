package shared

type TermsOfServiceBaseTypeEnum string

const (
	TermsOfServiceBaseTypeEnumTermsOfService TermsOfServiceBaseTypeEnum = "terms_of_service"
)

// TermsOfServiceBase
// The root-level record that is supposed to represent a
// single Terms of Service.
type TermsOfServiceBase struct {
	ID   *string                     `json:"id,omitempty"`
	Type *TermsOfServiceBaseTypeEnum `json:"type,omitempty"`
}
