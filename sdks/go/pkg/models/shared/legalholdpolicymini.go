package shared

type LegalHoldPolicyMiniTypeEnum string

const (
	LegalHoldPolicyMiniTypeEnumLegalHoldPolicy LegalHoldPolicyMiniTypeEnum = "legal_hold_policy"
)

// LegalHoldPolicyMini
// A mini legal hold policy
type LegalHoldPolicyMini struct {
	ID   *string                      `json:"id,omitempty"`
	Type *LegalHoldPolicyMiniTypeEnum `json:"type,omitempty"`
}
