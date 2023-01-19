package shared

import (
	"time"
)

type SignRequestSignerRoleEnum string

const (
	SignRequestSignerRoleEnumSigner          SignRequestSignerRoleEnum = "signer"
	SignRequestSignerRoleEnumApprover        SignRequestSignerRoleEnum = "approver"
	SignRequestSignerRoleEnumFinalCopyReader SignRequestSignerRoleEnum = "final_copy_reader"
)

type SignRequestSignerSignerDecisionTypeEnum string

const (
	SignRequestSignerSignerDecisionTypeEnumSigned   SignRequestSignerSignerDecisionTypeEnum = "signed"
	SignRequestSignerSignerDecisionTypeEnumDeclined SignRequestSignerSignerDecisionTypeEnum = "declined"
)

// SignRequestSignerSignerDecision
// Final decision made by the signer
type SignRequestSignerSignerDecision struct {
	FinalizedAt *time.Time                               `json:"finalized_at,omitempty"`
	Type        *SignRequestSignerSignerDecisionTypeEnum `json:"type,omitempty"`
}

// SignRequestSignerOutput
// The schema for a Signer in a POST Sign Request request body
type SignRequestSignerOutput struct {
	DeclinedRedirectURL     *string                          `json:"declined_redirect_url,omitempty"`
	Email                   string                           `json:"email"`
	EmbedURL                *string                          `json:"embed_url,omitempty"`
	EmbedURLExternalUserID  *string                          `json:"embed_url_external_user_id,omitempty"`
	HasViewedDocument       *bool                            `json:"has_viewed_document,omitempty"`
	Inputs                  []SignRequestSignerInput         `json:"inputs,omitempty"`
	IsInPerson              *bool                            `json:"is_in_person,omitempty"`
	LoginRequired           *bool                            `json:"login_required,omitempty"`
	Order                   *int64                           `json:"order,omitempty"`
	RedirectURL             *string                          `json:"redirect_url,omitempty"`
	Role                    *SignRequestSignerRoleEnum       `json:"role,omitempty"`
	SignerDecision          *SignRequestSignerSignerDecision `json:"signer_decision,omitempty"`
	VerificationPhoneNumber *string                          `json:"verification_phone_number,omitempty"`
}
