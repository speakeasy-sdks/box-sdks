package shared

type RetentionPolicyMiniDispositionActionEnum string

const (
	RetentionPolicyMiniDispositionActionEnumPermanentlyDelete RetentionPolicyMiniDispositionActionEnum = "permanently_delete"
	RetentionPolicyMiniDispositionActionEnumRemoveRetention   RetentionPolicyMiniDispositionActionEnum = "remove_retention"
)

type RetentionPolicyMiniTypeEnum string

const (
	RetentionPolicyMiniTypeEnumRetentionPolicy RetentionPolicyMiniTypeEnum = "retention_policy"
)

// RetentionPolicyMini
// A base representation of a retention policy.
type RetentionPolicyMini struct {
	DispositionAction *RetentionPolicyMiniDispositionActionEnum `json:"disposition_action,omitempty"`
	ID                string                                    `json:"id"`
	PolicyName        *string                                   `json:"policy_name,omitempty"`
	RetentionLength   *string                                   `json:"retention_length,omitempty"`
	Type              RetentionPolicyMiniTypeEnum               `json:"type"`
}
