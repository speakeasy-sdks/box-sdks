package shared

import (
	"time"
)

// SignRequestSignFiles
// List of files that will be signed, which are copies of the original
// source files. A new version of these files are created as signers sign
// and can be downloaded at any point in the signing process.
type SignRequestSignFiles struct {
	Files              []FileMini `json:"files,omitempty"`
	IsReadyForDownload *bool      `json:"is_ready_for_download,omitempty"`
}

type SignRequestSignatureColorEnum string

const (
	SignRequestSignatureColorEnumBlue  SignRequestSignatureColorEnum = "blue"
	SignRequestSignatureColorEnumBlack SignRequestSignatureColorEnum = "black"
	SignRequestSignatureColorEnumRed   SignRequestSignatureColorEnum = "red"
)

type SignRequestStatusEnum string

const (
	SignRequestStatusEnumConverting          SignRequestStatusEnum = "converting"
	SignRequestStatusEnumCreated             SignRequestStatusEnum = "created"
	SignRequestStatusEnumSent                SignRequestStatusEnum = "sent"
	SignRequestStatusEnumViewed              SignRequestStatusEnum = "viewed"
	SignRequestStatusEnumSigned              SignRequestStatusEnum = "signed"
	SignRequestStatusEnumCancelled           SignRequestStatusEnum = "cancelled"
	SignRequestStatusEnumDeclined            SignRequestStatusEnum = "declined"
	SignRequestStatusEnumErrorConverting     SignRequestStatusEnum = "error_converting"
	SignRequestStatusEnumErrorSending        SignRequestStatusEnum = "error_sending"
	SignRequestStatusEnumExpired             SignRequestStatusEnum = "expired"
	SignRequestStatusEnumDownloaded          SignRequestStatusEnum = "downloaded"
	SignRequestStatusEnumSignedAndDownloaded SignRequestStatusEnum = "signed and downloaded"
)

type SignRequestTypeEnum string

const (
	SignRequestTypeEnumSignRequest SignRequestTypeEnum = "sign-request"
)

// SignRequestOutput
// A request to create a sign request object
type SignRequestOutput struct {
	AreRemindersEnabled               *bool                          `json:"are_reminders_enabled,omitempty"`
	AreTextSignaturesEnabled          *bool                          `json:"are_text_signatures_enabled,omitempty"`
	AutoExpireAt                      *time.Time                     `json:"auto_expire_at,omitempty"`
	DaysValid                         *int64                         `json:"days_valid,omitempty"`
	DeclinedRedirectURL               *string                        `json:"declined_redirect_url,omitempty"`
	EmailMessage                      *string                        `json:"email_message,omitempty"`
	EmailSubject                      *string                        `json:"email_subject,omitempty"`
	ExternalID                        *string                        `json:"external_id,omitempty"`
	ID                                *string                        `json:"id,omitempty"`
	IsDocumentPreparationNeeded       *bool                          `json:"is_document_preparation_needed,omitempty"`
	IsPhoneVerificationRequiredToView *bool                          `json:"is_phone_verification_required_to_view,omitempty"`
	Name                              *string                        `json:"name,omitempty"`
	ParentFolder                      FolderMini                     `json:"parent_folder"`
	PrefillTags                       []SignRequestPrefillTag        `json:"prefill_tags,omitempty"`
	PrepareURL                        *string                        `json:"prepare_url,omitempty"`
	RedirectURL                       *string                        `json:"redirect_url,omitempty"`
	SignFiles                         *SignRequestSignFiles          `json:"sign_files,omitempty"`
	SignatureColor                    *SignRequestSignatureColorEnum `json:"signature_color,omitempty"`
	Signers                           []SignRequestSignerOutput      `json:"signers"`
	SigningLog                        *FileMini                      `json:"signing_log,omitempty"`
	SourceFiles                       []FileBase                     `json:"source_files"`
	Status                            *SignRequestStatusEnum         `json:"status,omitempty"`
	Type                              *SignRequestTypeEnum           `json:"type,omitempty"`
}
