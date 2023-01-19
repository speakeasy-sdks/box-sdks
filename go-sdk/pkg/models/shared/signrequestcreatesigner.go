package shared

type SignRequestCreateSignerRoleEnum string

const (
	SignRequestCreateSignerRoleEnumSigner          SignRequestCreateSignerRoleEnum = "signer"
	SignRequestCreateSignerRoleEnumApprover        SignRequestCreateSignerRoleEnum = "approver"
	SignRequestCreateSignerRoleEnumFinalCopyReader SignRequestCreateSignerRoleEnum = "final_copy_reader"
)

// SignRequestCreateSigner
// The schema for a Signer in a POST Sign Request request body
type SignRequestCreateSigner struct {
	DeclinedRedirectURL     *string                          `json:"declined_redirect_url,omitempty"`
	Email                   string                           `json:"email"`
	EmbedURLExternalUserID  *string                          `json:"embed_url_external_user_id,omitempty"`
	IsInPerson              *bool                            `json:"is_in_person,omitempty"`
	LoginRequired           *bool                            `json:"login_required,omitempty"`
	Order                   *int64                           `json:"order,omitempty"`
	Password                *string                          `json:"password,omitempty"`
	RedirectURL             *string                          `json:"redirect_url,omitempty"`
	Role                    *SignRequestCreateSignerRoleEnum `json:"role,omitempty"`
	VerificationPhoneNumber *string                          `json:"verification_phone_number,omitempty"`
}
